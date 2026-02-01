package com.functionalinterface;

import java.util.function.Consumer;

public class NotificationSender {
    public static void main(String[] args) {
        // Consumer to send notification message
        Consumer<String> sendNotification = message -> 
            System.out.println("Notification: " + message);
        
        sendNotification.accept("Your order has been shipped");
        sendNotification.accept("Payment received successfully");
        sendNotification.accept("Welcome to our application");
    }
}
