

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
        <h2 class="banner__titulo">La mejor educación a tu alcance</h2>
        <p class="banner__txt">Estudia con nosotros y alcanza tus sueños</p>
      </div>
    </div>
    <main class="main">
      <div class="contenedor">
        <section class="info">
          <article class="info__columna">
            <img src="nota1.jpg" alt="" class="info__img">
            <h2 class="info__titulo">QUE ES EL P&L EN FINANZAS Y EMPRESAS</h2>
            <p class="info__txt">Si has estado en el área de finanzas o administración, seguro has escuchado el término P&L (Profit and Loss, por sus siglas en inglés), y que no es otra cosa que un estado de utilidades y pérdidas.</p>
          <a href="NOTICIA1.jsp">VER MAS</a>
          </article>
          <article class="info__columna">
            <img src="nota2.jpg" alt="" class="info__img">
            <h2 class="info__titulo">¿CÓMO NO TOMAR DECISIONES DE DINERO?</h2>
            <p class="info__txt">Muchas veces me he sentido aterrorizado de personas que toman decisiones de dinero sin saber lo que están haciendo. O que hablan sin saber lo que dicen.</p>
           <a href="NOTICIA 2.jsp">VER MAS</a>
          </article>
          <article class="info__columna">
            <img src="img3.jpg" alt="" class="info__img">
            <h2 class="info__titulo">¿SOMOS TAN POBRES COMO CREEMOS? </h2>
            <p class="info__txt">¿Cuántas veces hemos escuchado a las personas decir que no les alcanza el dinero? ¿Cuántas veces lo hemos dicho nosotros mismos? “Si tuviera más dinero”, “si no tuviera tantos gastos”</p>
            <a href="NOTICIA 3.jsp">VER MAS</a>
          </article>
        </section>
        <section class="cursos">
          <h2 class="section__titulo">Nuestros cursos</h2>
          <div class="cursos__columna">
            <img src="img2.2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">NEGOCIA</h2>
              <div class="cursos__txt">COMUNICATE</div>
            </div>
          </div>
          <div class="cursos__columna">
            <img src="img2.2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">ADMINISTRATE</h2>
              <div class="cursos__txt">APRENDE</div>
            </div>
          </div>
          <div class="cursos__columna">
            <img src="img2.2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">CALCULA</h2>
              <div class="cursos__txt">INVENTARIO</div>
            </div>
          </div>
          <div class="cursos__columna">
            <img src="img2.2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">GANANCIAS</h2>
              <div class="cursos__txt">IMPLEMENTA</div>
            </div>
          </div>
        </section>
        
      </div>
    </main>
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
