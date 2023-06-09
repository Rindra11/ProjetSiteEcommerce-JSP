<%-- 
    Document   : com
    Created on : 9 juin 2023, 12:07:53
    Author     : Rindra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        // Importez les classes nécessaires
import com.yourpackage.dao.CommandeDAO;
import com.yourpackage.model.Commande;

// ...

// Récupérez les paramètres de la requête
String produitId = request.getParameter("produitId");
int quantite = Integer.parseInt(request.getParameter("quantite"));
float prix = Float.parseFloat(request.getParameter("prix"));

// Créez l'objet Commande
Commande commande = new Commande();
commande.setProduitId(produitId);
commande.setQuantite(quantite);
commande.setPrix(prix);

// Utilisez la classe DAO pour enregistrer la commande
CommandeDAO commandeDAO = new CommandeDAO();
commandeDAO.createCommande(commande);

    </body>
</html>
