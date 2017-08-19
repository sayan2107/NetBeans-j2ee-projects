/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.sql.*;

/**
 *
 * @author sayan
 */
public class oracle_query{
    public static void main(String[] args) throws Exception {
       Scanner s=new Scanner(System.in);
        System.out.println("Enter roll:");
        int r=s.nextInt();
        System.out.println("Enter name:");
        String nm=s.next();
        System.out.println("Enter course:");
        String crs=s.next();
        System.out.println("Enter fees:");
        double fs=s.nextDouble();
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="j2ee";
        String pass="10314036";
        
       Connection conn=DriverManager.getConnection(url, user, pass);
       String sql="Insert into student(roll,name,course,fees) values(?,?,?,?)";
       PreparedStatement ps=conn.prepareStatement(sql);
       ps.setInt(1, r);
       ps.setString(2, nm);
       ps.setString(3, crs);
       ps.setDouble(4, fs);
       
       int i=ps.executeUpdate();
       
       if(i>0){
           System.out.println(i+" rows inserted");
       }
       
       conn.close();
       
		    
    }
    
}