
<%@page import="java.util.List"%>
<%@page import="models.Registre"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/bootstrap.css">
        <link rel="stylesheet" href="assets/css/bootstrap_1.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/font-awesome/fonts/FontAwesome.otf">
        <title>Contact</title>
    </head>
    <body>
        
         
      <%@include file="../include/navbar.jsp" %>
      
       <table class="table">
           <thead style="background: #000000">
               <tr style="color: #ffffff">
                    <th scope="col">Numéro</th>
                    <th scope="col">Nom et Prénoms</th>
                    <th scope="col">CIN</th>
                    <th scope="col">Téléphone</th>
                    <th scope="col">Nom d'utilisateur</th>
                    <th scope="col">Mot de passe</th>
                    <th scope="col">Confirmation</th>
                    <th scope="col">Action</th>
               </tr>
        </thead>
        <tbody>
             <%
                List<Registre> list = ( List<Registre>) request.getAttribute("registre");
                for(Registre p :list ){
             %>
                  <tr>
                      <td><%= p.getName() %></td>
                      <td><%= p.getCIN() %></td>
                      <td><%= p.getTelephone() %></td>
                      <td><%= p.getPass() %></td>
                      <td><%= p.getPassw() %></td>
                      <td> 
                          <a href="${pageContext.request.contextPath}/modifier?Id_Name=<c:out value="${p.Id_Name}"/>"class="btn btn-sm btn-outline-primary">Modification</a>
                           &nbsp;&nbsp;&nbsp;&nbsp;
                          <a href="${pageContext.request.contextPath}/supprimer?Id_Name=<c:out value="${p.Id_Name}"/>"class="btn btn-sm btn-outline-danger">Suppression</a>
                      </td>
                      
                  </tr>
              
     
  </tbody>
</table>
    </body>
    
    <!--Javascript Link-->
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery-3.5.6.min.js"></script>
    <script type="text/javascript" src="assets/js/popper.min.js"></script>
    <script type="text/javascript" src="assets/js/main.js"></script>
</html>
