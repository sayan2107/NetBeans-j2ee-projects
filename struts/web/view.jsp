<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>user input</h1>
        <html:form action="/mypath">
            <bean:message key="e.name"></bean:message>
            <html:text property="fname"></html:text> 
            <br>
            <html:submit value="submit"></html:submit>
           
        </html:form>
             <html:errors></html:errors>
    </body>
</html>
