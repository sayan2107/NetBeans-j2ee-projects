package com.myapp.struts;

import conn.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class action extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "welcome";
   private static final String FAILURE = "failed";
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        FormBean fb=(FormBean)form;
        String uname=fb.getUname();
        String pass=fb.getPass();
        MyConnection m=new MyConnection();
        Connection cn=m.GetConn();
        String sql="select * from STRUTS_USER where USERID=? and PASSWORD=?";
        PreparedStatement ps=cn.prepareStatement(sql);
        ps.setString(1, uname);
        ps.setString(2, pass);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            fb.setAddress(rs.getString("address"));
            fb.setContact(rs.getLong("contact"));
            fb.setEmail(rs.getString("email"));
            fb.setName(rs.getString("name"));  
            HttpSession hs=request.getSession();
            hs.setAttribute("ss_fb", fb);
            
             return mapping.findForward(SUCCESS);
        }
        
       request.setAttribute("error","Invalid Username or Password");
       return mapping.findForward(FAILURE);
    }
}
