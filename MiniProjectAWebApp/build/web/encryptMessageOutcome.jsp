<%-- 
    Document   : encryptMessageOutcome
    Created on : 15 Jun 2025, 7:01:43 PM
    Author     : morak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encrypt Message Outcome Page</title>
    </head>
    <body>
        <h1>Encrypt Message Outcome</h1>
        <%
            String compName = (String)pageContext.getServletContext().getInitParameter("compName");
            String name = (String)session.getAttribute("name");
            String message = (String)session.getAttribute("encrypt");
        %>
        <p>
            Hi <%=name%> It's <%=compName%> again <br>
            your message has been encrypted.<br>
        </p>
        <ul><a href="SaveMessage.jsp">Save encrypted message</a></ul>
        <ul><a href="menu.jsp">go back to menu</a></ul>
        <ul><a href="index.html">Go back to home page</a></ul>
    </body>
</html>
