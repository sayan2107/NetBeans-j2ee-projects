<%-- 
    Document   : login
    Created on : Aug 15, 2017, 9:58:43 PM
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
        <title>JSP Page</title>
    </head>
    <body>
    <html:form action="/check">
    Login:
     <input type="text" name="name" value="">
     <br>
     <br>
     password:
     <input type="text" name="number" value="">
     <br>
     <br>
     <input type="submit" value="login">
     <html:errors></html:errors>
        </html:form>
        
    </body>
</html>
