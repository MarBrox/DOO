

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrar Usuarios</title>
    </head>
    <body>	
        <h1>Eliminar Usuarios</h1>
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
	<table>
		    <tr>
			<td><b>Título del Artículo</b></td>
			<td><b>Fecha de Publicación</b></td>
			<td><b>Autor</b></td>
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
    </body>
</html>
