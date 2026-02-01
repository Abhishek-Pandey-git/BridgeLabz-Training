package com.functionalinterface;

import java.util.function.Predicate;

public class FreeDeliveryChecker {
    public static void main(String[] args) {
        // Predicate to check free delivery eligibility
        Predicate<Double> isFreeDelivery = amount -> amount >= 500;
        
        System.out.println("Order Rs.600: " + isFreeDelivery.test(600.0));
        System.out.println("Order Rs.400: " + isFreeDelivery.test(400.0));
        System.out.println("Order Rs.500: " + isFreeDelivery.test(500.0));
    }
}
