package com.functionalinterface;

import java.util.Comparator;

class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductPriceComparator {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 20000);
        
        // Comparator to compare by price
        Comparator<Product> priceComparator = (prod1, prod2) -> Double.compare(prod1.price, prod2.price);
        
        int result = priceComparator.compare(p1, p2);
        System.out.println(result > 0 ? p1.name + " is more expensive" : p2.name + " is more expensive");
    }
}
