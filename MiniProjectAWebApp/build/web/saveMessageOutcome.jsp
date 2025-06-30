<%-- 
    Document   : saveMessageOutcome
    Created on : 16 Jun 2025, 12:08:41 PM
    Author     : morak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>save Message Outcome</title>
    </head>
    <body>
        <h1>save Message Outcome</h1>
        <%
            String compName = (String)pageContext.getServletContext().getInitParameter("compName");
            String name = (String)session.getAttribute("name");
            String message = (String)session.getAttribute("encrypt");
        %>
        <p>
            Hi <%=name%> It's <%=compName%> again <br>
            your message has been saved<br>
        </p>
        <ul><a href="menu.jsp">go back to menu</a></ul>
        <ul><a href="index.html">Go back to home page</a></ul>
        <ul><a href="LogoutServelt.do">Logout</a></ul>
    </body>
</html>
