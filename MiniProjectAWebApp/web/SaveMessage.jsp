<%-- 
    Document   : SaveMessage
    Created on : 16 Jun 2025, 2:08:18 AM
    Author     : morak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Save Message</title>
    </head>
    <body>
        <h1>Save Message</h1>
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
        <form action="SaveMessageServlet.do" method="POST">
            <label>Message</label>
            <br>
            <textarea type="text" name="message" required="" row="25" cols="25" disabled="">
                <%=message%>
            </textarea>
            <br>
            <button type="submit">Save</button>
        </form>
        <ul><a href="menu.jsp">go back to menu</a></ul>
        <ul><a href="index.html">Go back to home page</a></ul>
    </body>
</html>
