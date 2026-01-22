package com.tailorshop;

import java.time.LocalDate;

// Order class with customer details and delivery deadline
public class Order {
    private String customerName;
    private String itemDescription;
    private LocalDate deliveryDeadline;
    
    public Order(String customerName, String itemDescription, LocalDate deliveryDeadline) {
        this.customerName = customerName;
        this.itemDescription = itemDescription;
        this.deliveryDeadline = deliveryDeadline;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getItemDescription() {
        return itemDescription;
    }
    
    public LocalDate getDeliveryDeadline() {
        return deliveryDeadline;
    }
    
    @Override
    public String toString() {
        return String.format("Order[%s, %s, Deadline: %s]", 
            customerName, itemDescription, deliveryDeadline);
    }
}
