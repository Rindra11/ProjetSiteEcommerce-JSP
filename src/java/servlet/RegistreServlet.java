package servlet;

import configuration.Dbconnect;
import dao.RegistreDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Registre;


@WebServlet("/registre")
public class RegistreServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistreServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistreServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.getRequestDispatcher("/registreform.jsp").forward(request, response);
    /*
         try{
        String action = request.getServletPath();
        switch (action){
            case "/contact":
        ContactServlet.listAllRegistre(request, response);
        break;
        }
        
    }catch (Exception exception){
        exception.printStackTrace();
    }*/
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String Name = request.getParameter("Name");
     String CIN = request.getParameter("CIN");
     String Telephone = request.getParameter("Telephone");
     String Adres_Email = request.getParameter("Adres_Email");
     String pass = request.getParameter("pass");
     String passw = request.getParameter("passw");
    
     Registre res=new Registre();
     res.setName(Name);
     res.setCIN(CIN);
     res.setTelephone(Telephone);
     res.setAdres_Email(Adres_Email);
     res.setPass(pass);
     res.setPassw(passw);
     
     RegistreDAO dao=new RegistreDAO(Dbconnect.getConn());
     boolean f=dao.registreRegister(res);

     response.sendRedirect("login");
             
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
   
}
