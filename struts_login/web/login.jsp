<%-- 
    Document   : login
    Created on : Jul 26, 2017, 7:43:28 PM
    Author     : sayan
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <%
String login_msg=(String)request.getAttribute("error"); 
if(login_msg!=null){
%>
<html:form action="/check">
            <h1><bean:message key="login"></bean:message></h1>
            <bean:message key="form.username"></bean:message><br>
            <html:text property="uname" value=""></html:text><br>
            <bean:message key="form.password"></bean:message><br>
            <input type="password" name="pass"><br><br>
            <html:submit value="login"></html:submit><br><br>
            <font color=red size=4px><%= login_msg %></font><br><br>
            <bean:message key="form.signup.text"></bean:message>
            <a href="signup.jsp"><bean:message key="form.signuphere"></bean:message></a>
            <html:errors></html:errors>
        </html:form>
<%}else{%>
        <html:form action="/check">
            <h1><bean:message key="login"></bean:message></h1>
            <bean:message key="form.username"></bean:message><br>
            <html:text property="uname" value=""></html:text><br>
            <bean:message key="form.password"></bean:message><br>
            <input type="password" name="pass"><br><br>
            <html:submit value="login"></html:submit><br><br>       
            <bean:message key="form.signup.text"></bean:message>
            <a href="signup.jsp"><bean:message key="form.signuphere"></bean:message></a>
            <html:errors></html:errors>
        </html:form>
       <% } %>
    </body>
</html>
