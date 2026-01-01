package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class CustomerEcom {
    private String name;
    private List<Order> orders;

    public CustomerEcom(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Order placeOrder() {
        Order o = new Order(this);
        orders.add(o);
        return o;
    }

    public void showOrders() {
        System.out.println("Customer: " + name);
        if (orders.isEmpty()) {
            System.out.println("  (no orders)");
            return;
        }
        for (Order o : orders) o.showOrder();
    }
}
