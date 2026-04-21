package org.example.model;

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza...");
    }

    @Override
    public double getPrice() {
        return 25.0;
    }
}
