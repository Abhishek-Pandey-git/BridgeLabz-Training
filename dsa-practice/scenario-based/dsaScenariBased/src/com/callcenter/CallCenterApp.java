package com.callcenter;

import java.util.Scanner;

public class CallCenterApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterManager manager = new CallCenterManager();
        
        System.out.println("=== Welcome to TeleCall Center System ===\n");
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add New Customer Call");
            System.out.println("2. Process Next Call");
            System.out.println("3. View Waiting Calls");
            System.out.println("4. Check Call History (by Phone)");
            System.out.println("5. View All Call Counts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    System.out.print("Is this a VIP customer? (yes/no): ");
                    String vipChoice = sc.nextLine();
                    boolean isVIP = vipChoice.equalsIgnoreCase("yes");
                    
                    Customer customer = new Customer(name, phone, isVIP);
                    manager.addCustomerCall(customer);
                    break;
                    
                case 2:
                    manager.processNextCall();
                    break;
                    
                case 3:
                    manager.displayWaitingCalls();
                    break;
                    
                case 4:
                    System.out.print("Enter phone number to check: ");
                    String phoneToCheck = sc.nextLine();
                    manager.checkCallHistory(phoneToCheck);
                    break;
                    
                case 5:
                    manager.displayAllCallCounts();
                    break;
                    
                case 6:
                    System.out.println("Thank you for using TeleCall Center System!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
