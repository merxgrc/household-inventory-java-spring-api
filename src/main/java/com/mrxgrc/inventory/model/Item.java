package com.mrxgrc.inventory.model;

public class Item {
    private Long id;
    private String name;

    // Constructor
    public Item(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
