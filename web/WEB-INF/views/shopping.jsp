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
        <link rel="stylesheet" href="assets/css/styless.css">
        <link rel="stylesheet" href="assets/css/prod.css">
        <title>Shopping</title>
    </head>
    <body>
       
       <%@include file="../include/navbar.jsp" %>
         <!--Esayye-->    
               <section id="product1" class="section-p1">
        <h2>Acheter vos vetêments préféreés</h2>
        <p>Faite vos choix,nos produits sont touts neufs....</p>
        <div class="pro-container">
            <div class="pro">
                <img src="assets/image/sary10.png" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4></h4>
                   <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>

            <div class="pro">
                <img src="assets/image/img6.png" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4>1200000 Ariary</h4>
                    <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>

            <div class="pro">
                <img src="assets/image/sary3.png" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4>160000 Ariary</h4>
                    <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>

            <div class="pro">
                <img src="assets/image/img7.png" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4>39000 Ariary</h4>
                    <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>

            <div class="pro">
                <img src="assets/image/sary9.png" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4>250000 Ariary</h4>
                    <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>

            <div class="pro">
                <img src="assets/image/sary21.png" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4>2500000 Ariary</h4>
                    <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>

            <div class="pro">
                <img src="assets/image/sary.jpg" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4>8500000 Ariary</h4>
                    <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>

            <div class="pro">
                <img src="assets/image/sary10.png" alt="">
                <div class="des">
                    <span></span>
                    <h5>Prix abordable</h5>
                    <h4>75000 Ariary</h4>
                    <button>Acheter &nbsp;<a href="#"><i class="fa fa-shopping-cart" style="color: #ac2925;"></i></a></button>
                </div>
            </div>
        </div>
        <input type="text" name="" id="" required>
    </section>


    <section id="banner" class="section-m1">
        <h4>Vita MALAGASY</h4>
        <h5>Tout propre et Bien à porter</h5>
        <h2>Voir et apprécier nos produits--- <span>50%</span>---Chaque vetêments vous méritent</h2>
        <button class="normal">Explorer maintenant</button>
    </section>
           <jsp:include page="../include/footer.jsp" />        
      
    </body>
    
    
    <!--Javascript Link-->
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery-3.5.6.min.js"></script>
    <script type="text/javascript" src="assets/js/popper.min.js"></script>
    <script type="text/javascript" src="assets/js/main.js"></script>
 
</html>
