import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class EntryProcess extends HttpServlet {
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //retrive user i/p
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        out.println("<h1>welcome " + name + "</h1><br>");
        out.println("<h1>welcome " + address + "</h1><br>");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "j2ee", "10314036");
            String sql = "insert into employee values(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, address);
            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("registerd successfully");
            }
        } catch (Exception e) {
            out.println("Something went wrong can't insert into database");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   

}
