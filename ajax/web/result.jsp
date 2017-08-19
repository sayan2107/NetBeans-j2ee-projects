<%-- 
    Document   : result
    Created on : Aug 7, 2017, 2:45:08 PM
    Author     : sayan
--%>

<%@page import="conn.MyConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
            int id=Integer.parseInt(request.getParameter("crs_id"));
            MyConnection m=new MyConnection();
            Connection cn=m.GetConn();
            String sql="select * from course where id=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                out.println("<h1> course id:"+rs.getInt(1)+"</h1>");
                 out.println("<h1> course name:"+rs.getString(2)+"</h1>");
                 out.println("<h1> course fees:"+rs.getInt(3)+"</h1>");
                  out.println("<h1> course duration:"+rs.getInt(4)+"</h1>");
            }else{
                out.println("course not found");
            }
         %>
    </body>
</html>
