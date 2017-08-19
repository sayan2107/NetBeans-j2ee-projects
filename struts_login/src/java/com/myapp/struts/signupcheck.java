/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import conn.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author sayan
 */
public class signupcheck extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
   private static final String FAILED = "user_name_exist";
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
             {
                 FormBean fb=(FormBean)form;
                 try{
        String uname=fb.getUname();
        String pass=fb.getPass();
        String address=fb.getAddress();
        long contact=fb.getContact();
        String email=fb.getEmail();
        String name=fb.getName();
        MyConnection m=new MyConnection();
        Connection cn=m.GetConn();
        String sql="insert into STRUTS_USER values(?,?,?,?,?,?)";
        PreparedStatement ps=cn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, uname);
        ps.setString(4, pass);
        ps.setString(5, email);
        ps.setLong(6, contact);
        int n=ps.executeUpdate();
        return mapping.findForward(SUCCESS);
                 }catch(Exception e){
                  request.setAttribute("ss_fb", fb);
                  request.setAttribute("error","Username Already in use choose another username");
                  return mapping.findForward(FAILED);   
                 }
        
    }
}
