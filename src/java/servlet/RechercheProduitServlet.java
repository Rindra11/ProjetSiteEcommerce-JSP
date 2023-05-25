package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import static java.util.Collections.list;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Produits;

@WebServlet("/RechercheProduit")
public class RechercheProduitServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RechercheProduitServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RechercheProduitServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String searchTerm = request.getParameter("search");

    // Votre code pour récupérer la liste de produits à partir de la base de données ou d'une source de données
    List<Produits> produits = new ArrayList<>(); // Remplacez ceci par le code pour récupérer la liste de produits

    List<Produits> filteredList = new ArrayList<>();
    for (Produits produit : produits) {
        if (produit.getNom_prod().toLowerCase().contains(searchTerm.toLowerCase())) {
            filteredList.add(produit);
        }
    }

    request.setAttribute("produits", filteredList);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/Produit");
    dispatcher.forward(request, response);
}



   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
