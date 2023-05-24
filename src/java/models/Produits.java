package models;

public class Produits {
    private int Id_prod;
    private String Nom_prod,Qte_prod;
    private Float Prix_prod;
    
    
    public Produits(){
        super();
    }
    
    public Produits(int Id_prod, String Nom_prod, String Qte_prod, Float Prix_prod) {
       super();
        this.Id_prod = Id_prod;
        this.Nom_prod = Nom_prod;
        this.Qte_prod = Qte_prod;
        this.Prix_prod = Prix_prod;
    
}
    public Produits( String Nom_prod, String Qte_prod, Float Prix_prod){
         super();
         this.Nom_prod = Nom_prod;
         this.Qte_prod = Qte_prod;
         this.Prix_prod = Prix_prod;
         
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

    public String getQte_prod() {
        return Qte_prod;
    }

    public void setQte_prod(String Qte_prod) {
        this.Qte_prod = Qte_prod;
    }

    public Float getPrix_prod() {
        return Prix_prod;
    }

    public void setPrix_prod(Float Prix_prod) {
        this.Prix_prod = Prix_prod;
    }
    
    
}