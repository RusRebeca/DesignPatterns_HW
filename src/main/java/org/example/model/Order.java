package org.example.model;

import org.example.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addItem(Food food) {
        items.add(food);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Food::getPrice).sum();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        double total = calculateTotal();
        System.out.println("Total: " + total);

        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment method not selected!");
        }

        paymentStrategy.pay(total);
    }
}
