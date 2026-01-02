package com.inheritence.multilevelinheritence;

// ShippedOrder adds tracking information
public class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking: " + trackingNumber + ")";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
