package models;

import java.util.*;


public class Panier {
    private List<Produits> listeProduits;
    private double total;
    
    public Panier() {
    listeProduits = new ArrayList<>();
    total = 0.0;
    }
  
    public void ajouterProduit(Produits produit) {
    listeProduits.add(produit);
    total += produit.getPrix_prod();
  }

    // Getter pour listeProduits
    public List<Produits> getListeProduits() {
        return listeProduits;
    }

    // Setter pour listeProduits
    public void setListeProduits(List<Produits> listeProduits) {
        this.listeProduits = listeProduits;
    }

    // Getter pour total
    public double getTotal() {
        return total;
    }

    // Setter pour total
    public void setTotal(double total) {
        this.total = total;
    }
}



