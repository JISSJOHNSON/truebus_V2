package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


   // Create cookies for first and last names.      
   Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
   Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));
   
   // Set expiry date after 24 Hrs for both the cookies.
   firstName.setMaxAge(60*60*24); 
   lastName.setMaxAge(60*60*24); 
   
   // Add both the cookies in the response header.
   response.addCookie( firstName );
   response.addCookie( lastName );

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <title>Setting Cookies</title>\n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("   <body>\n");
      out.write("      <center>\n");
      out.write("         <h1>Setting Cookies</h1>\n");
      out.write("      </center>\n");
      out.write("      <ul>\n");
      out.write("         <li><p><b>First Name:</b>\n");
      out.write("            ");
      out.print( request.getParameter("first_name"));
      out.write("\n");
      out.write("         </p></li>\n");
      out.write("         <li><p><b>Last  Name:</b>\n");
      out.write("            ");
      out.print( request.getParameter("last_name"));
      out.write("\n");
      out.write("         </p></li>\n");
      out.write("      </ul>\n");
      out.write("   \n");
      out.write("   </body>\n");
      out.write("</html>");
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
