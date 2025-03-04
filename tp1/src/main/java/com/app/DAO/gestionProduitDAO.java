package com.app.DAO;

import com.app.metier.Produit;
import com.app.metier.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class gestionProduitDAO implements IGP {
    @Override
    public void ajouterProduit(String name, String description) {
        String sql = "INSERT INTO produits (name, description) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, description);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public Produit getProduit(int id) {
        String sql = "SELECT * FROM produits WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Produit(rs.getString("name"),rs.getInt("id"), rs.getString("description"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;





    }

    @Override
    public ArrayList<Produit> getProduits() {
        String sql = "SELECT * FROM produits";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                ArrayList<Produit> produits = new ArrayList<>();

                Produit produit=new Produit(rs.getString("name"),rs.getInt("id"),rs.getString("description"));
                produits.add(produit);
                while (rs.next()){
                    produit=new Produit(rs.getString("name"),rs.getInt("id"),rs.getString("description"));
                    produits.add(produit);

                }
                return produits;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    @Override
    public void supprimerProduit(int id) {
        String sql = "DELETE FROM produits WHERE id =?;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void modifProduit(int id, String name, String description) {
        String sql = "update produits set name =?, description =? where id =?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, description);
            stmt.setInt(3,id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
