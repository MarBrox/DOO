/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AgregarArticulo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */ 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException, SQLException {
	
	String titulo = request.getParameter("titulo");
	String imagen = request.getParameter("imagen");
	String contenido = request.getParameter("contenido");
	String autor = request.getParameter("user");
	
	String fecha = "10/10/2009";
	
	
	int id_publicacion = 0;
		
	String driverName = "org.apache.derby.jdbc.ClientDriver";
	String connectionUrl = "jdbc:derby://localhost:1527/MARIO";
	String userId = "Mario";
	String password = "bronx";
	
	try {
	Class.forName(driverName);
	} catch (ClassNotFoundException ex) {
	    System.out.println("Driver No Encontrado");
	}
	
	ResultSet resultSet = null;
	Connection con;
	Statement stmt;
	/*GENERAR ID PARA NUEVO ARTICULO*/
	try{
	    con = DriverManager.getConnection(connectionUrl, userId, password);
	    stmt = con.createStatement();
	    String sql = "select max(ID_PUBLICACION) as ID from ARTICULOV1";
	    resultSet = stmt.executeQuery(sql);

	    while(resultSet.next()){
		id_publicacion = resultSet.getInt("ID") + 1;		
	    }

	} catch (SQLException e) {
	    System.out.println("Error de SQL, no se pudo establecer la conexión");
	}
	
	out.println(id_publicacion);
	out.println(autor);
	/*CREAR NUEVO ARTICULO*/
	try{
	    con = DriverManager.getConnection(connectionUrl, userId, password);
	    String sql2 = "INSERT INTO ARTICULOV1(TITULO, CONTENIDO, FECHA, AUTOR, ID_PUBLICACION, IMAGEN) VALUES('" + titulo +"','" + contenido + "','" + fecha + "','" + autor + "'," + id_publicacion + ",'" + imagen + "')";
	    Statement stmt2;
	    stmt2 = con.createStatement();
	    stmt2.executeUpdate(sql2);
    
	} catch (SQLException e) {
	    System.out.println("Error de SQL, no se pudo establecer la segunda conexión");
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
	} catch (SQLException ex) {
	    Logger.getLogger(AgregarArticulo.class.getName()).log(Level.SEVERE, null, ex);
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
	} catch (SQLException ex) {
	    Logger.getLogger(AgregarArticulo.class.getName()).log(Level.SEVERE, null, ex);
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
