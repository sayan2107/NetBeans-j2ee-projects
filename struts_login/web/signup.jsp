<%-- 
    Document   : signup
    Created on : Jul 27, 2017, 12:11:17 PM
    Author     : sayan
--%>

<%@page import="com.myapp.struts.FormBean"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create an account</title>
    </head>
    <body>
         <%
String login_msg=(String)request.getAttribute("error");
FormBean fb=(FormBean)request.getAttribute("ss_fb");
if(login_msg!=null){
%>
        <h1>create new account</h1>
        <html:form action="/signup" method="POST">
            NAME: <input type="text" name="name" required="" value="<%= fb.getName() %>"><br><br>
            EMAIL: <input type="email" name="email" required="" value="<%= fb.getEmail() %>"><br><br>
            CONTACT NO: <input type="text" name="contact" required="" value="<%= fb.getContact() %>"><br><br>
            ADDRESS: <input type="text" name="address" required="" value="<%= fb.getAddress() %>"><br><br>
            USER ID: <input type="text" name="uname" required=""><font color=red size=4px><%= login_msg %></font><br><br>
           PASSWORD: <input name="pass" required="required" type="password" id="password" /><br><br>
   CONFIRM PASSWORD: <input required="required" type="password" id="password_confirm" oninput="check(this)" />
<script language='javascript' type='text/javascript'>
    function check(input) {
        if (input.value !== document.getElementById('password').value) {
            input.setCustomValidity('Password Must be Matching.');
        } else {
            // input is valid -- reset the error message
            input.setCustomValidity('');
        }
    }
</script>
<br /><br />
<input type="submit" />
        </html:form>
<% }else{ %>

<h1>create new account</h1>
        <html:form action="/signup" method="POST">
            NAME: <input type="text" name="name" required=""><br><br>
            EMAIL: <input type="email" name="email" required=""><br><br>
            CONTACT NO: <input type="text" name="contact" required=""><br><br>
            ADDRESS: <input type="text" name="address" required=""><br><br>
            USER ID: <input type="text" name="uname" required=""><br><br>
           PASSWORD: <input name="pass" required="required" type="password" id="password" /><br><br>
   CONFIRM PASSWORD: <input required="required" type="password" id="password_confirm" oninput="check(this)" />
<script language='javascript' type='text/javascript'>
    function check(input) {
        if (input.value !== document.getElementById('password').value) {
            input.setCustomValidity('Password Must be Matching.');
        } else {
            // input is valid -- reset the error message
            input.setCustomValidity('');
        }
    }
</script>
<br /><br />
<input type="submit" />
        </html:form>

<% } %>
    </body>
</html>
