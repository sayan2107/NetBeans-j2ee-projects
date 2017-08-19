<%-- 
    Document   : result
    Created on : Jul 26, 2017, 3:00:35 PM
    Author     : sayan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           String fname=session.getAttribute("ss_fname").toString();
       %>
       
       <h1>welcome <%= fname %></h1>
    </body>
</html>
