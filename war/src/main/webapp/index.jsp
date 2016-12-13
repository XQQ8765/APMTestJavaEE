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
        <h1>APMTestJavaEE</h1>
        <h3>Entity Bean</h3>
        <ul>
            <li><a href="${pageContext.request.contextPath }/InvokeBookForJPA">InvokeBookForJPA</a></li>
            <li><a href="${pageContext.request.contextPath }/InvokeBookForEJB2EntityBean">InvokeBookForEJB2EntityBean</a></li>
        </ul>
        <h3>Session Bean: EJB2</h3>
        <ul>
            <li><a href="${pageContext.request.contextPath }/InvokeLocalHelloBean?beanJndiName=java:comp/env/com.quest.apm.testjavaee.web.servlet.InvokeLocalHelloBeanWithAnnotation/helloLocalHome">InvokeLocalHelloBean (Stateful Session Bean)</a></li>
            <li><a href="${pageContext.request.contextPath }/InvokeLocalHelloBeanWithAnnotation">InvokeLocalHelloBeanWithAnnotation (Stateful Session Bean)</a></li>
        </ul>
        <h3>Session Bean: EJB3 with annotation</h3>
                <ul>
                    <li><a href="${pageContext.request.contextPath }/InvokeTestStatelessSessionBean?type=local">/InvokeTestStatelessSessionBean?type=local</a></li>
                    <li><a href="${pageContext.request.contextPath }/InvokeTestStatelessSessionBean?type=remote">/InvokeTestStatelessSessionBean?type=remote</a></li>
                </ul>
    </body>
</html>
