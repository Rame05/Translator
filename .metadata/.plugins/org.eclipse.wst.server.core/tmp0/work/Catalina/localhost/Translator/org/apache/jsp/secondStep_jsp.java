/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2014-09-07 16:56:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class secondStep_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"images/pen.ico\" type=\"image/x-icon\">\r\n");
      out.write("\t\t<title>Kugo</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<!-- Latest compiled and minified CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"jquery-1.11.1.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("\t\t\t<ul id=\"topmenu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/logo_264x7.png\" onclick='window.location=\"index.jsp\"'>\r\n");
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
      out.write("\t\t\t\t<button class=\"btn btn-primary exit\">Вийти</button> \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"top_filler\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Main body -->\r\n");
      out.write("\t\t<div class=\"registr-nav\">\r\n");
      out.write("\t\t\t<div><b>Three steps to do a translation</b></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"iconItem\">\r\n");
      out.write("\t\t\t\t<img class=\"r-icon\" src=\"images/1-to-translate.png\" onclick='window.location = \"registrCl.jsp\"'>\r\n");
      out.write("\t\t\t\t<div>Chose<br>language and<br>type of translation</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<img class=\"r-span\" src=\"images/arrow-icon.png\">\r\n");
      out.write("\t\t\t<div class=\"iconItem\">\r\n");
      out.write("\t\t\t\t<img class=\"r-icon sel\" src=\"images/2-to-translate.png\" onclick='window.location = \"secondStep.jsp\"'>\r\n");
      out.write("\t\t\t\t<div>Upload<br>file or type<br>your text</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<img class=\"r-span\" src=\"images/arrow-icon.png\">\r\n");
      out.write("\t\t\t<div class=\"iconItem\">\r\n");
      out.write("\t\t\t\t<img class=\"r-icon\" src=\"images/3-to-translate.png\" onclick='window.location = \"thirdStep.jsp\"'>\r\n");
      out.write("\t\t\t\t<div>Pay<br>and take your<br>delivery</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"choose_container\">\r\n");
      out.write("\t\t\t<div class=\"left_column\">\r\n");
      out.write("\t\t\t\t<h2>I want to translate:</h2>\r\n");
      out.write("\t\t\t\t<textarea id=\"sourceText\"></textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"right_column\">\r\n");
      out.write("\t\t\t\t<h2 style=\"text-align:center\">Your order:</h2>\r\n");
      out.write("\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\tLanguage\r\n");
      out.write("\t\t\t\t<div id=\"inputedLanguage\"></div>\r\n");
      out.write("\t\t\t\tType of translate\r\n");
      out.write("\t\t\t\t<div id=\"inputedType\"></div>\r\n");
      out.write("\t\t\t\tQuantity of symbols\r\n");
      out.write("\t\t\t\t<div id=\"Quantity\"> </div>\r\n");
      out.write("\t\t\t\tPrice\r\n");
      out.write("\t\t\t\t<div id=\"Price\"> </div>\r\n");
      out.write("\t\t\t\tDelivery\r\n");
      out.write("\t\t\t\t<div id=\"DeliveryTime\"> </div>\r\n");
      out.write("\t\t\t\tAdditional requirements\r\n");
      out.write("\t\t\t\t<textarea id=\"additionReq\"></textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>KUGO translation garanties 100% refund </div>\r\n");
      out.write("\t\t<div class=\"copyrights\">Copyright 2014, “KUGO LTD”</div>\r\n");
      out.write("\t\t\r\n");
      out.write("</body>\r\n");
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
