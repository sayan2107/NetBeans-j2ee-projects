package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function chkcrs(){\n");
      out.write("            var crs_id = document.getElementById(\"crs_id\").value;\n");
      out.write("             var status = document.getElementById(\"status\");\n");
      out.write("              var hr = new XMLHttpRequest();\n");
      out.write("           if(crs_id.length>0){\n");
      out.write("              // alert(hr);\n");
      out.write("                var v = \"result.jsp?crs_id=\"+crs_id;\n");
      out.write("\t\thr.open(\"GET\", v , true);\n");
      out.write("\t\thr.send(null);\n");
      out.write("                status.innerHTML = 'checking...';\n");
      out.write("                //hr.setRequestHeader(\"Content-type\", \"application/x-www-form-urlencoded\");\n");
      out.write("\t\thr.onreadystatechange = function() {\n");
      out.write("\t\t\tif(hr.readyState == 4 && hr.status == 200) {\n");
      out.write("                                 status.innerHTML = hr.responseText;\n");
      out.write("                               // alert(hr.responseText);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("           }\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("    \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form >\n");
      out.write("    Enter Course ID:\n");
      out.write("    <input type=\"text\" name=\"crs_id\" id=\"crs_id\" value=\"\">\n");
      out.write("     <br>\n");
      out.write("     <br>\n");
      out.write("     <input type=\"button\" onclick=\"chkcrs()\" value=\"check\">\n");
      out.write("         </form>\n");
      out.write("        <span id=\"status\"></span>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
