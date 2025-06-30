<%-- 
    Document   : menu
    Created on : 13 Jun 2025, 4:11:32 PM
    Author     : morak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <h1>Menu</h1>
        <%
            String compName = (String)pageContext.getServletContext().getInitParameter("compName");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Hi <%=name%> It's <%=compName%> please choose an option below
        </p>
        <ul>
            <li><a href="enterMassage.jsp">Enter Message</a></li>
            <li><a href="enterMessageOutcome.jsp">Encrypt Message</a></li>
            <li><a href="SaveMessage.jsp">Save Encrypted Message</a></li>
            <li><a href="ViewAllMessagesServlet.do">View All Messages Decrypted</a></li>
            <li><a href="ViewLongestServlet.do">View Details of Longest Message</a></li>
            <li><a href="LogoutServelt.do">Logout</a></li>
        </ul>
    </body>
</html>
