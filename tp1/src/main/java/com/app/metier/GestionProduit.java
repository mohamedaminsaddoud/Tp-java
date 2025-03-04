package com.app.metier;

import com.app.DAO.IGP;
import com.app.DAO.gestionProduitDAO;

import java.util.ArrayList;

public class GestionProduit implements IGPM{
    public IGP gestionProduits=new gestionProduitDAO();
    @Override
    public void ajouterProduit(String name, String description) {
        gestionProduits.ajouterProduit(name, description);

    }
    @Override
    public Produit getProduit(int id){
        return gestionProduits.getProduit(id);
    }

    @Override
    public ArrayList<Produit> getProduits() {
        return gestionProduits.getProduits();
    }

    @Override
    public void supprimerProduit(int id) {
    gestionProduits.supprimerProduit(id);
    }

    @Override
    public void modifProduit(int id, String name, String description) {
    gestionProduits.modifProduit(id, name, description);
    }
}
