/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2018-02-16 13:11:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminDeleteLibrary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/logo.html", Long.valueOf(1518778443516L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Delete Library</title>\r\n");
      out.write("<header><table align=\"center\"><tr><td>");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title></title><!-- welcome page logo -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<img src=\"logo.jpg\" alt=logo width=200px height=200px align=\"left\" border=\"1px\" style=\"border-radius:15px;\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("</td><td style=\"padding-left: 10px; padding-right: 10px;\"></td>\r\n");
      out.write("<td><p style=\"padding-left:20px ; font-family:serif; font-size: 60px;\">AGO COLLEGE</p></td></tr></table>\r\n");
      out.write("</header>\r\n");
      out.write("<script>\r\n");
      out.write("function goBack() {\r\n");
      out.write("    window.history.back()\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("button:hover {\r\n");
      out.write("box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19); cursor: pointer; transition-duration: 0.4s;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("background-color:rgb(300,300,300);\r\n");
      out.write("}\r\n");
      out.write("span{\r\n");
      out.write("font-family: serif; font-size:25px;\r\n");
      out.write("}\r\n");
      out.write("input[type=text],input[type=password]{\r\n");
      out.write("width: 50%;\r\n");
      out.write("padding: 12px 20px;\r\n");
      out.write("margin: 8px 0;\r\n");
      out.write("display: inline-block;\r\n");
      out.write("border: 1px solid #ccc;\r\n");
      out.write("border-radius: 4px;\r\n");
      out.write("box-sizing: border-box;\r\n");
      out.write("font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("footer{\r\n");
      out.write("background-color:rgb(150,150,150);\r\n");
      out.write("}\r\n");
      out.write("label{\r\n");
      out.write("text-shadow: 1px 1px gray;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center><img width=\"1000\" height=\"200\" alt=\"College.jpeg\" src=\"collegeimg.jpg\" border=1px title=\"College.jpeg\" style=\"border-radius: 20px;padding-left:1px;padding-right:1px;padding-top:1px;padding-bottom:1px;\"></center>\r\n");
      out.write("<br><br>\r\n");
      out.write("<button onclick=\"goBack()\" style=\"font-family:serif; align-self:center; margin-left:200px; font-size: 15px; font-weight:bold; color:black; border-color:black; border-radius: 5px; background: !important; padding-bottom:1px \" type=\"submit\">Go Back to Courseware</button>\r\n");
      out.write("<h1 style=\"font-family:serif; font-size: 40px; font-weight: bold; margin-left: 460px;\">Delete the Book from Library</h1>\r\n");
      out.write("<form action=AdminDeleteLibraryServlet method=post>\r\n");
      out.write("<label>\r\n");
      out.write("<span style=\"margin-left: 350px;\">Book ID : </span><br>\r\n");
      out.write("<input style=\"margin-left: 350px;\" required type=\"text\" name=\"bookid\">\r\n");
      out.write("<br><br></label>\r\n");
      out.write("<button style=\"margin-left:550px ;font-family:serif; padding:14px 40px; font-size: 20px; border-color:black; \" type=\"submit\">Delete Book</button>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
