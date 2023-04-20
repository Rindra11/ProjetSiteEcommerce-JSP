<%-- 
    Document   : logout
    Created on : 24 mars 2023, 15:22:34
    Author     : Rindra
--%>
<%@page import="configuration.Dbconnect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <link rel="stylesheet" href="assets/css/stylecss.css">
        <title>Déconnexion</title>
    </head>
    <body>
         <%
            Connection con = Dbconnect.getConn();
            out.print(con);
        %>
    </body>
    
    <script type="text/javascript" >
        <%@include file="../assets/js/bootstrap.min.js"%>
        <%@include file="../assets/js/jquery-3.5.6.min.js"%>
        <%@include file="../assets/js/popper.min.js"%>
        <%@include file="../assets/js/main.js"%>
    </script>
</html>
