<%@page import="java.sql.DriverManager"%>
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
        <link rel="stylesheet" href="assets/css/page.css">
 
        <title>Home</title>
        <style>         
            #hero {
             background-image: url("assets/image/img6.png");
             width: 100%;
             height: 80vh;
             background-size: cover;
             background-position: top 25% right 0;
             padding: 0 80px;
             display: flex;
             flex-direction:column;
             align-items: flex-start;
             justify-content: center;  
            }
            .navbar{
                background: linear-gradient(135deg, #71b7e6,#9b59b6);
                width: 100%;
}
            #newsletter{
                background-image: url("assets/image/Sary8.png");
                display: flex;
                justify-content: space-between;
                flex-wrap: wrap;
                align-items: center;
                background-repeat: no-repeat;
                background-position: 20% 30%;
                background-color: #1c2a39;
                padding: 20px;
            }
        </style>
    </head>
    <body>
          
        <nav class="navbar navbar-light bg-light shadow-lg p-3 mb-10" style="position: fixed;">
        <div class="header">
             <a href="#"><img src="assets/image/sary6.png" class="logo" alt=""></a>
           <h3>
        <a href="${pageContext.request.contextPath}/home" > Accueil</a>
        &nbsp;&nbsp;&nbsp;
        <a href="${pageContext.request.contextPath}/Shop">Shopping</a>
         &nbsp;&nbsp;&nbsp;
        <a href="${pageContext.request.contextPath}/Produit">Produits</a>
        &nbsp;&nbsp;&nbsp;
        <a href="${pageContext.request.contextPath}/Contact">Contact</a>
           </h3> 
     <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2"  type="search" placeholder="entrer vos recherches....." aria-label="Search">
      <button class="btn btn-danger my-2 my-sm-0" type="submit">Recherche</button>
    </form> 
        </div>
    </nav>
           <section id="hero">
             <div class="label">
                 <h4 style="color:#080808;">Bienvenue--Welcome--Tongasoa</h4>
               <h2>Dans notre Site Ecommerce</h2>
               <p style="color:#080808;">A vous le plaisir ......</p>
               <button>Shopping</button>
             </div>
           </section>
           
           <section id="newsletter">
               <div class="newstext">
                   <h4>Veuillez connecter à notre Site</h4>
                   <p>Créer votre compte ou connecté tout de suite s'y en a...</p>
               </div>
               <div class="form">
                   <input type="text" placeholder="Bonjour....">
                   <a href="${pageContext.request.contextPath}/registre" class="normal"><button>Se Connecter</button></a>
               </div>
           </section>
    </body>
     
   
   <!--Footer--> 
   <footer class="section-p1">
      <div class="col">
          <h4>Contact</h4>
          <p><strong><img src="assets/icons/address1.png"></strong>Imandry--Isaha Fianarantsoa-301-</p>
          <p><strong><img src="assets/icons/phone.png"></strong>+261 32 97 817 84 / 34 56 510 82</p>
          <p><strong><img src="assets/icons/time.png"></strong> 09:00 - 16:00 , Lundi - Vendredi</p>
        <div class="follow">
            <h5>Abonnez-vous</h5>
            <div class="icon">
                <a href="#"><i class="fa fa-facebook"></i></a>
                <a href="https://twitter.com/home"><i class="fa fa-twitter"></i></a>
                <a href="https://www.linkedin.com/feed/"><i class="fa fa-linkedin-square"></i></a>
            </div>
        </div>
       </div>
       
       <div class="col">
           <h4>A propos</h4>
           <a href="#">Concernant</a>
           <a href="#">Police Privée</a>
           <a href="#">Thèrme et Conditions</a>
           <a href="#">Contact Nous</a>
       </div>
       
       <div class="col">
           <h4>Mon Compte</h4>
           <a href="#">Sign In</a>
           <a href="#">Aide</a>
           <a href="#">Ordre</a>
       </div>
       
    </footer>
    
    
    <!--Javascript Link-->
    <script type="text/javascript">
        <%@include file="../assets/js/bootstrap.min.js"%>
        <%@include file="../assets/js/jquery-3.5.6.min.js"%>
        <%@include file="../assets/js/popper.min.js"%>
        <%@include file="../assets/js/main.js"%>
    
    </script>
</html>
