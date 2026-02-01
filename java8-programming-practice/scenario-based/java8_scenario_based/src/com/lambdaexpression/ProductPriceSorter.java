package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;

class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String toString() {
        return name + " - Rs." + price;
    }
}

public class ProductPriceSorter {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 50000),
            new Product("Mobile", 20000),
            new Product("Tablet", 35000)
        );
        
        System.out.println("Before sorting: " + products);
        
        // Lambda to sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        
        System.out.println("After sorting: " + products);
    }
}
