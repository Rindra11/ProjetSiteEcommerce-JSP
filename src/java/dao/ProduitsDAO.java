package dao;

import configuration.Dbconnect;
import static configuration.Dbconnect.getConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Produits;


public class ProduitsDAO {
    private static String query = "";
    private static PreparedStatement ps = null;
    private static ResultSet res = null;
    private static Connection conn = null;
    
    public ProduitsDAO(){
        super();
       this.conn = conn;
    }
    
    public static List<Produits> findAll() throws Exception {
        List<Produits> produitList = new ArrayList<>();
        query = "SELECT * FROM produitss";
        conn = connect();
        if(conn != null){
            Statement st = conn.createStatement();
            res = st.executeQuery(query);
            while(res.next()){
               produitList.add(new Produits(res.getInt("Id_prod"),res.getString("Nom_prod"),res.getString("Qte_prod"), res.getString("Pix_prod")));
           
            }
            System.out.println("\n ==> Fonctionne\n");
        }
        return produitList;
    }
    
    public static int update(Produits produit) throws Exception {
        query = "UPDATE produitss SET Nom_prod=?,Qte_prod=?,Prix_prod=? WHERE Id_prod=?";
        conn = connect();
        if (conn != null && produit != null) {
            ps = conn.prepareStatement(query);
            ps.setString(1, produit.getNom_prod());
            ps.setString(2, produit.getQte_prod());
            ps.setString(3, produit.getPrix_prod());
            ps.setInt(4, produit.getId_prod());
            System.out.println("\n ==>Modification success");
            return ps.executeUpdate();
            
        }
        return 0;
    }
     public static Produits findById(int Id_prod) throws Exception {
         query = "SELECT * FROM produitss WHERE Id_prod=?";
         Connection conn = getConn();
         if(conn != null && Id_prod !=0){
             ps = conn.prepareStatement(query);
             ps.setInt(1, Id_prod);
             res = ps.executeQuery();
             
             if (res.next()) {
                 System.out.println("\n ==> Trouvée : "+res.getString("Nom_prod")+"\n");
                 return new Produits(res.getInt("Id_prod"),res.getString("Nom_prod"),res.getString("Qte_prod"),res.getString("Prix_prod"));
                 
             }else {
                 //return Produits (Id_prod, "Non Non");
             }
         } 
         return null;
         
     } 

    
     
     public boolean produitProduits(Produits pdo)
   {
       
       boolean n=false;
       try{
           String sql="insert into produitss(Id_prod,Nom_prod,Qte_prod,Prix_prod) values(?,?,?,?)";
           
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setInt(1,pdo.getId_prod());
           ps.setString(2,pdo.getNom_prod());
           ps.setString(3,pdo.getQte_prod());
           ps.setString(4,pdo.getPrix_prod());
           
           ps.executeUpdate();
               
           }catch (Exception e)
           {
            //   
           e.printStackTrace();
       }
       
       return n;
   }
     /*
     public  int insert(Produits produit)throws Exception {
         int nb = 0;
         query = "INSERT INTO produit(Id_prod,Nom_prod,Qte_prod,Prix_prod) VALUES(?,?,?,?,?)";
         conn = connect();
         if (conn != null && produit != null){
             ps = conn.prepareStatement(query);
             ps.setInt(1, produit.getId_prod());
             ps.setString(2, produit.getNom_prod());
             ps.setString(3, produit.getQte_prod());
             ps.setDouble(4, produit.getPrix_prod());
            
             ps.executeUpdate();
         }
        return nb;
     }*/
     
 public static int delete(int Id_prod) throws Exception {
     int nb = 0;
     query = "DELETE FROM produit WHERE Id_prod=?";
     conn = connect();
     if(conn != null && Id_prod !=0) {
         ps = conn.prepareStatement(query);
         ps.setInt(1, Id_prod);
         
         nb = ps.executeUpdate();
         System.out.println("\n==> Suppression succès");
               
     }
     return nb;
 }

    private static Connection connect() throws Exception{
       return Dbconnect.getConn();
    }
     
    
   
  
}
    
