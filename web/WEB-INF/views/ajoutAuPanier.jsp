<%-- 
    Document   : ajoutproduit
    Created on : 9 mars 2023, 02:41:33
    Author     : Rindra
--%>

<%@page import="dao.PanierDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/bootstrap.css">
        <link rel="stylesheet" href="assets/css/bootstrap_1.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/font-awesome/fonts/FontAwesome.otf">
        <title>Ajout produit</title>
    </head>
    <body>
        
        <form action="Produit" method="post">
            <input type="hidden" name="id_produit" value="123">
            <label for="quantite">Quantité :</label>
            <input type="number" name="quantite" id="quantite" min="1" required>
            <button type="submit">Ajouter au panier</button>
      </form>

        
       

    </body>
    
    
    <!----javascript--->
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery-3.5.6.min.js"></script>
    <script type="text/javascript" src="assets/js/popper.min.js"></script>
    <script type="text/javascript" src="assets/js/main.js"></script>
</html>
