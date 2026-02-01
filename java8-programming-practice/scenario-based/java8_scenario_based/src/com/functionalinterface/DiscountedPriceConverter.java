package com.functionalinterface;

import java.util.function.Function;

public class DiscountedPriceConverter {
    public static void main(String[] args) {
        // Function to apply 20% discount
        Function<Double, Double> applyDiscount = price -> price * 0.8;
        
        System.out.println("Price Rs.1000: Discounted Rs." + applyDiscount.apply(1000.0));
        System.out.println("Price Rs.2500: Discounted Rs." + applyDiscount.apply(2500.0));
        System.out.println("Price Rs.500: Discounted Rs." + applyDiscount.apply(500.0));
    }
}
