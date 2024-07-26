

/**
 * AUTHOR: Jon Pack
 * OCCC - ADVANCED JAVA
 * DATE: 07 25, 2024
 * PROJECT NAME: Item.java
 * DESCRIPTION: item
 */
package com.example.demo.controller;

public class Item {

    private String id;
    private String name;

    // Default constructor
    public Item() {
    }

    // Parameterized constructor
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

