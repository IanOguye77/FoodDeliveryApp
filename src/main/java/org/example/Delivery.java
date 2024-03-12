package org.example;

public class Delivery {
    // Attributes
    private String location;
    private double cost;

    // Constructors
    public Delivery(String location, double cost){
        this.location = location;
        this.cost = cost;
    }

    // Getters
    public String getLocation() {
        return location;
    }

    public double getCost() {
        return cost;
    }
}
