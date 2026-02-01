package com.lambdaexpression;

import java.util.function.Function;

public class ProductDiscountApplier {
    public static void main(String[] args) {
        // Lambda to apply 10% discount
        Function<Double, Double> applyDiscount = price -> price * 0.9;
        
        System.out.println("Original Rs.1000: After discount Rs." + applyDiscount.apply(1000.0));
        System.out.println("Original Rs.2500: After discount Rs." + applyDiscount.apply(2500.0));
        System.out.println("Original Rs.500: After discount Rs." + applyDiscount.apply(500.0));
    }
}
