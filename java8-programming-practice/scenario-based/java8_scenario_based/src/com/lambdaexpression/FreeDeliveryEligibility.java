package com.lambdaexpression;

import java.util.function.Predicate;

public class FreeDeliveryEligibility {
    public static void main(String[] args) {
        // Lambda to check free delivery eligibility
        Predicate<Double> isFreeDelivery = amount -> amount > 500;
        
        System.out.println("Order Rs.600: " + (isFreeDelivery.test(600.0) ? "Free Delivery" : "Delivery Charges Apply"));
        System.out.println("Order Rs.400: " + (isFreeDelivery.test(400.0) ? "Free Delivery" : "Delivery Charges Apply"));
        System.out.println("Order Rs.1000: " + (isFreeDelivery.test(1000.0) ? "Free Delivery" : "Delivery Charges Apply"));
    }
}
