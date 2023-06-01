<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Confirmation de commande</title>
    <!--styles CSS -->
    <style>
        body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
                padding: 20px;
            }

            h2 {
                color: #333;
                text-align: center;
            }

            h3 {
                color: #555;
            }

            ul {
                list-style-type: none;
                padding: 0;
                margin: 0;
            }

            li {
                margin-bottom: 10px;
            }

            label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }

            input[type="number"] {
                width: 50px;
            }

            button {
                padding: 10px 20px;
                background-color: #007bff;
                color: #fff;
                border: none;
                cursor: pointer;
            }

            button:hover {
                background-color: #0056b3;
            }
    </style>
    
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

