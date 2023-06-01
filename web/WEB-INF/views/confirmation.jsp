<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Confirmation de commande</title>
    <!--styles CSS -->
</head>
<body>
    <h2>Confirmation de commande</h2>

    <h3>Merci pour votre commande !</h3>

    <p>Voici les détails de votre commande :</p>
<!--commande ici -->
    <ul>
        <li>Produit : <%= request.getParameter("produitId") %></li>
        <li>Quantité : <%= request.getParameter("quantite") %></li>
        <li>Montant total : <%= request.getParameter("montantTotal") %></li>
        
    </ul>

   
</body>
</html>

