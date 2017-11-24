<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<link href="css/icons.css" rel="stylesheet">
<link href="css/estilos.css" rel="stylesheet">
    <header class="header">
      <div class="contenedor">
        <h1 class="logo">PROYECTANDO 3</h1>
        <span class="icon-menu" id="btn-menu"></span>
        <nav class="nav" id="nav">
          <ul class="menu">
            <li class="menu__item"><a href="login.jsp" class="menu__link select">Iniciar Sesion</a></li>
            <li class="menu__item"><a href="registro.jsp" class="menu__link">Registrarse</a></li>
            <li class="menu__item"><a href="<%=request.getContextPath()%>/LogOut?id=<%=session.getAttribute("usuario")%>" class="menu__link" >Cerrar Sesión</a></li>
          </ul>
        </nav>
      </div>
    </header>
    <div class="banner">
     <img src="background-1.jpg" alt="">
      <div class="contenedor">
        <h2 class="banner__titulo"><br>Qué es el P&L en finanzas y empresas</h2>
        <p class="banner__txt"><br><br>Si has estado en el área de finanzas o administración, seguro has escuchado el término P&L (Profit and Loss, por sus siglas en inglés),<br> y que no es otra cosa que un estado de utilidades y pérdidas.


En contabilidad este documento o informe se conoce como estado de resultados, y básicamente muestra la utilidad o pérdida de un periodo determinado, ya sea de una <br>empresa o de varias empresas como grupo o fusiones.</p>
      </div>
    </div>
    
    <footer class="footer">
      <div class="contenedor">
        <div class="social">
          <a href="#" class="icon-facebook"></a>
          <a href="#" class="icon-twitter"></a>
          <a href="#" class="icon-gplus"></a>
          <a href="#" class="icon-vine"></a>
        </div>
        <p class="copy">&copy; PROYECTANDO 3 - Todos los derechos </p>
      </div>
    </footer>
    <script src="js/menu.js"></script>
  </body>
</html>
