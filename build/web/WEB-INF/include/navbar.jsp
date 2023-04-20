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
        <link rel="stylesheet" href="assets/css/page.css">
        <title>Navbar</title>
    </head>
    <body>
        <div class="text-center my-5">
            <nav class="navbar navbar-light mb-4" style="background-color: #e3f2fd">
                <h4>
                    <a href="${pageContext.request.contextPath}/home" style="color:#f39c12">Menu principal</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/Produit" style="color:#f39c12">Ajouter un produit</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/gerer" style="color:#f39c12">Gérer les commandes</a>
               </h4>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2"  type="search" placeholder="entrer vos recherches....." aria-label="Search">
      <button class="btn btn-danger my-2 my-sm-0" type="submit">Recherche</button>
    </form>
            </nav>
        </div>
    
    </body>
</html>
