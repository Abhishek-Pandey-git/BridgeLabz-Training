package com.functionalinterface;

import java.util.function.Consumer;

public class OrderConfirmationPrinter {
    public static void main(String[] args) {
        // Consumer to print order confirmation
        Consumer<Integer> printConfirmation = orderId -> 
            System.out.println("Order #" + orderId + " has been confirmed and will be delivered soon.");
        
        printConfirmation.accept(1001);
        printConfirmation.accept(1002);
        printConfirmation.accept(1003);
    }
}
