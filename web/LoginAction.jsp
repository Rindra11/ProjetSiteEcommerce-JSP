<%@page import="java.sql.*"%>
<%@page import="configuration.Dbconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username=request.getParameter("username");
    String passsword=request.getParameter("passsword");
    if("".equals(username)&& "".equals(passsword)){
        session.setAttribute("username", username);
        response.sendRedirect("home");
    }
    else
    {
        int z=0;
        try
        {
          Connection conn=Dbconnect.getConn();
          Statement st=conn.createStatement();
          ResultSet res=st.executeQuery("select * from login where username='"+username+"' and passsword='"+passsword+"'");
          while(res.next())
          {
              z=1;
              session.setAttribute("username", username);
              response.sendRedirect("home");
          }
          if(z==0)
              response.sendRedirect("login?msg=notexist");
        }
        catch(Exception e)
        {
            System.out.println(e);
            response.sendRedirect("login?msg=invalide");
            
        }
    }
%>
