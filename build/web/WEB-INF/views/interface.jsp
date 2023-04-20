<%-- 
    Document   : interface
    Created on : 24 févr. 2023, 08:31:25
    Author     : Rindra
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="css/font-awesome/fonts/FontAwesome.otf">
        <style type="text/css">
            <%@include file="../assets/css/bootstrap.css" %> 
            <%@include file="../assets/css/style.css" %> 
        </style>
    <title>Interface</title>    
    </head>
    <body>
        <div class="text-center my-3">
    <h1 class="font-weight-bolder text-warning">Site E_COMMERCE ELECTRONIQUE</h1>
    <nav class="navbar navbar-light bg-light shadow-lg p-5 mb-4" >
   
    <h3>
        <a class="font-italic text-dark" href="${pageContext.request.contextPath}/new" >Accueil</a>
        &nbsp;&nbsp;&nbsp;
        <a class="font-italic text-dark" href="${pageContext.request.contextPath}/list">Shopping</a>
         &nbsp;&nbsp;&nbsp;
        <a class="font-italic text-dark" href="${pageContext.request.contextPath}/list">Produits</a>
        &nbsp;&nbsp;&nbsp;
        <a class="font-italic text-dark" href="${pageContext.request.contextPath}/list">Contact</a>
    </h3>
    
    
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="entrer vos produits....." aria-label="Search">
      <button class="btn btn-danger my-2 my-sm-0" type="submit">Recherche</button><br><br>&nbsp;&nbsp;&nbsp;
      <h6><a class="font-italic text-dark" href="${pageContext.request.contextPath}/logout.jsp">Déconnexion</a></h6> 
      
    </form>  
    </nav>
</div>

<!-- Image -->
<div class="card shadow mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="assets/image/xd.jpg"/>
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">4664</h5>
        <p class="card-text">RALAIKOA Rindra Nantenain</p>
        <p class="card-text"><small class="text-muted"></small></p>
      </div>
    </div>
  </div>
</div>

<div class="card shadow mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="/WEF-INF/assets/image/xd.jpg"/>
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">4664</h5>
        <p class="card-text">RALAIKOA Rindra Nantenain</p>
        <p class="card-text"><small class="text-muted"></small></p>
      </div>
    </div>
  </div>
</div>

</body>

<footer>
 <div class="footer-content">
 <h2>Ralaikoa Rindra</h2>
 <p>copyright &copy;2023 <a href="#">Developpeuse</a>
  <ul class="socials">
  <li><a href="#"><i class="fa-facebook"></i></a></li>
  <li><a href="#"><i class="fa fa-twitter"></i></a></li>
  <li><a href="#"><i class="fa fa-linkedin-square"></i></a></li>
 </ul>
 </div>
</footer>

<script type="text/javascript">
<%@include file="../assets/js/bootstrap.min.js"%>
<%@include file="../assets/js/jquery-3.5.6.min.js"%>
<%@include file="../assets/js/popper.min.js"%>
</script>
    
</html>
