package org.example;

public class Food {
    // attributes
    private String name;
    private Double price;

    // Constructors
    public Food(String name, double price){
        this.name = name;
        this.price = price;
    }
    // Getters
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

}
