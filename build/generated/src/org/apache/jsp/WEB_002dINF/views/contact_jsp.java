package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import configuration.Dbconnect;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/views/../include/navbar.jsp");
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

      out.write("\n");
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
      out.write("        <title>Contact</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/page.css\">\n");
      out.write("        <title>Navbar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"text-center my-5\">\n");
      out.write("            <nav class=\"navbar navbar-light mb-4\" style=\"background-color: #e3f2fd\">\n");
      out.write("                <h4>\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\" style=\"color:#f39c12\">Menu principal</a>\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Produit\" style=\"color:#f39c12\">Ajouter un produit</a>\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/gerer\" style=\"color:#f39c12\">Gérer les commandes</a>\n");
      out.write("               </h4>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\"  type=\"search\" placeholder=\"entrer vos recherches.....\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-danger my-2 my-sm-0\" type=\"submit\">Recherche</button>\n");
      out.write("    </form>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("      \n");
      out.write("       <table class=\"table\">\n");
      out.write("           <thead style=\"background: #000000\">\n");
      out.write("               <tr style=\"color: #ffffff\">\n");
      out.write("      <th scope=\"col\">Numéro</th>\n");
      out.write("      <th scope=\"col\">Nom et Prénoms</th>\n");
      out.write("      <th scope=\"col\">CIN</th>\n");
      out.write("      <th scope=\"col\">Téléphone</th>\n");
      out.write("      <th scope=\"col\">Nom d'utilisateur</th>\n");
      out.write("      <th scope=\"col\">Mot de passe</th>\n");
      out.write("      <th scope=\"col\">Confirmation</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");

       if(Order != null){
       for(Order o:orders){
      out.write("\n");
      out.write("            <tr>\n");
      out.write("           <th scope=\"row\"></th>\n");
      out.write("           <td>");
      out.print( o.getName());
      out.write("</td>\n");
      out.write("           <td></td>\n");
      out.write("           <td></td>\n");
      out.write("           <td></td>\n");
      out.write("           <td></td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("           ");
 }
       }
       
      out.write("\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <!--Javascript Link-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/bootstrap.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/jquery-3.5.6.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/main.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/popper.min.js\">\n");
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
