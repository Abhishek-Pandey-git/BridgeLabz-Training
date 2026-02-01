package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NumberListPrinter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        
        // Lambda to print numbers
        Consumer<Integer> printNumber = num -> System.out.println("Number: " + num);
        
        numbers.forEach(printNumber);
    }
}
