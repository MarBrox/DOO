
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="Encabezado.jsp" />

<%
		if(session.getAttribute("usuario") == null){
		    response.sendRedirect("login.jsp");
		}
		%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Publicación</title>
    </head>
    <body>
        <h1>Añadir Nueva Publicación</h1>
	<form action="AgregarArticulo" method="POST">
	    <label>Título: </label>
	    <input name="titulo" type="text" placeholder="Por favor escriba un título">
	    <br>
	    <label>Imagen: </label>
	    <input name="imagen" type="text" placeholder="Inserte la URL de la imagen">
	    <br>
	    <label>Contenido: </label>
	    <textarea name="contenido" stype="width:500px; height:600px">Escriba aquí su contenido</textarea>
	    <br>
	    <input name="enviar" type="submit">
	    <input name="user" type="hidden" value="<%=session.getAttribute("usuario")%>">
	</form>
    </body>
</html>
