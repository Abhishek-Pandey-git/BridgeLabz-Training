package com.tailorshop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Tailor shop order management using Insertion Sort
public class TailorShop {
    private List<Order> orders;
    
    public TailorShop() {
        orders = new ArrayList<>();
    }
    
    // Add new order using insertion sort - maintains sorted list by deadline
    public void addOrder(Order newOrder) {
        orders.add(newOrder);
        
        // Insertion sort logic - insert new order at correct position
        int i = orders.size() - 1;
        while (i > 0 && orders.get(i - 1).getDeliveryDeadline().isAfter(newOrder.getDeliveryDeadline())) {
            orders.set(i, orders.get(i - 1));
            i--;
        }
        orders.set(i, newOrder);
        
        System.out.println("Order added and sorted by deadline!");
    }
    
    // Display all orders sorted by deadline
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders in the shop.");
            return;
        }
        
        System.out.println("\n=== Orders Sorted by Delivery Deadline ===");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println((i + 1) + ". " + orders.get(i));
        }
    }
    
    // Show orders due within next n days
    public void showOrdersDueIn(int days) {
        LocalDate deadline = LocalDate.now().plusDays(days);
        System.out.println("\n=== Orders Due in Next " + days + " Days ===");
        
        boolean found = false;
        for (Order order : orders) {
            if (!order.getDeliveryDeadline().isAfter(deadline)) {
                System.out.println(order);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No orders due in next " + days + " days.");
        }
    }
    
    // Complete an order (remove from list)
    public void completeOrder(String customerName) {
        boolean removed = orders.removeIf(order -> order.getCustomerName().equalsIgnoreCase(customerName));
        
        if (removed) {
            System.out.println("Order for " + customerName + " completed and removed!");
        } else {
            System.out.println("Order not found.");
        }
    }
    
    public static void main(String[] args) {
        TailorShop shop = new TailorShop();
        Scanner scanner = new Scanner(System.in);
        
        // Add sample orders
        System.out.println("Adding sample orders...");
        shop.addOrder(new Order("John", "Suit", LocalDate.of(2026, 2, 15)));
        shop.addOrder(new Order("Alice", "Dress", LocalDate.of(2026, 1, 28)));
        shop.addOrder(new Order("Bob", "Shirt", LocalDate.of(2026, 2, 5)));
        shop.addOrder(new Order("Carol", "Jacket", LocalDate.of(2026, 1, 25)));
        shop.addOrder(new Order("David", "Pants", LocalDate.of(2026, 2, 10)));
        
        while (true) {
            System.out.println("\n=== Tailor Shop Management ===");
            System.out.println("1. Add New Order");
            System.out.println("2. Display All Orders");
            System.out.println("3. Show Orders Due Soon");
            System.out.println("4. Complete Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item description: ");
                    String item = scanner.nextLine();
                    System.out.print("Enter delivery date (YYYY-MM-DD): ");
                    String dateStr = scanner.nextLine();
                    LocalDate date = LocalDate.parse(dateStr);
                    shop.addOrder(new Order(name, item, date));
                    break;
                    
                case 2:
                    shop.displayOrders();
                    break;
                    
                case 3:
                    System.out.print("Enter number of days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();
                    shop.showOrdersDueIn(days);
                    break;
                    
                case 4:
                    System.out.print("Enter customer name: ");
                    String customer = scanner.nextLine();
                    shop.completeOrder(customer);
                    break;
                    
                case 5:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
