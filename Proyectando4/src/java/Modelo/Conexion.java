/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Adrián Alejandro
 */
public class Conexion {
    
    private static String driverName = "org.apache.derby.jdbc.ClientDriver";
    private static String host = "jdbc:derby://localhost:1527/MARIO";
    private static String username = "Mario";
    private static String password = "bronx";
    
    private String query = "SELECT * FROM ARTICULOV1";
    
    private static Connection conexion = null;
    Statement stmt = null;
    public static ResultSet resultSet = null;
    
    public void establecerBusqueda(String query){
	this.query = query;
    }
    
    public static Connection establecerConexion(){
	try{
	    Class.forName(driverName);
	    try{
		conexion = DriverManager.getConnection(host, username, password);
	    }catch(SQLException ex){
		System.out.println("Falla al conectar con la base de datos");
	    }
	}catch(ClassNotFoundException ex){
	    System.out.println("Driver no encontrado");
    }	
	return conexion;	
    }
        
    public static ResultSet obtenerResultados(String query) throws SQLException{
	Connection con = establecerConexion();
	PreparedStatement st = con.prepareStatement(query);
	resultSet = st.executeQuery();
	return resultSet;	
    }
}
