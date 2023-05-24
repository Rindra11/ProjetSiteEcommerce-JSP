<%@page import="configuration.Dbconnect"%>
<%@page import="java.sql.Connection"%>
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
        <link rel="stylesheet" href="assets/css/registre.css">
        <title>Registre</title>
       
    </head>
    <body>
        
        <div class="container">
             <img src="assets/image/adm.png"/>
            <div class="title">Inscription</div>
            &nbsp;&nbsp;&nbsp;       
            <form action="registre" method="post">
            <div class="user-details">
                <div class="input-box">
                    <span class="details">Nom et Prénoms:</span> 
                    <input type="text"  name="Name"  placeholder="Saiser votre nom" autocomplete="off" required>
                </div>
                <div class="input-box">
                    <span class="details">Carte d'Identité Nationale:</span> 
                    <input type="number" name="CIN"  placeholder="Saiser votre CIN" autocomplete="off" required>
                </div>
                <div class="input-box">
                    <span class="details">Téléphone:</span> 
                    <input type="number" name="Telephone"  placeholder="Saiser votre numéro" autocomplete="off" required>
                </div>
                <div class="input-box">
                    <span class="details">Adresse Email :</span> 
                    <input type="email"  name="Adres_Email"  placeholder="Saiser votre adresse EMAIL" autocomplete="off" required>
                </div>
                <div class="input-box">
                    <span class="details">Mot de passe:</span> 
                    <input type="password"  name="pass" placeholder="Saiser votre mot de passe" autocomplete="off" required>
                </div>
                 <div class="input-box">
                    <span class="details">Confirmer :</span> 
                    <input type="password"  name="passw"  placeholder="Confirmer votre mot de passe" autocomplete="off" required>
                </div>
            </div> 
            <div class="button">
                      <input type="submit" href="${pageContext.request.contextPath}/login" value="Enregistrer">  
            </div>
        </form>
            
            
           
           
            <!--lien login-->
   <h6><a href="${pageContext.request.contextPath}/login">Connexion</a></h6>
          </div>
         
    </body>
    
    <!--Javascript Link-->
       <script type="text/javascript">
        <%@include file="../assets/js/bootstrap.min.js"%>
        <%@include file="../assets/js/jquery-3.5.6.min.js"%>
        <%@include file="../assets/js/popper.min.js"%>
        <%@include file="../assets/js/main.js"%>
    </script>
</html>
