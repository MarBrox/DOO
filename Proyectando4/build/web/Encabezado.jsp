
<!DOCTYPE html>
<html>
    <head>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/Encabezado.css">
<link rel="icon" href="https://image.freepik.com/free-icon/afro-hair-look-combined-with-rounded-circular-glasses_318-29821.jpg">
<%
    String redirectURL = "principal.jsp";
    response.sendRedirect(redirectURL);
%>


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
	<div id="BarraNavegacion">
	    <ul>
		<li><a href="principal.jsp">Posts</a></li>


		<%
		    if(session.getAttribute("usuario") == null){
		    %>
		<li><a href="login.jsp">Iniciar Sesión</a></li>
		<%
		    }else{
		    %>
		<li><a>USUARIO: <%=session.getAttribute("usuario")%> ( <%=session.getAttribute("tipo")%> )</a></li>
		<li><a>IMG: <img src="<%=session.getAttribute("fotoPerfil")%>"  height="16" width="16"></a></li>
		<li><a href="<%=request.getContextPath()%>/LogOut?id=<%=session.getAttribute("usuario")%>">Cerrar Sesión</a></li>
		<%
		    }
		    %>
	    </ul>
	</div>
        
    </body>
</html>
