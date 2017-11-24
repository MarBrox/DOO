
<%-- 
    Document   : login
    Created on : 23/11/2017, 04:41:02 PM
    Author     : mario
--%>

<%
    if(session.getAttribute("usuario") != null)
        response.sendRedirect("index.jsp");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    
    <title>Formulario</title>
    <meta charset="utf-8">
    <link type="text/css" href="css/style.css" rel="stylesheet" />
</head>
 
<body>
    <div id="registrar">
        <a href="registro.jsp">Registrarse</a>
    </div>

 <img src="images/vision.jpg" class="fondo">


 <!-- fin opcion-->
 
    <div id="envoltura">
        <div id="contenedor">
 
            <div id="cabecera" >
                <img src="images/logo.gif" class="imagen">
            </div>
 
            <div id="cuerpo">
                <form id="form-login" action="Login" method="post">
                    <!--A saber, el atributo for funciona como el id.-->
                    <!--ejemplo <label for="usuario">Usuario:</label>-->
                    <!--required es nuevo en html5, si el campo est� vac�o te avisa, pero cuidado, no valida la informaci�n-->
                    <p><label >Usuario:</label></p>
                        <input name="nickname" type="text" id="nombre" placeholder="Escribe tu nombre" >
                        <p><br></p>
                    <p><label>Contraseña:</label></p>
                        <input name="password" type="password" id="pass" placeholder="Escribe tu contraseña">
 
                    <p id="bot"><input type="submit" id="boton" name="submit" value="Iniciar Sesion" class="boton"></p>
                </form>
            </div><!--fin cuerpo-->
 
            <div id="pie">Sistema de Login Y Registro</div>
        </div><!-- fin contenedor -->
    </div><!--fin envoltura-->
</body>
 
</html>