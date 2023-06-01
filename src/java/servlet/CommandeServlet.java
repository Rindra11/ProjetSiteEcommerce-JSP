package servlet;

import configuration.Dbconnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Produits;

@WebServlet("/Commander")
public class CommandeServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CommandeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CommandeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         List<Produits> produitses = new  ArrayList<>();
        try {
            ResultSet rs = Dbconnect.getConn().createStatement().executeQuery("SELECT * FROM produitss");
            while(rs.next())
              {
                  Produits p = new Produits();
                  p.setId_prod(rs.getInt("Id_prod"));
                  p.setNom_prod(rs.getString("Nom_prod"));
                  p.setPrix_prod(rs.getFloat("Prix_prod"));
                  p.setQte_prod(rs.getString("Qte_prod"));
                  produitses.add(p);
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletProduit.class.getName()).log(Level.SEVERE, null, ex);
        }
               request.setAttribute("produits", produitses);
                request.getRequestDispatcher("/WEB-INF/views/commander.jsp").forward(request, response);
                processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       // Récupérer les valeurs du formulaire
            String produitId = request.getParameter("produitId");
            String Qte_prod = request.getParameter("Qte_prod");
            String Prix_prod = request.getParameter("Prix_prod");

            // Effectuer le calcul du montant total
            double montantTotal = Double.parseDouble(Prix_prod) * Integer.parseInt(Qte_prod);

            // Autres traitements liés à la commande...

            // Rediriger vers la page de confirmation de commande
               response.sendRedirect("Confirmation");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
