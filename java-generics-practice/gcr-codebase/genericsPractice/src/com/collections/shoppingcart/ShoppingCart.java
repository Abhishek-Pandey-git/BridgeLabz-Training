package com.collections.shoppingcart;

import java.util.*;

public class ShoppingCart {
    
    // HashMap for quick price lookup
    private HashMap<String, Double> productPrices;
    
    // LinkedHashMap to maintain insertion order
    private LinkedHashMap<String, Integer> cartItems;
    
    private Scanner scanner;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cartItems = new LinkedHashMap<>();
        scanner = new Scanner(System.in);
        initializeProducts();
    }

    // Initialize some products with prices
    private void initializeProducts() {
        productPrices.put("Laptop", 999.99);
        productPrices.put("Mouse", 25.50);
        productPrices.put("Keyboard", 75.00);
        productPrices.put("Monitor", 299.99);
        productPrices.put("Headphones", 150.00);
        productPrices.put("Webcam", 89.99);
        productPrices.put("USB Cable", 12.99);
    }

    // Add product to available products
    public void addProduct(String productName, double price) {
        productPrices.put(productName, price);
    }

    // Add item to cart
    public void addToCart(String productName, int quantity) {
        if (!productPrices.containsKey(productName)) {
            System.out.println("Product not found!");
            return;
        }
        
        cartItems.put(productName, cartItems.getOrDefault(productName, 0) + quantity);
        System.out.println(quantity + " x " + productName + " added to cart!");
    }

    // Remove item from cart
    public void removeFromCart(String productName) {
        if (cartItems.remove(productName) != null) {
            System.out.println(productName + " removed from cart!");
        } else {
            System.out.println("Item not in cart!");
        }
    }

    // Display available products
    public void displayProducts() {
        System.out.println("\n=== Available Products ===");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.printf("%s: $%.2f\n", entry.getKey(), entry.getValue());
        }
    }

    // Display cart items in insertion order
    public void displayCart() {
        System.out.println("\n=== Shopping Cart (Insertion Order) ===");
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }
        
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            double itemTotal = price * quantity;
            total += itemTotal;
            
            System.out.printf("%s x%d - $%.2f each = $%.2f\n", 
                product, quantity, price, itemTotal);
        }
        System.out.printf("Total: $%.2f\n", total);
    }

    // Display cart items sorted by price using TreeMap
    public void displayCartSortedByPrice() {
        System.out.println("\n=== Shopping Cart (Sorted by Price) ===");
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }
        
        // Create TreeMap sorted by price
        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();
        
        for (String product : cartItems.keySet()) {
            double price = productPrices.get(product);
            sortedByPrice.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
        }
        
        double total = 0;
        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            double price = entry.getKey();
            for (String product : entry.getValue()) {
                int quantity = cartItems.get(product);
                double itemTotal = price * quantity;
                total += itemTotal;
                
                System.out.printf("%s x%d - $%.2f each = $%.2f\n", 
                    product, quantity, price, itemTotal);
            }
        }
        System.out.printf("Total: $%.2f\n", total);
    }

    // Calculate total price
    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    // Interactive menu
    public void showMenu() {
        while (true) {
            System.out.println("\n=== Shopping Cart System ===");
            System.out.println("1. Display Available Products");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. View Cart (Insertion Order)");
            System.out.println("5. View Cart (Sorted by Price)");
            System.out.println("6. Calculate Total");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addItemInteractive();
                    break;
                case 3:
                    removeItemInteractive();
                    break;
                case 4:
                    displayCart();
                    break;
                case 5:
                    displayCartSortedByPrice();
                    break;
                case 6:
                    System.out.printf("Total: $%.2f\n", calculateTotal());
                    break;
                case 7:
                    System.out.println("Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Helper method to add item with user input
    private void addItemInteractive() {
        System.out.print("Enter product name: ");
        String product = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        addToCart(product, quantity);
    }

    // Helper method to remove item
    private void removeItemInteractive() {
        System.out.print("Enter product name to remove: ");
        String product = scanner.nextLine();
        removeFromCart(product);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Add sample items
        System.out.println("Adding sample items to cart...");
        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);
        cart.addToCart("Keyboard", 1);
        
        // Display in different ways
        cart.displayCart();
        cart.displayCartSortedByPrice();
        
        System.out.println("\n--- Starting Interactive Menu ---");
        cart.showMenu();
    }
}
