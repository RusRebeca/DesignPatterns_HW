package org.example.factory;

import org.example.model.Burger;
import org.example.model.Food;
import org.example.model.Pizza;

public class FoodFactory {
    public static Food createFood(String type) {
        if (type.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("burger")) {
            return new Burger();
        }

        throw new IllegalArgumentException("Unknown food type");
    }
}
