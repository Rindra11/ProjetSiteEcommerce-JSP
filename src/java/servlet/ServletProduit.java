package servlet;

import com.mysql.cj.xdevapi.DbDoc;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import configuration.Dbconnect;
import dao.ProduitsDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Produits;

@WebServlet("/Produit")
public class ServletProduit extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletProduit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProduit at " + request.getContextPath() + "</h1>");
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
        
         request.getRequestDispatcher("/WEB-INF/views/produit.jsp").forward(request, response);
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     Integer Id_prod = Integer.parseInt(request.getParameter("Id_prod"));
     String Nom_prod = request.getParameter("Nom_prod");
     String Qte_prod = request.getParameter("Qte_prod");
     Float Prix_prod = Float.parseFloat(request.getParameter("Prix_prod"));
    
       
     Produits pdo= new Produits();
     pdo.setId_prod(Id_prod);
     pdo.setNom_prod(Nom_prod);
     pdo.setQte_prod(Qte_prod);
     pdo.setPrix_prod(Prix_prod);
     
     ProduitsDAO dao=new ProduitsDAO(Dbconnect.getConn());
     boolean f=dao.produitsProduit(pdo);

     response.sendRedirect("/Produit");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
