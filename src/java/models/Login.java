package models;

public class Login{
    private int Id_admin;
    private String username,passsword;
    
    public Login(){
        super();
    }
    
    public Login(int Id_admin, String username, String passsword){
        super();
        this.Id_admin = Id_admin;
        this.username = username;
        this.passsword = passsword;
    }
    
    public Login(String username, String passsword){
        super();
        this.username = username;
        this.passsword = passsword;
        
    }

    public int getId_admin() {
        return Id_admin;
    }

    public void setId_admin(int Id_admin) {
        this.Id_admin = Id_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }
    
    
}
