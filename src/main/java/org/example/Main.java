package org.example;

import org.example.factory.FoodFactory;
import org.example.model.Food;
import org.example.model.Order;
import org.example.strategy.CardPayment;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        // using Factory Design Pattern
        Food pizza = FoodFactory.createFood("pizza");
        Food burger = FoodFactory.createFood("burger");

        pizza.prepare();
        burger.prepare();

        order.addItem(pizza);
        order.addItem(burger);

        // using Strategy Design Pattern
        order.setPaymentStrategy(new CardPayment());

        order.checkout();
    }
}