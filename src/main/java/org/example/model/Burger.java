package org.example.model;

public class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Burger...");
    }

    @Override
    public double getPrice() {
        return 15.0;
    }
}