/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2018-02-16 13:08:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminExam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin Exam</title>\r\n");
      out.write("<header>\r\n");
      out.write("<table align=\"center\"><tr><td>");
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
      out.write("<td><p style=\"padding-left:20px ; font-family:serif; font-size: 60px;\">AGO  COLLEGE</p></td></tr></table>\r\n");
      out.write("</header>\r\n");
      out.write("<style>\r\n");
      out.write("footer{\r\n");
      out.write("background-color:rgb(150,150,150);\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("background-color:rgb(300,300,300);\r\n");
      out.write("}\r\n");
      out.write("button:hover {\r\n");
      out.write("box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19); cursor: pointer; transition-duration: 0.4s;\r\n");
      out.write("}\r\n");
      out.write(".beta table{\r\n");
      out.write("font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("border-collapse: collapse;\r\n");
      out.write("width: 100%;\r\n");
      out.write("}\r\n");
      out.write(".beta td{\r\n");
      out.write("border: 1px solid #eed;\r\n");
      out.write("padding: 8px;\r\n");
      out.write("}\r\n");
      out.write(".beta th{\r\n");
      out.write("border: 1px solid #eed;\r\n");
      out.write("padding: 8px;\r\n");
      out.write("padding-top: 12px;\r\n");
      out.write("padding-bottom: 12px;\r\n");
      out.write("text-align: center;\r\n");
      out.write("background-color: #4CAF50;\r\n");
      out.write("color: white;\r\n");
      out.write("}\r\n");
      out.write(".beta tr:nth-child(even){\r\n");
      out.write("background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write(".beta tr:hover{\r\n");
      out.write("background-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center><img width=\"1000\" height=\"200\" alt=\"College.jpeg\" src=\"collegeimg.jpg\" border=1px title=\"College.jpeg\" style=\"border-radius: 20px;padding-left:1px;padding-right:1px;padding-top:1px;padding-bottom:1px;\"></center>\r\n");
      out.write("<br><br>\r\n");
      out.write("<form action=\"adminHome.jsp\">\r\n");
      out.write("<input type=\"submit\" value=\"Go Back to Home Page\" style=\"font-family:serif; margin-left:200px; font-size: 15px; font-weight:bold; color:black; border-color:black; border-radius: 5px; background: !important; padding-bottom:1px \">\r\n");
      out.write("</form>\r\n");
      out.write("<br><br>\r\n");
      out.write("<a href=adminNewExam.jsp><button style=\"margin-left: 200px; font-family:serif; padding:12px 38px; font-size: 20px; border-color:black; border-radius: 12px;\" type=\"submit\">Add New Exam</button></a>\r\n");
      out.write("<a href=adminUpdateExam.jsp><button style=\"margin-left: 120px; font-family:serif; padding:12px 38px; font-size: 20px; border-color:black; border-radius: 12px;\" type=\"submit\">Update a Previous Exam</button></a> \r\n");
      out.write("<a href=adminDeleteExam.jsp><button style=\"margin-left: 120px; font-family:serif; padding:12px 38px; font-size: 20px; border-color:black; border-radius: 12px;\" type=\"submit\">Delete an Exam</button></a>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");


try {
	Class.forName("org.h2.Driver");

	Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/AdvJava", "niit", "1234");

	PreparedStatement preparedStatement = con.prepareStatement("select * from exam order by standard");
	out.println("<h2><center><b>Exam Schedule</b></center></h2>");
	out.println("<table class='beta' align=center border=7 width=70% height=70%");
	out.print("<tr><th>EXAM TYPE</th><th>STANDARD</th><th>SUBJECT</th><th>DATE</th><th>DURATION</th></tr>");
	ResultSet rs=preparedStatement.executeQuery();
	while(rs.next())
	{
		out.print("<tr>");
		out.print("<td><center>"+rs.getString(1)+"</center></td>");
		out.print("<td><center>"+rs.getString(2)+"</center></td>");
		out.print("<td><center>"+rs.getString(3)+"</center></td>");
		out.print("<td><center>"+rs.getString(4)+"</center></td>");
		out.print("<td><center>"+rs.getString(5)+"</center></td>");
		out.print("</tr>");
	}
	
	out.println("</table>");
	con.close();

} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 

      out.write("\r\n");
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