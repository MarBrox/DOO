<%-- 
    Document   : registro
    Created on : 23/11/2017, 04:56:32 PM
    Author     : mario
--%>

<%
    if(session.getAttribute("usuario") != null)
        response.sendRedirect("login.jsp");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario</title>
    <meta charset="utf-8">
    <link type="text/css" href="css1/style.css" rel="stylesheet" />
</head>
 
<body>
<img src="images/vision.jpg" class="fondo">
    <div id="registrar">
        <a href="index.jsp">Regresar</a>
    </div>
    <div id="envoltura">
        <div id="contenedor">
 
            <div id="cabecera">
                <img id="imagen" src="images/logo.gif" class="imagen2">
            </div>
 
            <div id="cuerpo">
 
                <form id="form-login" action="RegistroDAO" method="post" >
		
                    <p><label for="nombre">Nombre:</label></p>
                        <input name="nombre" type="text" id="nombre" class="nombre" placeholder="Escribe tu nombre" autofocus=""/ >
 
                    
 
                    <p><label for="pass">Password:</label></p>
                        <input name="pass" type="password" id="pass" class="pass" placeholder="Escribe tu contraseña"/ >
 
                    <p id="bot"><input name="enviar" type="submit" id="boton" value="Registrar"/></p>
                </form>
            </div>
 
            <div id="pie">Sistema de Login Y Registro</div>
        </div><!-- fin contenedor -->
 
    </div>
 
</body>
 
</html>
