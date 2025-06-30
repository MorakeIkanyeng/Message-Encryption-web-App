<%-- 
    Document   : ViewLongestMessageOutcome
    Created on : 16 Jun 2025, 6:59:16 PM
    Author     : morak
--%>

<%@page import="java.util.Date"%>
<%@page import="za.ac.tut.bl.MassageManager"%>
<%@page import="za.ac.tut.bl.MessageInterface"%>
<%@page import="za.ac.tut.entity.MiniProject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Longest Message Outcome Page</title>
    </head>
    <body>
        <h1>View Longest Message Outcome</h1>
        <%
            String compName = (String)pageContext.getServletContext().getInitParameter("compName");
            String name = (String)session.getAttribute("name");
            MiniProject proj = (MiniProject)request.getAttribute("proj");
            Long id = proj.getId();
            String msg = proj.getMessage();
            MessageInterface message = new MassageManager();
            String decrypted = message.decrypt(msg);
            int len = proj.getLength();
            Date date = proj.getTimestamp();
        %>
        <p>
            Hi <%=name%> It's <%=compName%> again <br>
            below are the messages<br>
        </p>
        <table>
            <thead>Id</thead>
            <thead>Message</thead>
            <thead>Length</thead>
            <thead>date</thead>
            <tr>
                <td><%=id%></td>
                <td><%=decrypted%></td>
                <td><%=len%></td>
                <td><%=date%></td>
            </tr>
        </table>
        <ul><a href="menu.jsp">go back to menu</a></ul>
        <ul><a href="index.html">Go back to home page</a></ul>
        <ul><a href="LogoutServelt.do">Logout</a></ul>
    </body>
</html>
