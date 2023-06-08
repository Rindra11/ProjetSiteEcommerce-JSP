package models;


public class Commande {
    private int id_com;
    private int Id_prod;
    private String Nom_prod;
    private Float Prix_prod;
    private String Date_com;
   
    public Commande(){
        super();
    }
    
    public Commande (int id_com, int Id_prod, String Nom_prod, Float Prix_prod, String Date_com){
        super();
        this.id_com = id_com;
        this.Id_prod = Id_prod;
        this.Nom_prod = Nom_prod;
        this.Prix_prod = Prix_prod;
        this.Date_com = Date_com;
    }
    
    public Commande (int Id_prod, String Nom_prod, Float Prix_prod, String Date_com){
        super();
        this.Id_prod = Id_prod;
        this.Nom_prod = Nom_prod;
        this.Prix_prod = Prix_prod;
        this.Date_com = Date_com;
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
    }

    public int getId_prod() {
        return Id_prod;
    }

    public void setId_prod(int Id_prod) {
        this.Id_prod = Id_prod;
    }

    public String getNom_prod() {
        return Nom_prod;
    }

    public void setNom_prod(String Nom_prod) {
        this.Nom_prod = Nom_prod;
    }

    public Float getPrix_prod() {
        return Prix_prod;
    }

    public void setPrix_prod(Float Prix_prod) {
        this.Prix_prod = Prix_prod;
    }

    public String getDate_com() {
        return Date_com;
    }

    public void setDate_com(String Date_com) {
        this.Date_com = Date_com;
    }
    
    
    
}
