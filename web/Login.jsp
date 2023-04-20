<%@page import="configuration.Dbconnect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

         <%
            String msg=request.getParameter("msg");
            if("notexist".equals(msg))
            {
           %>
           <h4>Incorrecte</h4>
           <% }%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/bootstrap.css">
        <link rel="stylesheet" href="assets/css/bootstrap_1.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/font-awesome/fonts/FontAwesome.otf">
        <link rel="stylesheet" href="assets/css/stylecss.css">
        <title>Login</title>
    </head>
    <body>
        <!--connexion--->
         <%
            Connection conn = Dbconnect.getConn();
            out.print(conn);
        %>
        <input type="hidden" id="status" value="<%= request.getAttribute("status")%>">
             
        <div class="container">
             <div class="title">Connectez-vous</div>
             <Form action="LoginAction.jsp" method="post">
                <div class="user-details">
                <div class="input-box">
                    <span class="details">Nom d'Utilisateur:</span> 
                    <input type="email" name="username" placeholder="Saiser votre email" autocomplete="off" required>
                </div>
                <div class="input-box">
                    <span class="details">Mot de passe:</span> 
                    <input type="password"  name="passsword" placeholder="********************" autocomplete="off" required>
                </div>
         </div>  
            <button type="submit" class="btn btn-sm btn-outline-danger" style="background-color: red;">s'authentifier</button>
             </form>
        </div>
        
      
    </body>
    
    <!--Javascript Link-->
    <script type="text/javascript" >
        <%@include file="../assets/js/bootstrap.min.js"%>
        <%@include file="../assets/js/jquery-3.5.6.min.js"%>
        <%@include file="../assets/js/popper.min.js"%>
        <%@include file="../assets/js/main.js"%>
            
            
        var status = document.getElementById("status").value;
        if(status == "success!"){
            swal("Félicitations", "vous êtes connectée");
        }  
    </script>
</html>
