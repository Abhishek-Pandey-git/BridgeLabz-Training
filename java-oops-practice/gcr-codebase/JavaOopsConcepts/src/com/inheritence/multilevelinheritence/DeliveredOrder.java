package com.inheritence.multilevelinheritence;

// DeliveredOrder extends ShippedOrder and adds delivery date
public class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate + " (Tracking: " + trackingNumber + ")";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
