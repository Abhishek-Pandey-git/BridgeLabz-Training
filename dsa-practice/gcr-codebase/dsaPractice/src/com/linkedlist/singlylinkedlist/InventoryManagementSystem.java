package com.linkedlist.singlylinkedlist;

import java.util.Scanner;

/**
 * Inventory Management System using Singly Linked List.
 */
public class InventoryManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose an operation: ");
            
            switch (choice) {
                case 1 -> {
                    inventory.addAtBeginning(promptForItem());
                    System.out.println("Item added at the beginning.");
                }
                case 2 -> {
                    inventory.addAtEnd(promptForItem());
                    System.out.println("Item added at the end.");
                }
                case 3 -> {
                    InventoryItem item = promptForItem();
                    int position = readInt("Position: ");
                    if (inventory.insertAtPosition(item, position)) {
                        System.out.println("Item inserted.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                }
                case 4 -> {
                    int itemId = readInt("Item ID to remove: ");
                    if (inventory.removeByItemId(itemId)) {
                        System.out.println("Item removed.");
                    } else {
                        System.out.println("Item not found.");
                    }
                }
                case 5 -> {
                    int itemId = readInt("Item ID: ");
                    int quantity = readInt("New quantity: ");
                    if (inventory.updateQuantityById(itemId, quantity)) {
                        System.out.println("Quantity updated.");
                    } else {
                        System.out.println("Item not found.");
                    }
                }
                case 6 -> {
                    int itemId = readInt("Item ID: ");
                    InventoryItem found = inventory.searchById(itemId);
                    System.out.println(found != null ? found : "Not found.");
                }
                case 7 -> {
                    String name = readLine("Item name: ");
                    InventoryItem found = inventory.searchByName(name);
                    System.out.println(found != null ? found : "Not found.");
                }
                case 8 -> {
                    System.out.println("Total Value: $" + inventory.calculateTotalValue());
                }
                case 9 -> {
                    inventory.sortByName(true);
                    System.out.println("Sorted by name (ascending).");
                }
                case 10 -> {
                    inventory.sortByPrice(true);
                    System.out.println("Sorted by price (ascending).");
                }
                case 11 -> {
                    inventory.displayInventory();
                }
                case 12 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Inventory Management ---");
        System.out.println("1. Add at beginning  2. Add at end  3. Insert at position");
        System.out.println("4. Remove by ID  5. Update quantity  6. Search by ID");
        System.out.println("7. Search by name  8. Total value  9. Sort by name");
        System.out.println("10. Sort by price  11. Display all  12. Exit");
    }

    private static InventoryItem promptForItem() {
        String name = readLine("Item name: ");
        int id = readInt("Item ID: ");
        int qty = readInt("Quantity: ");
        double price = readDouble("Price: ");
        return new InventoryItem(name, id, qty, price);
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
