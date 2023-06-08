package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.Commande;

public class CommandeDAO {
    private static Connection conn = null;
        private static PreparedStatement ps = null;
        private static ResultSet res = null;
        private static String query = "";
    
    public CommandeDAO (Connection conn){
       super();
       this.conn = conn;
    }
    
     public boolean commandeCommandes (Commande com)
   {  
       boolean c=false;
       try{
           String sql="insert into commander(Nom_prod,Prix_prod,Id_prod) values(?,?,?)";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1,com.getNom_prod());
           ps.setFloat(2,com.getPrix_prod());
           ps.setInt(3,com.getId_prod());
           ps.executeUpdate();
               
           }catch (Exception e){  
           e.printStackTrace();
       }
       return c;
   }
}
