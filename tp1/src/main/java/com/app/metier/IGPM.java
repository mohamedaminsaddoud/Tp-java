package com.app.metier;

import java.util.ArrayList;

public interface IGPM {
    abstract public void ajouterProduit(String name, String description);
    abstract public ArrayList<Produit> getProduits();
    abstract public void supprimerProduit(int id);
    abstract public void modifProduit(int id, String name, String description);
    abstract public Produit getProduit(int id);
}
