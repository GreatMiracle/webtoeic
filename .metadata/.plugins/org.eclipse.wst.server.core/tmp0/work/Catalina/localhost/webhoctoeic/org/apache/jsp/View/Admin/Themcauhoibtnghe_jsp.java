/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2020-08-06 15:28:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Themcauhoibtnghe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Thêm câu hỏi bài nghe</title>\r\n");
      out.write("<meta name=\"description\" content=\"User login page\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("\r\n");
      out.write("<!-- bootstrap & fontawesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Template/Backend/assets/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Template/Backend/font/font-awesome.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Template/Backend/assets/font-awesome/4.2.0/css/font-awesome.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<!-- ace styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Template/Backend/assets/css/ace.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Template/Backend/assets/css/ace-rtl.min.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login-layout\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main-container\">\r\n");
      out.write("\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-10 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"login-container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-leaf green\"></i> <span class=\"red\">JSP</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"white\" id=\"id-text2\">SERVLET</span>\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"blue\" id=\"id-company-text\">&copy; Design by\r\n");
      out.write("\t\t\t\t\t\t\t\tNguyen Trung Kien</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"position-relative\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"login-box\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"login-box visible widget-box no-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"header blue lighter bigger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-coffee green\"></i> Thêm câu hỏi bài nghe\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taction=\"Themcauhoibtnghe?listenexerciseid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listenexerciseid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"block clearfix\"> ");
      out.print(request.getAttribute("msgquanlydsbtnghe") != null
					? request.getAttribute("msgquanlydsbtnghe")
					: " ");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label> <label class=\"block clearfix\"> Thêm file: <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"file\" name=\"file\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-white btn-warning btn-bold\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"width-70 pull-right btn btn-sm btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-key\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"bigger-110\">Thêm câu hỏi bài nghe</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"space-4\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"social-or-login center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"bigger-110\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- /.widget-main -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- /.widget-body -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /.login-box -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /.position-relative -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-fixed-top align-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<br /> &nbsp; <a id=\"btn-login-dark\" href=\"#\">Dark</a> &nbsp; <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"blue\">/</span> &nbsp; <a id=\"btn-login-blur\" href=\"#\">Blur</a>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp; <span class=\"blue\">/</span> &nbsp; <a id=\"btn-login-light\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"#\">Light</a> &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.col -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.row -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.main-content -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.main-container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- basic scripts -->\r\n");
      out.write("\r\n");
      out.write("\t<!--[if !IE]> -->\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/jquery.2.1.1.min.js\"></script>\r\n");
      out.write("\t<!-- <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<!--[if !IE]> -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\twindow.jQuery\r\n");
      out.write("\t\t\t\t|| document\r\n");
      out.write("\t\t\t\t\t\t.write(\"<script src='Template/Backend/assets/js/jquery.min.js'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t+ \"<\"+\"/script>\");\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- <![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tif ('ontouchstart' in document.documentElement)\r\n");
      out.write("\t\t\tdocument\r\n");
      out.write("\t\t\t\t\t.write(\"<script src='Template/Backend/assets/js/jquery.mobile.custom.min.js'>\"\r\n");
      out.write("\t\t\t\t\t\t\t+ \"<\"+\"/script>\");\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- page specific plugin scripts -->\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/jquery-ui.custom.min.js\"></script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/jquery.ui.touch-punch.min.js\"></script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/markdown.min.js\"></script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/bootstrap-markdown.min.js\"></script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/jquery.hotkeys.min.js\"></script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/bootstrap-wysiwyg.min.js\"></script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/bootbox.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ace scripts -->\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/ace-elements.min.js\"></script>\r\n");
      out.write("\t<script src=\"Template/Backend/assets/js/ace.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- inline scripts related to this page -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tjQuery(function($) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction showErrorAlert(reason, detail) {\r\n");
      out.write("\t\t\t\tvar msg = '';\r\n");
      out.write("\t\t\t\tif (reason === 'unsupported-file-type') {\r\n");
      out.write("\t\t\t\t\tmsg = \"Unsupported format \" + detail;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t//console.log(\"error uploading file\", reason, detail);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t'<div class=\"alert\"> <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<strong>File upload error</strong> '\r\n");
      out.write("\t\t\t\t\t\t\t\t+ msg\r\n");
      out.write("\t\t\t\t\t\t\t\t+ ' </div>').prependTo('#alerts');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#editor1').ace_wysiwyg({\r\n");
      out.write("\t\t\t\ttoolbar : [ 'font', null, 'fontSize', null, {\r\n");
      out.write("\t\t\t\t\tname : 'bold',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-info'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'italic',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-info'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'strikethrough',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-info'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'underline',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-info'\r\n");
      out.write("\t\t\t\t}, null, {\r\n");
      out.write("\t\t\t\t\tname : 'insertunorderedlist',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-success'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'insertorderedlist',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-success'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'outdent',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-purple'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'indent',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-purple'\r\n");
      out.write("\t\t\t\t}, null, {\r\n");
      out.write("\t\t\t\t\tname : 'justifyleft',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-primary'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'justifycenter',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-primary'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'justifyright',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-primary'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'justifyfull',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-inverse'\r\n");
      out.write("\t\t\t\t}, null, {\r\n");
      out.write("\t\t\t\t\tname : 'createLink',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-pink'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'unlink',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-pink'\r\n");
      out.write("\t\t\t\t}, null, {\r\n");
      out.write("\t\t\t\t\tname : 'insertImage',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-success'\r\n");
      out.write("\t\t\t\t}, null, 'foreColor', null, {\r\n");
      out.write("\t\t\t\t\tname : 'undo',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-grey'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : 'redo',\r\n");
      out.write("\t\t\t\t\tclassName : 'btn-grey'\r\n");
      out.write("\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t'wysiwyg' : {\r\n");
      out.write("\t\t\t\t\tfileUploadError : showErrorAlert\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}).prev().addClass('wysiwyg-style2');\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#editor2').css({\r\n");
      out.write("\t\t\t\t'height' : '200px'\r\n");
      out.write("\t\t\t}).ace_wysiwyg(\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\ttoolbar_place : function(toolbar) {\r\n");
      out.write("\t\t\t\t\t\t\treturn $(this).closest('.widget-box').find(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'.widget-header').prepend(toolbar).find(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'.wysiwyg-toolbar').addClass('inline');\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttoolbar : [ 'bold', {\r\n");
      out.write("\t\t\t\t\t\t\tname : 'italic',\r\n");
      out.write("\t\t\t\t\t\t\ttitle : 'Change Title!',\r\n");
      out.write("\t\t\t\t\t\t\ticon : 'ace-icon fa fa-leaf'\r\n");
      out.write("\t\t\t\t\t\t}, 'strikethrough', null, 'insertunorderedlist',\r\n");
      out.write("\t\t\t\t\t\t\t\t'insertorderedlist', null, 'justifyleft',\r\n");
      out.write("\t\t\t\t\t\t\t\t'justifycenter', 'justifyright' ],\r\n");
      out.write("\t\t\t\t\t\tspeech_button : false\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('[data-toggle=\"buttons\"] .btn').on(\r\n");
      out.write("\t\t\t\t\t'click',\r\n");
      out.write("\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\tvar target = $(this).find('input[type=radio]');\r\n");
      out.write("\t\t\t\t\t\tvar which = parseInt(target.val());\r\n");
      out.write("\t\t\t\t\t\tvar toolbar = $('#editor1').prev().get(0);\r\n");
      out.write("\t\t\t\t\t\tif (which >= 1 && which <= 4) {\r\n");
      out.write("\t\t\t\t\t\t\ttoolbar.className = toolbar.className.replace(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t/wysiwyg\\-style(1|2)/g, '');\r\n");
      out.write("\t\t\t\t\t\t\tif (which == 1)\r\n");
      out.write("\t\t\t\t\t\t\t\t$(toolbar).addClass('wysiwyg-style1');\r\n");
      out.write("\t\t\t\t\t\t\telse if (which == 2)\r\n");
      out.write("\t\t\t\t\t\t\t\t$(toolbar).addClass('wysiwyg-style2');\r\n");
      out.write("\t\t\t\t\t\t\tif (which == 4) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(toolbar).find('.btn-group > .btn').addClass(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'btn-white btn-round');\r\n");
      out.write("\t\t\t\t\t\t\t} else\r\n");
      out.write("\t\t\t\t\t\t\t\t$(toolbar).find('.btn-group > .btn-white')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.removeClass('btn-white btn-round');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t//RESIZE IMAGE\r\n");
      out.write("\r\n");
      out.write("\t\t\t//Add Image Resize Functionality to Chrome and Safari\r\n");
      out.write("\t\t\t//webkit browsers don't have image resize functionality when content is editable\r\n");
      out.write("\t\t\t//so let's add something using jQuery UI resizable\r\n");
      out.write("\t\t\t//another option would be opening a dialog for user to enter dimensions.\r\n");
      out.write("\t\t\tif (typeof jQuery.ui !== 'undefined' && ace.vars['webkit']) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar lastResizableImg = null;\r\n");
      out.write("\t\t\t\tfunction destroyResizable() {\r\n");
      out.write("\t\t\t\t\tif (lastResizableImg == null)\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\tlastResizableImg.resizable(\"destroy\");\r\n");
      out.write("\t\t\t\t\tlastResizableImg.removeData('resizable');\r\n");
      out.write("\t\t\t\t\tlastResizableImg = null;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar enableImageResize = function() {\r\n");
      out.write("\t\t\t\t\t$('.wysiwyg-editor')\r\n");
      out.write("\t\t\t\t\t\t\t.on(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'mousedown',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar target = $(e.target);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (e.target instanceof HTMLImageElement) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (!target.data('resizable')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.resizable({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\taspectRatio : e.target.width\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t/ e.target.height,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttarget.data('resizable', true);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (lastResizableImg != null) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t//disable previous resizable image\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tlastResizableImg\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.resizable(\"destroy\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tlastResizableImg\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.removeData('resizable');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tlastResizableImg = target;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t.on(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'click',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (lastResizableImg != null\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t&& !(e.target instanceof HTMLImageElement)) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdestroyResizable();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}).on('keydown', function() {\r\n");
      out.write("\t\t\t\t\t\t\t\tdestroyResizable();\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tenableImageResize();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
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
