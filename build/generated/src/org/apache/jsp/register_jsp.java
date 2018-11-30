package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./navbar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write('\n');

    HttpSession mysession = request.getSession();

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Register</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"#\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/jquery-ui.css\">\n");
      out.write("    <style>\n");
      out.write("    .card {\n");
      out.write("            background-color: #ececec;\n");
      out.write("            max-width: 400px;\n");
      out.write("            min-height: 350px;\n");
      out.write("            padding: 20px 50px 30px;\n");
      out.write("            margin: 80px auto;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 0px 20px -6px black;\n");
      out.write("    }\n");
      out.write("    .form-name{\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 30px;\n");
      out.write("            margin-top: -30px;\n");
      out.write("            /*padding: 100px;*/\n");
      out.write("            padding-bottom: 50px;\n");
      out.write("    }\n");
      out.write("    input,button.login{\n");
      out.write("            background: #f9f9f9;\n");
      out.write("            padding: 5px 0;\n");
      out.write("            margin-top: 30px;\n");
      out.write("            /*margin-bottom: 30px;*/\n");
      out.write("            width: 100%;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            box-shadow: none;\n");
      out.write("            outline: none;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: 2px #0062cc solid;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 14px;\n");
      out.write("    }\n");
      out.write("    input:focus,\n");
      out.write("    input:valid{\n");
      out.write("            border: 1px #0062cc solid;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 16px;\n");
      out.write("    }\n");
      out.write("    button.login{\n");
      out.write("            border-bottom: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background: #0062cc;\n");
      out.write("            color: #fff;\n");
      out.write("            margin-bottom: 0px;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("    }\n");
      out.write("    form div{\n");
      out.write("            position: relative;\n");
      out.write("    }\n");
      out.write("    form div label{\n");
      out.write("            position: absolute;\n");
      out.write("            top: 38px;\n");
      out.write("            left: 10px;\n");
      out.write("            color: #999;\n");
      out.write("            transition: 0.25s;\n");
      out.write("            pointer-events: none;\n");
      out.write("    }\n");
      out.write("    input:focus ~ label,\n");
      out.write("    input:valid ~ label{\n");
      out.write("            top: 10px;\n");
      out.write("            left: 0px;\n");
      out.write("            color: #0062cc;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("    }\n");
      out.write("    .form-margin{\n");
      out.write("            margin-top: 500px;\n");
      out.write("    }\n");
      out.write("    .hider{\n");
      out.write("            display: none;\n");
      out.write("    }\n");
      out.write("    .shower{\n");
      out.write("            display: all;\n");
      out.write("    }\n");
      out.write("    .showpw{\n");
      out.write("            position: absolute;\n");
      out.write("            color: #999999;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-left: -25px;\n");
      out.write("            margin-top: 40px;\n");
      out.write("    }\n");
      out.write("    input:focus ~ .showpw,\n");
      out.write("    input:valid ~ .showpw{\n");
      out.write("            top: 5px;\n");
      out.write("    }\n");
      out.write("    #error-msg{\n");
      out.write("        color: red;\n");
      out.write("        position: absolute;\n");
      out.write("        top: 680px;\n");
      out.write("        left: 580px;\n");
      out.write("    }\n");
      out.write("    #suc-msg{\n");
      out.write("        color: #00af26;\n");
      out.write("        position: absolute;\n");
      out.write("        top: 680px;\n");
      out.write("        left: 600px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write('\n');

    if(mysession.getAttribute("name") != null){
    
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\"><span class=\"glyphicon glyphicon-bed\"></span> TrueBus</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"./home.jsp\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print( mysession.getAttribute("name"));
      out.write("</a></li>\n");
      out.write("                <li><a href=\"./logout.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("    ");

    }
    else{
    
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\"><span class=\"glyphicon glyphicon-bed\"></span> TrueBus</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"./index.jsp\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("                <li><a href=\"./index.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("    ");

    }
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"card\" id=\"login-form\">\n");
      out.write("        <div class=\"text-center\"><span class=\"form-name\">Register</span></div>\n");
      out.write("        <span class=\"form-margin\">\n");
      out.write("            <form method=\"POST\" action=\"RegisterServlet\">\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"text\" name=\"uname\" required>\n");
      out.write("                    <label><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"email\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" name=\"email\" required>\n");
      out.write("                    <label><span class=\"glyphicon glyphicon-envelope\"></span> Email</label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"tel\" maxlength=\"10\" name=\"phone\" required>\n");
      out.write("                    <label><span class=\"glyphicon glyphicon-earphone\"></span> Phone</label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"text\" class=\"ui-datepicker-calendar\" name=\"dob\" id=\"datepicker\" required>\n");
      out.write("                    <label><span class=\"glyphicon glyphicon-calendar\"></span> Date of Birth</label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"Male\">Male\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"female\">Female\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"password\" name=\"paswd\" required id=\"pswdfld\"><span id=\"eye\" class=\"showpw glyphicon glyphicon-eye-open\" onclick=\"showPwd()\"></span>\n");
      out.write("                    <label><span class=\"glyphicon glyphicon-lock\"></span> Password</label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"password\" name=\"paswd2\" required id=\"pswdfld2\"><span id=\"eye\" class=\"showpw glyphicon glyphicon-eye-open\" onclick=\"showPwd()\"></span>\n");
      out.write("                    <label><span class=\"glyphicon glyphicon-lock\"></span> Confirm Password</label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <button class=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span> Register</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"error-msg\"></div>\n");
      out.write("            </form><br>\n");
      out.write("        </span>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .footer {\n");
      out.write("        position: fixed;\n");
      out.write("        bottom: 0;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 30px;\n");
      out.write("        background-color: #ececec;\n");
      out.write("        z-index: 99;\n");
      out.write("        padding-top: 5px;\n");
      out.write("    }\n");
      out.write("    #last{\n");
      out.write("        float: right;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<footer class=\"footer fixed\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <p class=\"text-muted text-center\">&copy; Jiss Johnson\n");
      out.write("            <span id=\"last\">\n");
      out.write("                Last login : ");
      out.print( mysession.getAttribute("lastdate"));
      out.write("\n");
      out.write("            </span>\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("    <style>\n");
      out.write("    .footer {\n");
      out.write("        position: relative;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("</body>\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery-ui.js\"></script> \n");
      out.write("    <script type=\"text/javascript\" src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(function(){\n");
      out.write("        $(\"#datepicker\").datepicker({ minDate: 0});\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    function showPwd() {\n");
      out.write("        var fld = document.getElementById(\"pswdfld\");\n");
      out.write("        if(fld.type === \"password\") {\n");
      out.write("            fld.type = \"text\";\n");
      out.write("            document.getElementById(\"eye\").classList.remove(\"glyphicon-eye-open\");\n");
      out.write("            document.getElementById(\"eye\").classList.add(\"glyphicon-eye-close\");\n");
      out.write("        }else {\n");
      out.write("            fld.type = \"password\";\n");
      out.write("            document.getElementById(\"eye\").classList.add(\"glyphicon-eye-open\");\n");
      out.write("            document.getElementById(\"eye\").classList.remove(\"glyphicon-eye-close\");\n");
      out.write("        }\n");
      out.write("</script>\n");
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
