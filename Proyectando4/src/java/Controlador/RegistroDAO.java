/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package Controlador;

import Modelo.AESCrypt;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistroDAO extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

	String nombre = request.getParameter("nombre");
	String pass = request.getParameter("pass");
	
	String driverName = "org.apache.derby.jdbc.ClientDriver";
	String connectionUrl = "jdbc:derby://localhost:1527/MARIO";
	String dbName = "MARIO";
	String userId = "Mario";
	String password = "bronx";
	
	String encryptedPassword = AESCrypt.encrypt(pass);

	try {
	Class.forName(driverName);
	} catch (ClassNotFoundException ex) {
	    System.out.println("Driver No Encontrado");
	}

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	try{
	    connection = DriverManager.getConnection(connectionUrl, userId, password);
	    statement = connection.createStatement();
	    statement.executeUpdate("INSERT INTO USUARIOSV1(NICKNAME, PASSWORD) VALUES('" + nombre +"','" + encryptedPassword + "')");
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	
	response.sendRedirect("principal.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	try {
	    processRequest(request, response);
	} catch (Exception ex) {
	    Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
	}
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	try {
	    processRequest(request, response);
	} catch (Exception ex) {
	    Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
	}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
