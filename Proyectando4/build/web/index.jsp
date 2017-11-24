<%-- 
    Document   : index
    Created on : 23/11/2017, 04:41:02 PM
    Author     : mario
--%>

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
            <img src="img1.jpg" alt="" class="info__img">
            <h2 class="info__titulo">Título 1</h2>
            <p class="info__txt">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum aut, incidunt aperiam dicta totam cumque.</p>
          </article>
          <article class="info__columna">
            <img src="img1.jpg" alt="" class="info__img">
            <h2 class="info__titulo">Título 2</h2>
            <p class="info__txt">Expedita totam, minima praesentium suscipit excepturi ducimus repellat harum ab, inventore neque cum! Nostrum, dicta!</p>
          </article>
          <article class="info__columna">
            <img src="img1.jpg" alt="" class="info__img">
            <h2 class="info__titulo">Título 3</h2>
            <p class="info__txt">Molestiae odit quas officia, dicta, nobis dolorem, quaerat eveniet accusantium excepturi est quidem, ducimus doloremque?</p>
          </article>
        </section>
        <section class="cursos">
          <h2 class="section__titulo">Nuestros cursos</h2>
          <div class="cursos__columna">
            <img src="img2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">Programación</h2>
              <div class="cursos__txt">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa, dignissimos.</div>
            </div>
          </div>
          <div class="cursos__columna">
            <img src="img2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">Diseño Web</h2>
              <div class="cursos__txt">Accusantium rem quia doloribus soluta ullam pariatur alias, quas dolorum.</div>
            </div>
          </div>
          <div class="cursos__columna">
            <img src="img2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">Diseño grafico</h2>
              <div class="cursos__txt">Voluptates aspernatur magnam possimus natus, et nemo maxime sed vitae!</div>
            </div>
          </div>
          <div class="cursos__columna">
            <img src="img2.jpg" alt="" class="cursos__img">
            <div class="cursos__descripcion">
              <h2 class="cursos__titulo">Rhinoceros</h2>
              <div class="cursos__txt">Nulla, cumque sunt laudantium blanditiis deserunt, error dolores vero iure.</div>
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
