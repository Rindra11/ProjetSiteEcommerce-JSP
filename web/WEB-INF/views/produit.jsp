<%@page import="com.sun.tracing.ProbeName"%>
<%@page import="com.sun.org.apache.xml.internal.utils.SystemIDResolver"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="models.Produits"%>
<%@page import="configuration.Dbconnect"%>
<%@page import="java.sql.Connection"%>
<%@page import="dao.ProduitsDAO"%>
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
 
        <title>Produit</title>
        
        <style>
            .container {
  max-width: 400px;
  margin: 0 auto;
  padding: 20px;
  background-color: #ffffff;
  border-radius: 10px;
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
    </head>
    <body>
      
      <%@include file="../include/navbar.jsp" %>
        <br><br>
        <div class="rows">
            <div class="col">
                <div class="container">
            <form action="Produit" method="post">
              <div class="user-details">
                <div class="input-box">
                  <span class="details">Identité du produit:</span>
                  <input type="number" name="Id_prod" placeholder="Saisir son identité" autocomplete="off" required>
                </div>
                <div class="input-box">
                  <span class="details">Nom du produit:</span>
                  <input type="text" name="Nom_prod" placeholder="Saisir le nom" autocomplete="off" required>
                </div>
                <div class="input-box">
                  <span class="details">Quantité:</span>
                  <input type="number" name="Qte_prod" placeholder="Saisir la quantité" autocomplete="off" required>
                </div>
                <div class="input-box">
                  <span class="details">Prix :</span>
                  <input type="number" name="Prix_prod" placeholder="Saisir le prix" autocomplete="off" required>
                </div>
                <div class="input-box">
                  <span class="details">Image :</span>
                  <input type="file" name="image_prod" placeholder="" autocomplete="off" required>
                </div>
              </div>
              <div class="button">
                <input type="submit" value="Ajouter">
              </div>
            </form>
          </div>
<!--table--->
    <div class="col">
          <br><br><br>
            <table class="table" style="width:50%; justify-content:center;">
             <thead class="thead-dark" style="background: #000000;">
                 <tr style="color: #ffffff;">
                    <th scope="col" style="width: 10%">Numéro</th>
                    <th scope="col" style="width: 10%">Nom du produit</th>
                    <th scope="col" style="width: 10%">Quantité</th>
                    <th scope="col" style="width: 10%">Prix</th>
                    <th scope="col" style="width: 10%">Image</th>
                    <th scope="col" style="width: 10%">Action</th>
                </tr>
             </thead>
        <tbody>

           <%
            List<Produits> list = ( List<Produits>) request.getAttribute("produits");
           for(Produits p :list ){
           %>
             <tr>
                 <td scope="row"><%= p.getId_prod() %></td>
                 <td scope="row"><%= p.getNom_prod()%></td>
                 <td scope="row"><%= p.getQte_prod()%></td>
                 <td scope="row"><%= p.getPrix_prod()%></td> 
                 <td>
                     <img src="/assets/image/" alt="Description de l'image" width="100" height="100">
                 </td>
                 <td>
                    <a href="${pageContext.request.contextPath}/modifier?Id_prod=<c:out value="<%= p.getId_prod() %>"/>"class="btn btn-sm btn-outline-primary">Modification</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/supprimer?Id_prod=<c:out value="<%= p.getId_prod() %>"/>"class="btn btn-sm btn-outline-danger">Suppression</a>
                     <!--option de commande -->
                <form action="AjoutAuPanier" method="post">
                  <input type="hidden" name="Id_prod" value="<%= p.getId_prod() %>">
                  <button type="submit" class="btn btn-sm btn-outline-success">Ajouter au panier</button>
                </form>
                 </td>
            </tr>
           <%
           }
            
        %>
  </tbody>
</table>
</div>
            </div>
        </div>
        
      
        
    </body>
    
    <!--Javascript Link-->
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery-3.5.6.min.js"></script>
    <script type="text/javascript" src="assets/js/popper.min.js"></script>
    <script type="text/javascript" src="assets/js/main.js"></script>
</html>
