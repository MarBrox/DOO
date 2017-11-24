

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="Encabezado.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Formulario de Registro</h1>
	<form action="RegistroDAO" method="post">
	    <label>Nombre:</label>
	    <input name="nombre" type="text" id="nombre" placeholder="Escribe tu nombre">
	    <br>
	    <label>Contraseña:</label>
	    <input name="pass" type="password" id="pass" placeholder="Escribe tu contraseña">
	    <br>
	    <input name="enviar" type="submit" id="boton" value="Registrar">
	</form>
    </body>
</html>
