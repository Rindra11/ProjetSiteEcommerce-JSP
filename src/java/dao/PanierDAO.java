package dao;

import java.util.ArrayList;
import java.util.List;
import models.Produits;


public class PanierDAO {
    private List<Produits> listeProduits;
    private double total;

    public PanierDAO() {
      listeProduits = new ArrayList<>();
      total = 0.0;
    }

    /*Conversion de la valeur float par un FloatValue*/
    public void ajouterProduit(Produits produit) {
      listeProduits.add(produit);
       total += produit.getPrix_prod().floatValue(); 
    }
 
 
}


