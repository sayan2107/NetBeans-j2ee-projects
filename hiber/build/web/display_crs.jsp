<%-- 
    Document   : display_crs
    Created on : Jul 28, 2017, 3:21:31 PM
    Author     : sayan
--%>

<%@page import="mypack.Course"%>
<%@page import="java.util.List"%>
<%@page import="mypack.helper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>course details</h1>
        <%
            helper h = new helper();
            List crslist = h.getCourse();
            %>


        <table border="1px solid">
            <tr>
                <th>course id</th>
                <th>course name</th>
                <th>course fees</th>
                <th>course duration</th>
            </tr>
<%
for (int i = 0; i < crslist.size(); i++) {
                Course c = (Course) crslist.get(i);
%>
            <tr>
                <td><%= c.getId()%></td>
                <td><%= c.getCourse()%></td>
                <td><%= c.getFees()%></td>
                <td><%= c.getDuration()%></td>
            </tr>
            <% }%>
        </table>
    </body>
</html>
