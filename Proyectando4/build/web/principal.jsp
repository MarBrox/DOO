
<!DOCTYPE html>
<html>
    <head>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/Principal.css">
<jsp:include page="Encabezado.jsp" />

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
	    <%try{
		%>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido a Blog!</title>
    </head>
    <body>
        <h1>Últimas Noticias</h1>
        <%
String driverName = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/MARIO";
String dbName = "MARIO";
String userId = "Mario";
String password = "bronx";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
	<div id="tablaPosts">
	    <table>
		<tr>
		    <td><b>Título del Artículo</b></td>
    <%
    if(session.getAttribute("tipo").equals("administrador")){%>
		    <td><b>MOD</b></td>
    <%
	    }else{
	    }
	%>			
		    <td><b>Fecha de Publicación</b></td>
		    <td><b>Autor</b></td>
		    <td><b><a href="nuevoArticulo.jsp">Agregar Nueva Publicación</a></b></td>						
		</tr>
		<%
    try{
    connection = DriverManager.getConnection(connectionUrl, userId, password);
    statement = connection.createStatement();
    String sql = "SELECT * FROM ARTICULOV1";

    resultSet = statement.executeQuery(sql);
    while (resultSet.next()) {
    %>
		<tr>
		    <td><a href="<%=request.getContextPath()%>/GenerarPost?id=<%=resultSet.getString("ID_PUBLICACION")%>"><%=resultSet.getString("TITULO")%></a></td>
		    <%
    if(session.getAttribute("tipo").equals("administrador")){%>
		    <td>
			<a href="<%=request.getContextPath()%>/EliminarArticulo?id=<%=resultSet.getString("ID_PUBLICACION")%>">✖</a>
			<a href="">✓</a>
		    </td>
		    <%
		    }else{
		    }
		    %>
		    <td><%=resultSet.getString("FECHA")%></td>
		    <td><%=resultSet.getString("AUTOR")%></td>
		</tr>
		<%
    }
    } catch (Exception e) {
    e.printStackTrace();
    }
    %>
	    </table>
	</div>
    </body>
</html>
<%
}catch(Exception EX){
    response.sendRedirect("login.jsp");
}
%>