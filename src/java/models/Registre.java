package models;

public class Registre {
    private int Id_name;
    private String Name,CIN,Telephone, Adres_Email, pass, passw;

public Registre() {
       super();
}

    public Registre(int Id_name, String Name, String CIN, String Telephone,String Adres_Email, String pass, String passw) {
        super();
        this.Id_name = Id_name;
        this.Name = Name;
        this.CIN = CIN;
        this.Telephone = Telephone;
        this.Adres_Email = Adres_Email;
        this.pass = pass;
        this.passw = passw;
    }
    
    public Registre(String name,String Name, String CIN, String Telephone,String Adres_Email, String pass, String passw){
        super();
        this.Name = Name;
        this.CIN = CIN;
        this.Telephone = Telephone;
        this.Adres_Email = Adres_Email;
        this.pass = pass;
        this.passw = passw;
    }
    
    public int getId_name() {
        return Id_name;
    }

    public void setId_name(int Id_name) {
        this.Id_name = Id_name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getAdres_Email() {
        return Adres_Email;
    }

    public void setAdres_Email(String Adres_Email) {
        this.Adres_Email = Adres_Email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
    
  
}
