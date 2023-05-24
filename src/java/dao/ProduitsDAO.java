package dao;

import configuration.Dbconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import models.Produits;



public class ProduitsDAO {
        private static Connection conn = null;
        private static PreparedStatement ps = null;
        private static ResultSet res = null;
        private static String query = "";
    
    public ProduitsDAO (Connection conn){
       super();
       this.conn = conn;
    }
    
     public static List<Produits> findAll() throws Exception {
       List<Produits> produitList = new ArrayList<>();
       query = "SELECT * FROM registre";
       conn = connect();
       if (conn != null){
            Statement statement = conn.createStatement();
            res = statement.executeQuery(query);
            while(res.next()){
                produitList.add(new Produits(res.getInt("Id_prod"), res.getString("Nom_prod"), res.getString("Qte_prod"), res.getFloat("Prix_prod")));
            }
            System.out.println("\n ==> Oui\n");
       }
          return produitList;
       
   }
     
     public boolean produitsProduit(Produits pdo)
   {  
       boolean f=false;
       try{
           String sql="insert into produitss(Id_prod,Nom_prod,Qte_prod,Prix_prod) values(?,?,?,?)";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setInt(1,pdo.getId_prod());
           ps.setString(2,pdo.getNom_prod());
           ps.setString(3,pdo.getQte_prod());
           ps.setFloat(4,pdo.getPrix_prod());
           ps.executeUpdate();
               
           }catch (Exception e){  
           e.printStackTrace();
       }
       return f;
   }
     
      private static Connection connect() throws Exception{
       return Dbconnect.getConn();
    }
}
