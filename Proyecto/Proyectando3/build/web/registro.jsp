<%-- 
    Document   : registro
    Created on : 12/11/2017, 09:18:41 PM
    Author     : mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="css/style.css" rel="stylesheet" />
        <title> JSP REGISTRO </title>
    </head>
    <body>
    <img src="images/vision.jpg" class="fondo">
    <div id="registrar">
        <a href="index.html">Regresar</a>
    </div>
    <div id="envoltura">
        <div id="contenedor">
 
            <div id="cabecera">
                <img id="imagen" src="images/logo.gif" class="imagen2">
            </div>
 
            <div id="cuerpo">
 
                <form id="form-login" action="RegistroDAO" method="post" >
		
                    <p><label for="nombre">Nombre:</label></p>
                        <input name="nombre" type="text" id="nombre" class="nombre" placeholder="Escribe tu nombre" autofocus=""/>
                        
                    <!--=============================================================================================-->
                    <!--La sisguientes 2 l�neas son para agregar campos al formulario con sus respectivos labels-->
                    <!--Puedes usar tantas como necesites-->
                    <p><label for="apellidos">Apellidos:</label></p>
                        <input name="apellidos" type="text" id="apellidos" class="apellidos" placeholder="Escribe tus apellidos" />
 
                    <p><label for="correo">Correo:</label></p>
                        <input name="correo" type="text" id="correo" class="correo" placeholder="Escribe tu mail" />
 
                    <p><label for="pass">Password:</label></p>
                        <input name="pass" type="password" id="pass" class="pass" placeholder="Escribe tu contraseña"/>
 
                    <p><label for="repass">Repetir Password:</label></p>
                        <input name="repass" type="password" id="repass" class="repass" placeholder="Repite tu contraseña" />
 
                    <p id="bot"><input name="submit" type="submit" id="boton" value="Registrar" class="boton"/></p>
                </form>
            </div>
            <div id="pie">Sistema de Login Y Registro</div>
        </div><!-- fin contenedor -->

    </div>
    </body>
</html>
