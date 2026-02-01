package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ProductNamePrinter {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Mobile", "Tablet", "Headphones");
        
        // Lambda to print product names
        Consumer<String> printProduct = name -> System.out.println("Product: " + name);
        
        products.forEach(printProduct);
    }
}
