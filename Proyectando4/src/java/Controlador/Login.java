/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.AESCrypt;
import java.io.IOException;
import static java.lang.System.out;
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
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException, SQLException, ClassNotFoundException, Exception {
	
	String userID = request.getParameter("nickname");
	String password = request.getParameter("password");
	
	String encryptedPassword = AESCrypt.encrypt(password);
	
	Class.forName("org.apache.derby.jdbc.ClientDriver");
	Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MARIO","Mario","bronx");
	Statement st = con.createStatement();
	ResultSet rs;
	rs = st.executeQuery("select * from USUARIOSV1 where NICKNAME='" + userID + "' and PASSWORD='" + encryptedPassword + "'");
	
	HttpSession session = request.getSession();
	if (rs.next()) {
	    session.setAttribute("usuario", userID);
	    session.setAttribute("fotoPerfil", rs.getString("FOTO_PERFIL"));
	    session.setAttribute("tipo", rs.getString("TIPO_USUARIO"));
	    //out.println("welcome " + userid);
	    //out.println("<a href='logout.jsp'>Log out</a>");
	    response.sendRedirect("index.jsp");
	} else {
	    out.println("Invalid password <a href='login.jsp'>try again</a>");
	    response.sendRedirect("login.jsp");
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
	} catch (Exception ex) {
	    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
	    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
