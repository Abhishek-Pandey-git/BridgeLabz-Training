package com.collections.shoppingcart;

public class ShoppingCartDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Shopping Cart System Demo ===\n");
        
        ShoppingCart cart = new ShoppingCart();
        
        // Display available products
        cart.displayProducts();
        
        // Add items to cart
        System.out.println("\n--- Adding Items to Cart ---");
        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);
        cart.addToCart("Keyboard", 1);
        cart.addToCart("USB Cable", 3);
        cart.addToCart("Headphones", 1);
        
        // Display cart in insertion order (LinkedHashMap)
        cart.displayCart();
        
        // Display cart sorted by price (TreeMap)
        cart.displayCartSortedByPrice();
        
        // Remove an item
        System.out.println("\n--- Removing Mouse from Cart ---");
        cart.removeFromCart("Mouse");
        
        // Display updated cart
        cart.displayCart();
        cart.displayCartSortedByPrice();
        
        // Calculate total
        System.out.printf("\nFinal Total: $%.2f\n", cart.calculateTotal());
        
        System.out.println("\n=== Demo Completed ===");
        System.out.println("Run ShoppingCart.main() for interactive menu");
    }
}
