/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2014-09-07 18:09:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!Doctype html>\r\n");
      out.write("<html >\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"images/pen.ico\" type=\"image/x-icon\">\r\n");
      out.write("\t\t<title>Kugo</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<!-- Latest compiled and minified CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"jquery-1.11.1.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body style=\"background: url(images/NEW-YORK-CITY.jpg) no-repeat;background-size: 100% 683px;margin: 0 auto;\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<ul id=\"topmenu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"logo\" onclick='windows.location=\"index.jsp\"'>\r\n");
      out.write("\t\t\t\t\t<img src=\"images/logo_264x7.png\">\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div id=\"enject\" >\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/enject_small.png\" >\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class='sign-in'>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default navbar-btn\">Sign in</button>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<form id=\"loginForm\" class=\"registration-form\" method=\"POST\" action=\"Login\">\r\n");
      out.write("\t\t\t    <div class=\"form-group\">\r\n");
      out.write("\t\t\t        <label for=\"inputEmail\">Email</label>\r\n");
      out.write("\t\t\t        <input type=\"email\" name=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\" required>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div class=\"form-group\">\r\n");
      out.write("\t\t\t        <label for=\"inputPassword\">Пароль</label>\r\n");
      out.write("\t\t\t        <input type=\"password\" name=\"password\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Пароль\" required>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div class=\"checkbox\">\r\n");
      out.write("\t\t\t        <label><input type=\"checkbox\"> Запам'ятати мене</label>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <button type=\"submit\" class=\"btn btn-primary\" >Увійти</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary exit\">Вийти</button>\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class='large_logo'>\r\n");
      out.write("\t\t\t<img src=\"images/large_logo880x394.png\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ul class=\"footer\">\r\n");
      out.write("\t\t\t<li id=\"left_footer\">\r\n");
      out.write("\t\t\t<h3><b>Kugo</b> Ltg</h3>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li id=\"right_footer\">\r\n");
      out.write("\t\t\t\t<div><a>Ukrainin</a></div>\r\n");
      out.write("\t\t\t\t<div><a>Russian</a></div>\r\n");
      out.write("\t\t\t\t<div><a>English</a></div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div style=\"height:200px\"></div>\r\n");
      out.write("\t\t<div class=\"choose_container\">\t\r\n");
      out.write("\t\t<div class=\"choose\">\r\n");
      out.write("                <div class=\"head_title\">\r\n");
      out.write("                <h1>\r\n");
      out.write("\t\t\t\t\tTo Translate\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t<div class=\"float-shadow\" onclick='window.location = \"registrCl.jsp\"'>\r\n");
      out.write("\t\t\t\tШукаю перекладача\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"choose\">\r\n");
      out.write("                <div class=\"head_title\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\tA Translator\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t<div class=\"float-shadow\" onclick='window.location = \"secondStep.jsp\"'>\r\n");
      out.write("\t\t\t\t\tШукаю переклад\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<ul class=\"container\">\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<div id=\"speed\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/alarm-clock-icon.png\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Швидкість</h2><br>\r\n");
      out.write("\t\t\t\t\t\t\tКоманда перекладачів виконає Ваше замовлення у найкоротший термін\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<div id=\"quality\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/badge-icon.png\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Якість</h2>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\tДо перекладу замовлень допускаються професіонали, що уже підтвердили свій кваліфікаційний рівень\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<div id=\"simplicity\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/bulb-icon.png\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Простота</h2>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\tДекілька напискань і Ваш переклад готово\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"copyrights\">Copyright 2014, “KUGO LTD”</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
