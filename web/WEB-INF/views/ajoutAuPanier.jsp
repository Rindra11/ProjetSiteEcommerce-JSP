<%-- 
    Document   : ajoutproduit
    Created on : 9 mars 2023, 02:41:33
    Author     : Rindra
--%>
<%@page import="models.Panier"%>
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
    <style>
        :root{
            font-color:#143887;
            second-font:#00032A;
        }
        body{
            background: linear-gradient(80deg,#143887,#00032A);
        }
        .container {
            max-width: 400px;
            margin-top: 50vh;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 10px;
        }
        .header h2{
            font-size: 10px;
            text-align: center;
            color: red;
        }
        .bottom{
            border-radius: 10px;
            padding: 10px;
            margin: 20px;
            justify-content:center;
        }
        
    </style>
    <body>
        <div class="container">
            <div class="header">
                <h2>Ajouter au Panier</h2>
            </div>
            <form action="Produit" method="post">
                <input type="hidden" name="id_produit" value="123">
                <label for="quantite">Quantité :</label>
                <input type="number" name="quantite" id="quantite" min="1" required>
                <button class="bottom" type="submit">Ajouter au panier</button>
            </form>
        </div>
     
       

    </body>
    
    
    <!----javascript--->
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery-3.5.6.min.js"></script>
    <script type="text/javascript" src="assets/js/popper.min.js"></script>
    <script type="text/javascript" src="assets/js/main.js"></script>
</html>
