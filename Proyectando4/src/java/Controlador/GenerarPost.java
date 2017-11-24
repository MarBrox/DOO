/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenerarPost extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException, ClassNotFoundException, SQLException {
	
	String IDPost = request.getParameter("id");
	
	String driverName = "org.apache.derby.jdbc.ClientDriver";
	String connectionUrl = "jdbc:derby://localhost:1527/MARIO";
	String dbName = "MARIO";
	String userId = "Mario";
	String password = "bronx";
	
	Class.forName(driverName);
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	String title = "";
	String content = "";
	String author = "";
	
	try{
	connection = DriverManager.getConnection(connectionUrl, userId, password);
	statement = connection.createStatement();
	String sql = "select * FROM ARTICULOV1 where ID_PUBLICACION=" + IDPost;
	resultSet = statement.executeQuery(sql);
	    while(resultSet.next()){
		title = resultSet.getString("TITULO");
		content = resultSet.getString("CONTENIDO");
		author = resultSet.getString("AUTOR");
		
	    }
	}catch(SQLException e){
	    out.println("ERROR");
	}
	
	RequestDispatcher rd = request.getRequestDispatcher("/Encabezado.jsp");
	rd.include(request,response);
	
	try (PrintWriter out = response.getWriter()) {
		response.setContentType("text/html; charset=utf-8");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + title + "</h1>");
		out.println("<h2>Por: " + author + "</h2>");
		out.println("<p>" + content + "</p>");
		out.println("</body>");
		out.println("</html>");
	}catch(Exception x){
	    
	}
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
	} catch (ClassNotFoundException ex) {
	    Logger.getLogger(GenerarPost.class.getName()).log(Level.SEVERE, null, ex);
	} catch (SQLException ex) {
	    Logger.getLogger(GenerarPost.class.getName()).log(Level.SEVERE, null, ex);
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
	} catch (ClassNotFoundException ex) {
	    Logger.getLogger(GenerarPost.class.getName()).log(Level.SEVERE, null, ex);
	} catch (SQLException ex) {
	    Logger.getLogger(GenerarPost.class.getName()).log(Level.SEVERE, null, ex);
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
