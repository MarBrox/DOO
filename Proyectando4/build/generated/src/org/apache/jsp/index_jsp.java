package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<link href=\"css/icons.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/estilos.css\" rel=\"stylesheet\">\n");
      out.write("    <header class=\"header\">\n");
      out.write("      <div class=\"contenedor\">\n");
      out.write("        <h1 class=\"logo\">PROYECTANDO 3</h1>\n");
      out.write("        <span class=\"icon-menu\" id=\"btn-menu\"></span>\n");
      out.write("        <nav class=\"nav\" id=\"nav\">\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("            <li class=\"menu__item\"><a href=\"login.jsp\" class=\"menu__link select\">Iniciar Sesion</a></li>\n");
      out.write("            <li class=\"menu__item\"><a href=\"registro.jsp\" class=\"menu__link\">Registrarse</a></li>\n");
      out.write("            <li class=\"menu__item\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/LogOut?id=");
      out.print(session.getAttribute("usuario"));
      out.write("\">Cerrar Sesión</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"banner\">\n");
      out.write("     <img src=\"background-1.jpg\" alt=\"\">\n");
      out.write("      <div class=\"contenedor\">\n");
      out.write("        <h2 class=\"banner__titulo\">La mejor educación a tu alcance</h2>\n");
      out.write("        <p class=\"banner__txt\">Estudia con nosotros y alcanza tus sueños</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <main class=\"main\">\n");
      out.write("      <div class=\"contenedor\">\n");
      out.write("        <section class=\"info\">\n");
      out.write("          <article class=\"info__columna\">\n");
      out.write("            <img src=\"img1.jpg\" alt=\"\" class=\"info__img\">\n");
      out.write("            <h2 class=\"info__titulo\">Título 1</h2>\n");
      out.write("            <p class=\"info__txt\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum aut, incidunt aperiam dicta totam cumque.</p>\n");
      out.write("          </article>\n");
      out.write("          <article class=\"info__columna\">\n");
      out.write("            <img src=\"img1.jpg\" alt=\"\" class=\"info__img\">\n");
      out.write("            <h2 class=\"info__titulo\">Título 2</h2>\n");
      out.write("            <p class=\"info__txt\">Expedita totam, minima praesentium suscipit excepturi ducimus repellat harum ab, inventore neque cum! Nostrum, dicta!</p>\n");
      out.write("          </article>\n");
      out.write("          <article class=\"info__columna\">\n");
      out.write("            <img src=\"img1.jpg\" alt=\"\" class=\"info__img\">\n");
      out.write("            <h2 class=\"info__titulo\">Título 3</h2>\n");
      out.write("            <p class=\"info__txt\">Molestiae odit quas officia, dicta, nobis dolorem, quaerat eveniet accusantium excepturi est quidem, ducimus doloremque?</p>\n");
      out.write("          </article>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"cursos\">\n");
      out.write("          <h2 class=\"section__titulo\">Nuestros cursos</h2>\n");
      out.write("          <div class=\"cursos__columna\">\n");
      out.write("            <img src=\"img2.jpg\" alt=\"\" class=\"cursos__img\">\n");
      out.write("            <div class=\"cursos__descripcion\">\n");
      out.write("              <h2 class=\"cursos__titulo\">Programación</h2>\n");
      out.write("              <div class=\"cursos__txt\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa, dignissimos.</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"cursos__columna\">\n");
      out.write("            <img src=\"img2.jpg\" alt=\"\" class=\"cursos__img\">\n");
      out.write("            <div class=\"cursos__descripcion\">\n");
      out.write("              <h2 class=\"cursos__titulo\">Diseño Web</h2>\n");
      out.write("              <div class=\"cursos__txt\">Accusantium rem quia doloribus soluta ullam pariatur alias, quas dolorum.</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"cursos__columna\">\n");
      out.write("            <img src=\"img2.jpg\" alt=\"\" class=\"cursos__img\">\n");
      out.write("            <div class=\"cursos__descripcion\">\n");
      out.write("              <h2 class=\"cursos__titulo\">Diseño grafico</h2>\n");
      out.write("              <div class=\"cursos__txt\">Voluptates aspernatur magnam possimus natus, et nemo maxime sed vitae!</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"cursos__columna\">\n");
      out.write("            <img src=\"img2.jpg\" alt=\"\" class=\"cursos__img\">\n");
      out.write("            <div class=\"cursos__descripcion\">\n");
      out.write("              <h2 class=\"cursos__titulo\">Rhinoceros</h2>\n");
      out.write("              <div class=\"cursos__txt\">Nulla, cumque sunt laudantium blanditiis deserunt, error dolores vero iure.</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("      <div class=\"contenedor\">\n");
      out.write("        <div class=\"social\">\n");
      out.write("          <a href=\"#\" class=\"icon-facebook\"></a>\n");
      out.write("          <a href=\"#\" class=\"icon-twitter\"></a>\n");
      out.write("          <a href=\"#\" class=\"icon-gplus\"></a>\n");
      out.write("          <a href=\"#\" class=\"icon-vine\"></a>\n");
      out.write("        </div>\n");
      out.write("        <p class=\"copy\">&copy; PROYECTANDO 3 - Todos los derechos </p>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"js/menu.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
