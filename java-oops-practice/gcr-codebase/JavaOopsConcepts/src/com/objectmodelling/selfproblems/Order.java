package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int nextId = 1;
    private int id;
    private CustomerEcom customer;
    private List<Product> products;

    public Order(CustomerEcom customer) {
        this.id = nextId++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addProduct(Product p) {
        if (p != null) products.add(p);
    }

    public double total() {
        double sum = 0.0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void showOrder() {
        System.out.println("Order#" + id + " for " + customer.getName());
        for (Product p : products) System.out.println(" - " + p);
        System.out.println("Total: $" + total());
    }
}
