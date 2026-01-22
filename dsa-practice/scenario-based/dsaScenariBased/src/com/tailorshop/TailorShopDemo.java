package com.tailorshop;

import java.time.LocalDate;

// Demo for TailorShop Insertion Sort
public class TailorShopDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Tailor Shop - Insertion Sort Demo ===\n");
        
        TailorShop shop = new TailorShop();
        
        // Add orders in random order
        System.out.println("Adding orders as they arrive (unsorted)...\n");
        
        shop.addOrder(new Order("John", "Suit", LocalDate.of(2026, 2, 15)));
        shop.displayOrders();
        
        shop.addOrder(new Order("Alice", "Dress", LocalDate.of(2026, 1, 28)));
        shop.displayOrders();
        
        shop.addOrder(new Order("Bob", "Shirt", LocalDate.of(2026, 2, 5)));
        shop.displayOrders();
        
        shop.addOrder(new Order("Carol", "Jacket", LocalDate.of(2026, 1, 25)));
        shop.displayOrders();
        
        shop.addOrder(new Order("David", "Pants", LocalDate.of(2026, 2, 10)));
        shop.displayOrders();
        
        // Show orders due soon
        shop.showOrdersDueIn(7);
        shop.showOrdersDueIn(30);
        
        // Complete an order
        System.out.println("\nCompleting Carol's order...");
        shop.completeOrder("Carol");
        shop.displayOrders();
        
        System.out.println("\n=== Demo Completed ===");
        System.out.println("Notice how each new order is inserted in the correct position!");
        System.out.println("This is Insertion Sort - efficient for nearly sorted lists.");
    }
}
