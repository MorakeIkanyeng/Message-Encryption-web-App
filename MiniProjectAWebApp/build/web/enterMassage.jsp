<%-- 
    Document   : enterMassage
    Created on : 13 Jun 2025, 4:45:20 PM
    Author     : morak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Massage Page</title>
    </head>
    <body>
        <h1>Enter Massage</h1>
        <%
            String compName = (String)pageContext.getServletContext().getInitParameter("compName");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Hi <%=name%> It's <%=compName%> again <br>
            Please enter your Message below.
        </p>
        <form action="EnterMassageServlet.do" method="POST">
            <label>Message</label>
            <br>
            <textarea type="text" name="message" required="" row="25" cols="25">
            </textarea>
            <br>
            <button type="submit">Submit</button>
        </form>
        
    </body>
</html>
