package com.objectmodelling.selfproblems;

public class ECommerceDemo {
    public static void main(String[] args) {
        CustomerEcom customer = new CustomerEcom("Alice Shopper");

        Product p1 = new Product("Keyboard", 29.99);
        Product p2 = new Product("Mouse", 15.50);
        Product p3 = new Product("Monitor", 120.00);

        Order order = customer.placeOrder();
        order.addProduct(p1);
        order.addProduct(p2);

        Order order2 = customer.placeOrder();
        order2.addProduct(p3);

        customer.showOrders();
    }
}
