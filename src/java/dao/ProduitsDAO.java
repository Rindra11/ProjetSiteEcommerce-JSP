package dao;

import configuration.Dbconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
     
     public boolean  supprimerProduit (int Id_prod)
     {
         boolean s=false;
         try{
             String sql = "DELETE FROM produitss WHERE Id_prod = ?";
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setInt(1,Id_prod);
                ps.executeUpdate();
               
           }catch (Exception e){  
           e.printStackTrace();
       }
       return s;
         
     }
      /* supprimer donnée reo
      public void supprimerProduit(int idProduit) {
        // Établir la connexion à la base de données
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/siteecommerce", "root", "")) {
            // Préparer la requête SQL pour supprimer le produit
            String sql = "DELETE FROM produitss WHERE Id_prod = ?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                // Définir le paramètre de l'identifiant du produit à supprimer
                statement.setInt(1, idProduit);
                // Exécuter la requête de suppression
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer les exceptions appropriées
        }
    }*/

     
      private static Connection connect() throws Exception{
       return Dbconnect.getConn();
    }
}
