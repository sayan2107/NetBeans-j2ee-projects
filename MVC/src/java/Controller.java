import conn.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Employee;

/**
 *
 * @author sayan
 */
public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        int empid=Integer.parseInt(request.getParameter("id"));
        MyConnection m=new MyConnection();
        Connection cn=m.GetConn();
        
         String sql="select * from employee2 where empid=?";
         PreparedStatement ps=cn.prepareStatement(sql);
         ps.setInt(1, empid);
         ResultSet rs=ps.executeQuery();
         Employee e=new Employee();
         HttpSession hs=request.getSession();
         hs=request.getSession();
         if(rs.next()){ 
             e.setEname(rs.getString("ename"));
             e.setDname(rs.getString("deptname"));
             e.setSalary(rs.getString("salary"));
             e.setComm(rs.getString("comm"));
             hs.setAttribute("emp", e);     
             response.sendRedirect("view2.jsp");
         }else{
             e.setIsNull();
             hs.setAttribute("emp", e);    
             response.sendRedirect("view2.jsp");
         }
          
        }catch(Exception e){
            out.println(e);
        }
           
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
