package com.app.metier;

public class Produit {

    private String name;
    private int id;

    public Produit(String name, int id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public Produit(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
}
