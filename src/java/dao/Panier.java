package dao;

import java.util.ArrayList;
import java.util.List;
import models.Produits;


public class Panier {
  private List<Produits> listeProduits;
  private double total;
  
  public Panier() {
    listeProduits = new ArrayList<>();
    total = 0.0;
  }
  
  public void ajouterProduit(Produits produit) {
    listeProduits.add(produit);
     total += produit.getPrix_prod().floatValue(); 
  }
  
 
}


