package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import test.Connect;

public final class bookbus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .addbus{\n");
      out.write("        height: 100%;\n");
      out.write("        max-width: 800px;\n");
      out.write("        margin: auto;\n");
      out.write("    }\n");
      out.write("    table {\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("    thead {\n");
      out.write("        height: 50px;\n");
      out.write("        text-align: center;\n");
      out.write("        font-weight: bold;\n");
      out.write("        vertical-align: middle;\n");
      out.write("    }\n");
      out.write("    tbody{\n");
      out.write("        height: 40px;\n");
      out.write("        text-align: center;\n");
      out.write("        vertical-align: middle;\n");
      out.write("    }\n");
      out.write("    thead td{\n");
      out.write("        background: #101010;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    tr{\n");
      out.write("        height: 40px;\n");
      out.write("    }\n");
      out.write("    tr:hover {background-color: #f2f3ff;}\n");
      out.write("</style>\n");
      out.write("\n");

    ResultSet rs ,rs2;
    Statement st ,st2;
    Connect makeConnect = new Connect();
    Connection con = makeConnect.makeConnection();
    int MaxSeats;
    st = con.createStatement();
    st2 = con.createStatement();
    rs = st.executeQuery("SELECT * FROM bus");
    rs2 = st2.executeQuery("SELECT COUNT(*) as nos FROM booking where Status = 1");
    if(rs2.next()){
        System.out.println("Date Status=1 = "+rs2.getInt(1));
    }

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"addbus\" style=\"max-height:500px;overflow-y:auto;\">\n");
      out.write("            <table >\n");
      out.write("                <thead>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td>Seats</td>\n");
      out.write("                        <td>Price</td>\n");
      out.write("                        <td>Route</td>\n");
      out.write("                        <td>Type</td>\n");
      out.write("                        <td>Travel Date</td>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        while(rs.next()){
                            MaxSeats = rs.getInt(3);
                            System.out.println("MaxSeats of "+rs.getString(2)+" = "+MaxSeats);
                          
      out.write("<tr id=\"");
      out.print( rs.getString(1));
      out.write("\">\n");
      out.write("                              <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                              <td id=\"");
      out.print( rs.getString(1));
      out.write("seats\">");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print( rs.getString(6));
      out.write("</td>\n");
      out.write("                              <td>\n");
      out.write("                                  <form action=\"BookBus\" method=\"POST\">\n");
      out.write("                                    ");
HttpSession mysession = request.getSession();
      out.write("\n");
      out.write("                                    <input type=\"text\" name=\"uid\" value=\"");
      out.print( mysession.getAttribute("userid"));
      out.write("\" hidden=\"true\">\n");
      out.write("                                    <input type=\"text\" id=\"");
      out.print( rs.getString(1));
      out.write("date\" oninput=\"seatResult(");
      out.print( rs.getString(1));
      out.write(")\" class=\"ui-datepicker-calendar\" name=\"Tdate\"  placeholder=\"yyyy-mm-dd\" autocomplete=\"off\" required>\n");
      out.write("                                    <button value=\"");
      out.print( rs.getString(1));
      out.write("\" name=\"bid\">Book</button>\n");
      out.write("                                  </form>\n");
      out.write("                              </td>\n");
      out.write("                            </tr>\n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                <div id=\"testdiv\"></div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    function seatResult(busid){\n");
      out.write("        var opt1 = document.getElementById(busid+\"date\").value;\n");
      out.write("        \n");
      out.write("        document.getElementById(busid+\"testdiv\").innerHTML = \"Selected Date: \" + opt1;\n");
      out.write("        \n");
      out.write("        var xhttp;\n");
      out.write("        xhttp = new XMLHttpRequest();\n");
      out.write("        xhttp.onreadystatechange = function(){\n");
      out.write("            if (this.readyState == 4 && this.status == 200)\n");
      out.write("                document.getElementById(opt1+\"seats\").innerHTML = this.responseText;\n");
      out.write("        }\n");
      out.write("        xhttp.open(\"GET\", \"./user/dateres.jsp?opt1=\"+opt1+\"&opt2=\"+busid, true);\n");
      out.write("        xhttp.send();\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    $(function(){$(\"input[name=Tdate]\").datepicker({ minDate: 0, dateFormat: \"yy-mm-dd\"});});\n");
      out.write("    \n");
      out.write("</script>");
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
