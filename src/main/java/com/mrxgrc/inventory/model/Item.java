package com.mrxgrc.inventory.model;

public class Item {
    private int id;
    private String name;

    // Constructor
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
