package com.traincompanion;

import java.util.Scanner;

public class TrainApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrainNavigation train = new TrainNavigation();
        
        System.out.println("=== Welcome to Train Companion App ===\n");
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Compartment");
            System.out.println("2. Move Forward");
            System.out.println("3. Move Backward");
            System.out.println("4. Show Current Position");
            System.out.println("5. Search for Service");
            System.out.println("6. Display All Compartments");
            System.out.println("7. Remove Compartment");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter compartment name (e.g., A1, B2, C3): ");
                    String name = sc.nextLine();
                    System.out.print("Enter service (Pantry/WiFi/AC/Sleeper/General): ");
                    String service = sc.nextLine();
                    train.addCompartment(name, service);
                    break;
                    
                case 2:
                    train.moveForward();
                    break;
                    
                case 3:
                    train.moveBackward();
                    break;
                    
                case 4:
                    train.showCurrentPosition();
                    break;
                    
                case 5:
                    System.out.print("Enter service to search: ");
                    String searchService = sc.nextLine();
                    train.searchService(searchService);
                    break;
                    
                case 6:
                    train.displayAllCompartments();
                    break;
                    
                case 7:
                    System.out.print("Enter compartment name to remove: ");
                    String removeName = sc.nextLine();
                    train.removeCompartment(removeName);
                    break;
                    
                case 8:
                    System.out.println("Thank you for using Train Companion!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
