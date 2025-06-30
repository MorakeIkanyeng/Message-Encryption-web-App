<%-- 
    Document   : enterMessageOutcome
    Created on : 13 Jun 2025, 5:54:30 PM
    Author     : morak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>enter Message Outcome Page</title>
    </head>
    <body>
        <h1>Enter Message Outcome</h1>
        <%
            String compName = (String)pageContext.getServletContext().getInitParameter("compName");
            String name = (String)session.getAttribute("name");
            String message = (String)session.getAttribute("message");
        %>
        <p>
            Hi <%=name%> It's <%=compName%> again <br>
            Below is message you entered.
        </p>
        <form action="EncryptMessageServelt.do" method="POST">
            <label>Message</label>
            <br>
            <textarea type="text" name="message" required="" row="25" cols="25" disabled="">
                <%=message%>
            </textarea>
            <br>
            <button type="submit">Encrypt</button>
        </form>
        <ul><a href="menu.jsp">go back to menu</a></ul>
        <ul><a href="index.html">Go back to home page</a></ul>
    </body>
</html>
