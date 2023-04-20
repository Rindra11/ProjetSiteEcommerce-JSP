package servlet;

import configuration.Dbconnect;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.text.AbstractDocument;
import javax.xml.bind.ParseConversionEvent;
import models.Produits;
import dao.ProduitsDAO;

@WebServlet("/Produit")
public class ProduitServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProduitServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProduitServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/produit.jsp").forward(request, response);
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String Id_prod = request.getParameter("Id_prod");
     String Nom_prod = request.getParameter("Nom_prod");
     String Qte_prod = request.getParameter("Qte_prod");
     String Prix_prod = request.getParameter("Prix_prod");
     
     Produits pdo=new Produits();
    // pdo.setId_prod(Id_prod);
     pdo.setNom_prod(Nom_prod);
     pdo.setQte_prod(Qte_prod);
     pdo.setPrix_prod(Prix_prod);
     
     
    // ProduitsDAO dao=new ProduitsDAO(Dbconnect.getConn());
       
    // boolean n=dao.produitProduits(pdo);

     response.sendRedirect("Shop");
             
          
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
