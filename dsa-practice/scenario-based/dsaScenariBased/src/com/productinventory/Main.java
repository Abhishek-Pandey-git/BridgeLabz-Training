package com.productinventory;

import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            printMenu();

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    addProductUI();
                    break;

                case 2:
                    searchProductUI();
                    break;

                case 3:
                    updatePriceUI();
                    break;

                case 4:
                    displayProductsUI();
                    break;

                case 0:
                    System.out.println("\nExiting system. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            pause();
        }
    }

    // ---------------- UI METHODS ----------------

    private static void addProductUI() {
        System.out.print("Enter SKU: ");
        String sku = input.nextLine();

        System.out.print("Enter Product Name: ");
        String name = input.nextLine();

        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        input.nextLine();

        InventoryManager.addProduct(sku, name, price);
        System.out.println("Product added successfully.");
    }

    private static void searchProductUI() {
        System.out.print("Enter SKU to search: ");
        String sku = input.nextLine();

        Product product = InventoryManager.searchProduct(sku);
        
        if(product != null) {
            System.out.println("\n========== PRODUCT FOUND ==========");
            System.out.println("SKU: " + product.sku);
            System.out.println("Name: " + product.name);
            System.out.println("Price: $" + product.price);
            System.out.println("====================================");
        }
        else {
            System.out.println("Product not found!");
        }
    }

    private static void updatePriceUI() {
        System.out.print("Enter SKU to update: ");
        String sku = input.nextLine();

        System.out.print("Enter New Price: ");
        double price = input.nextDouble();
        input.nextLine();

        InventoryManager.updatePrice(sku, price);
    }

    private static void displayProductsUI() {
        System.out.println("\n========== PRODUCT INVENTORY (SORTED BY SKU) ==========");
        InventoryManager.showProducts();
        System.out.println("=======================================================");
    }

    // ---------------- HELPER METHODS ----------------

    private static void printMenu() {
        System.out.println();
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║   E-COMMERCE PRODUCT INVENTORY     ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Add Product                     ║");
        System.out.println("║ 2. Search Product by SKU           ║");
        System.out.println("║ 3. Update Product Price            ║");
        System.out.println("║ 4. Display All Products (Sorted)   ║");
        System.out.println("║ 0. Exit                            ║");
        System.out.println("╚════════════════════════════════════╝");
    }

    private static void pause() {
        System.out.println("\nPress ENTER to continue...");
        input.nextLine();
    }
}
