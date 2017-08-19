<%-- 
    Document   : view2
    Created on : Jul 19, 2017, 3:05:55 PM
    Author     : sayan
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            Employee emp=(Employee)session.getAttribute("emp");
            if(emp.getIsNull()==1){
                out.println("<h1>employee not found</h1>");
            }else{
        %>
        <h1>Employee name:<%= emp.getEname() %></h1>
        <h1>Employee department:<%= emp.getDname() %></h1>
        <h1>Employee salary:<%= emp.getSalary() %></h1>
        <h1>Employee comm:<%= emp.getComm() %></h1>
       <% } %>
    </body>
</html>
