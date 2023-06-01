<%@page import="java.util.*"%>
<%@page import="models.Produits"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/bootstrap.css">
        <link rel="stylesheet" href="assets/css/bootstrap_1.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/font-awesome/fonts/FontAwesome.otf">
        <link rel="stylesheet" href="assets/css/styless.css">
        <link rel="stylesheet" href="assets/css/prod.css">
        <link rel="stylesheet" href="/assets/css/produits.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <title>Commander</title>
    </head>

    <style>
        .container {
            max-width: 400px;
            margin-top: 10vh;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 10px;
        }
        .header h2{
            font-size: 10px;
            color: red;
        }
        .user-details {
            margin-bottom: 20px;
        }

        .user-details .input-box {
            position: relative;
            margin-bottom: 15px;
        }

        .user-details .input-box input {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: none;
            border-bottom: 1px solid #888;
            background-color: transparent;
        }

        .user-details .input-box input:focus {
            outline: none;
            border-color: #38a1db;
        }

        .user-details .input-box span.details {
            position: absolute;
            top: 0;
            left: 0;
            font-size: 14px;
            color: #888;
            pointer-events: none;
            transition: 0.5s;
        }

        .user-details .input-box input:focus + span.details,
        .user-details .input-box input:valid + span.details {
            transform: translateY(-25px);
            font-size: 12px;
            color: #38a1db;
        }

        .button input[type="submit"] {
            background-color: #38a1db;
            color: #fff;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .button input[type="submit"]:hover {
            background-color: #3194c9;
        }


    </style>
    <body>
        <%@include file="../include/navbar.jsp" %>
        <br><br>
        <div class="container">
            <div class="header">
                <h2>Faire votre Commande</h2>
            </div>
           <form action="commande" method="post">
                <select name="produitId">
                    <%  List<Produits> list = (List<Produits>) request.getAttribute("produits");
                        for (Produits p : list) {
                    %>
                    <option value="<%= p.getId_prod()%>"><%= p.getNom_prod()%></option>
                    <%
                        }
                    %>
                </select>
                <input type="hidden" name="id_produit" value="123">
                <label for="quantite">Quantité :</label>
                <input type="number" name="quantite" id="quantite" min="1" required>

                <select name="prix">
                    <%  for (Produits p : list) {
                    %>
                    <option value="<%= p.getPrix_prod()%>"><%= p.getPrix_prod()%></option>
                    <%
                        }
                    %>
                </select>

                <button class="bottom" type="submit">Commander</button>
            </form>
        </div>
    </body>
</html>
