package com.lambdaexpression;

import java.util.function.BiFunction;

public class NumberAdder {
    public static void main(String[] args) {
        // Lambda to add two numbers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        
        System.out.println("10 + 20 = " + add.apply(10, 20));
        System.out.println("45 + 55 = " + add.apply(45, 55));
        System.out.println("100 + 200 = " + add.apply(100, 200));
    }
}
