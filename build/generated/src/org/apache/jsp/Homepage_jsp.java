package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap_1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/fonts/FontAwesome.otf\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write(" \n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"text-center my-3\">\n");
      out.write("    <h1 class=\"font-weight-bolder text-warning\">Site E_COMMERCE ELECTRONIQUE</h1>\n");
      out.write("    <nav class=\"navbar navbar-light bg-light shadow-lg p-5 mb-4\" >\n");
      out.write("    <h3>\n");
      out.write("        <a class=\"font-italic text-dark\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/new\" >Accueil</a>\n");
      out.write("        &nbsp;&nbsp;&nbsp;\n");
      out.write("        <a class=\"font-italic text-dark\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/list\">Shopping</a>\n");
      out.write("         &nbsp;&nbsp;&nbsp;\n");
      out.write("        <a class=\"font-italic text-dark\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/list\">Produits</a>\n");
      out.write("        &nbsp;&nbsp;&nbsp;\n");
      out.write("        <a class=\"font-italic text-dark\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/list\">Contact</a>\n");
      out.write("    </h3>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"entrer vos produits.....\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-danger my-2 my-sm-0\" type=\"submit\">Recherche</button><br><br>&nbsp;&nbsp;&nbsp;\n");
      out.write("      <h6><a class=\"font-italic text-dark\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout.jsp\">Déconnexion</a></h6> \n");
      out.write("      \n");
      out.write("    </form>  \n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Image -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("   <!--Footer--> \n");
      out.write("    <footer>\n");
      out.write(" <div class=\"footer-content\">\n");
      out.write(" <h2>Ralaikoa Rindra Nantenaina</h2>\n");
      out.write(" <a href=\"#\">ralaikoanantenaina@gmail.com</a>\n");
      out.write(" <p>copyright &copy;2023 <a href=\"#\">SakaManatody</a>\n");
      out.write("  <ul class=\"socials\">\n");
      out.write("  <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("  <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("  <li><a href=\"#\"><i class=\"fa fa-linkedin-square\"></i></a></li>\n");
      out.write(" </ul>\n");
      out.write(" </div>\n");
      out.write("</footer>\n");
      out.write("    \n");
      out.write("    <!--Javascript Link-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/bootstrap.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/jquery-3.5.6.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/main.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/popper.min.js\">\n");
      out.write("   \n");
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
