package dao;

import configuration.Dbconnect;
import static configuration.Dbconnect.getConn;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;
import models.Registre;


public class RegistreDAO {
    
        private static Connection conn = null;
        private static PreparedStatement ps = null;
        private static ResultSet res = null;
        private static String query = "";
   
   public RegistreDAO(Connection conn){
       super();
       this.conn = conn;
   }
   
   public static List<Registre> findAll() throws Exception {
       List<Registre> registreList = new ArrayList<>();
       query = "SELECT * FROM registre";
       conn = connect();
       if (conn != null){
            Statement statement = conn.createStatement();
            res = statement.executeQuery(query);
            while(res.next()){
                registreList.add(new Registre(res.getInt("Id_name"), res.getString("Name"), res.getString("CIN"), res.getString("Telephone"), res.getString("Adres_Email"), res.getString("pass"), res.getString("passw")));
            }
            System.out.println("\n ==> Oui\n");
       }
          return registreList;
       
   }
   
    public static int update(Registre registre) throws Exception {
        query = "UPDATE registre SET Name=?,CIN=?,Telephone=?,Adres_Email=?,pass=?;passw=? WHERE Id_name=?";
        conn = connect();
        if (conn != null && registre != null) {
            ps = conn.prepareStatement(query);
            ps.setString(1, registre.getName());
            ps.setString(2, registre.getCIN());
            ps.setString(3, registre.getTelephone());
            ps.setString(4, registre.getAdres_Email());
            ps.setString(5, registre.getPass());
            ps.setString(6, registre.getPassw());
            ps.setInt(7, registre.getId_name());
            System.out.println("\n ==>Modification success");
            return ps.executeUpdate();
            
        }
        return 0;
    }
        
 public static int delete(int Id_name) throws Exception {
     int nb = 0;
     query = "DELETE FROM registre WHERE Id_prod=?";
     conn = connect();
     if(conn != null && Id_name !=0) {
         ps = conn.prepareStatement(query);
         ps.setInt(1, Id_name);
         
         nb = ps.executeUpdate();
         System.out.println("\n==> Suppression okokok");
               
     }
     return nb;
 }
   
   public boolean registreRegister(Registre res)
   {
       
       boolean f=false;
       try{
           String sql="insert into registre(Name,CIN,Telephone,Adres_Email,pass,passw) values(?,?,?,?,?,?)";
           
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1,res.getName());
           ps.setString(2,res.getCIN());
           ps.setString(3,res.getTelephone());
           ps.setString(4,res.getAdres_Email());
           ps.setString(5,res.getPass());
           ps.setString(6,res.getPassw());
           ps.executeUpdate();
               
           }catch (Exception e)
           {
            //   
           e.printStackTrace();
       }
       
       return f;
                
  
}
    private static Connection connect() throws Exception{
       return Dbconnect.getConn();
    }
}
