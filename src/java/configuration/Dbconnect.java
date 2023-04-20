package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {
    
    private static Connection conn;
    //private final String DB_URL = "jdbc:mysql://localhost/siteecommerce";
   //private final String BD_USER = "root";
    //private final String DB_PASS = "";
    //private final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    
     public static Connection getConn() 
     {
        try{
            if (conn == null) {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 String url="jdbc:mysql://localhost:3306/siteecommerce";
                 String username="root";
                 String password="";
                 conn=DriverManager.getConnection(url, username, password);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return conn;
    }
}
