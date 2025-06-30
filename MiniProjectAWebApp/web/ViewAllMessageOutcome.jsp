<%-- 
    Document   : ViewAllMessageOutcome
    Created on : 16 Jun 2025, 5:45:31 PM
    Author     : morak
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.MiniProject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Message Outcome Page</title>
    </head>
    <body>
        <h1>View All Messages Outcome</h1>
        <%
            String compName = (String)pageContext.getServletContext().getInitParameter("compName");
            String name = (String)session.getAttribute("name");
            List<MiniProject> proj = (List<MiniProject>)request.getAttribute("proj");
        %>
        <p>
            Hi <%=name%> It's <%=compName%> again <br>
            below are the messages<br>
        </p>
        <table>
            <%
                for(int x=0;x<proj.size();x++){
                    MiniProject prj = proj.get(x);
                    Long id = prj.getId();
                    String msg = prj.getMessage();
                    int len = prj.getLength();
                    Date date = prj.getTimestamp();
            %>
            <tr>
                <td>ID</td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>Message</td>
                <td><%=msg%></td>
            </tr>
            <tr>
                <td>Length</td>
                <td><%=len%></td>
            </tr>
            <tr>
                <td>Date</td>
                <td><%=date%></td>
            </tr>
            <%
                }
            %>
        </table>
        <ul><a href="menu.jsp">go back to menu</a></ul>
        <ul><a href="index.html">Go back to home page</a></ul>
        <ul><a href="LogoutServelt.do">Logout</a></ul>
    </body>
</html>
