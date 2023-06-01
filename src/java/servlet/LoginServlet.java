package servlet;

import configuration.Dbconnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.coyote.http11.Http11AprProcessor;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    
  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.getRequestDispatcher("/Login.jsp").forward(request, response);
    }
       
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String username = request.getParameter("username");
        String passsword = request.getParameter("passsword");
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
       
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = Dbconnect.getConn();
            PreparedStatement ps = conn.prepareStatement("select * from login where username = ? and passsword = ?");
            ps.setString(1, username);
            ps.setString(2, passsword);
            
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                
                session.setAttribute("name", res.getString("username"));
                dispatcher = request.getRequestDispatcher("/Homepage.jsp");
                
                dispatcher.forward(request, response);
             
            }else {
            
                 dispatcher = request.getRequestDispatcher("Login.jsp");
                 dispatcher.forward(request, response);
                 request.setAttribute("status", "failed");
                
               
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }

    
    