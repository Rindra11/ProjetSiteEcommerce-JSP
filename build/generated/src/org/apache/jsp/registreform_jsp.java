package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registreform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap_1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/fonts/FontAwesome.otf\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/registre.css\">\n");
      out.write("        <title>Registre</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("             <img src=\"assets/image/adm.png\"/>\n");
      out.write("            <div class=\"title\">Inscription</div>\n");
      out.write("            &nbsp;&nbsp;&nbsp;\n");
      out.write("            \n");
      out.write("            <form action=\"RegistreServlet\" method=\"post\">\n");
      out.write("            <div class=\"user-details\">\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Nom et Prénoms:</span> \n");
      out.write("                    <input type=\"text\"  name=\"Name\"  placeholder=\"Saiser votre nom\" autocomplete=\"off\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Carte d'Identité Nationale:</span> \n");
      out.write("                    <input type=\"number\" name=\"CIN\"  placeholder=\"Saiser votre CIN\" autocomplete=\"off\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Téléphone:</span> \n");
      out.write("                    <input type=\"number\" name=\"Telephone\"  placeholder=\"Saiser votre numéro\" autocomplete=\"off\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Adresse Email :</span> \n");
      out.write("                    <input type=\"email\"  name=\"Adres_Email\"  placeholder=\"Saiser votre adresse EMAIL\" autocomplete=\"off\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Mot de passe:</span> \n");
      out.write("                    <input type=\"password\"  name=\"pass\" placeholder=\"Saiser votre mot de passe\" autocomplete=\"off\" required>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Confirmer :</span> \n");
      out.write("                    <input type=\"password\"  name=\"passw\"  placeholder=\"Confirmer votre mot de passe\" autocomplete=\"off\" required>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"button\">\n");
      out.write("                      <input type=\"submit\" value=\"S'incrire\">  \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("            <!--lien login-->\n");
      out.write("   <h6><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login\">Connexion</a></h6>\n");
      out.write("          </div>\n");
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
