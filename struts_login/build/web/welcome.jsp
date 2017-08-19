<%-- 
    Document   : welcome
    Created on : Jul 26, 2017, 9:19:08 PM
    Author     : sayan
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<%@page import="com.myapp.struts.FormBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>welcome</title>
    </head>
    <body>
        <% FormBean fb=(FormBean)session.getAttribute("ss_fb"); %>
        
      <h1>welcome <%= fb.getName() %></h1>
      <h1>Login ID: <%= fb.getUname() %></h1>
      <p>You are from <%= fb.getAddress() %></p>
      <p>Your contact number: <%= fb.getContact() %></p>
      <p>Your Email: <%= fb.getEmail() %></p>
       
    </body>
</html>
