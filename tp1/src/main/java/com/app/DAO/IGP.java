package com.app.DAO;
import com.app.metier.Produit;

import java.util.ArrayList;

public interface IGP {
    abstract public void ajouterProduit(String name, String description);
    abstract public ArrayList<Produit> getProduits();
    abstract public void supprimerProduit(int id);
    abstract public void modifProduit(int id, String name, String description);
    abstract public Produit getProduit(int id);
}
