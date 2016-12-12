<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APMTestJavaEE</title>
    </head>
    <body>
    <div class="serverinfo" >
    	<span >
    	<%
    	out.print("App Server: "+request.getServletContext().getServerInfo());
    	%>
    	</span><br>
    	<span >
    	<%
    	out.print("Server Name: "+request.getServerName());
    	%>
    	</span><br>
    	<span >
    	<%
    	out.print("Port: "+request.getServerPort());
    	%>
    	</span><br>
    	<span >
    	<%
    	out.print("Session: "+request.getSession().getId());
    	%>
    	</span><br>

    </div>
        <h1>Hello World!</h1>
        <ul>
            <li><a href="${pageContext.request.contextPath }/InvokeBookForJPA">InvokeBookForJPA</a></li>
        </ul>
    </body>
</html>
