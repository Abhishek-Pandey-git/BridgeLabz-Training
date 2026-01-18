package com.javagenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarehouseSystem {
    
    //wildcard method
    public static void displayAllItems(List<? extends WarehouseItem> items){
        System.out.println("\n=== All Warehouse Items ===");
        if(items.isEmpty()){
            System.out.println("No items in warehouse");
            return;
        }
        for(WarehouseItem item:items){
            System.out.println(item.getCategory()+": "+item);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Storage<Electronics> electronicsStorage=new Storage<>();
        Storage<Groceries> groceriesStorage=new Storage<>();
        Storage<Furniture> furnitureStorage=new Storage<>();
        
        while(true){
            System.out.println("\n--- Warehouse Management ---");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Groceries");
            System.out.println("3. Add Furniture");
            System.out.println("4. View Electronics");
            System.out.println("5. View Groceries");
            System.out.println("6. View Furniture");
            System.out.println("7. View All Items");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            if(choice==1){
                System.out.print("Name: ");
                String name=sc.nextLine();
                System.out.print("Price: ");
                double price=sc.nextDouble();
                System.out.print("Quantity: ");
                int qty=sc.nextInt();
                sc.nextLine();
                System.out.print("Brand: ");
                String brand=sc.nextLine();
                electronicsStorage.addItem(new Electronics(name,price,qty,brand));
            }
            else if(choice==2){
                System.out.print("Name: ");
                String name=sc.nextLine();
                System.out.print("Price: ");
                double price=sc.nextDouble();
                System.out.print("Quantity: ");
                int qty=sc.nextInt();
                sc.nextLine();
                System.out.print("Expiry Date: ");
                String expiry=sc.nextLine();
                groceriesStorage.addItem(new Groceries(name,price,qty,expiry));
            }
            else if(choice==3){
                System.out.print("Name: ");
                String name=sc.nextLine();
                System.out.print("Price: ");
                double price=sc.nextDouble();
                System.out.print("Quantity: ");
                int qty=sc.nextInt();
                sc.nextLine();
                System.out.print("Material: ");
                String material=sc.nextLine();
                furnitureStorage.addItem(new Furniture(name,price,qty,material));
            }
            else if(choice==4){
                System.out.println("\n--- Electronics Storage ---");
                electronicsStorage.displayItems();
            }
            else if(choice==5){
                System.out.println("\n--- Groceries Storage ---");
                groceriesStorage.displayItems();
            }
            else if(choice==6){
                System.out.println("\n--- Furniture Storage ---");
                furnitureStorage.displayItems();
            }
            else if(choice==7){
                List<WarehouseItem> allItems=new ArrayList<>();
                allItems.addAll(electronicsStorage.getItems());
                allItems.addAll(groceriesStorage.getItems());
                allItems.addAll(furnitureStorage.getItems());
                displayAllItems(allItems);
            }
            else if(choice==8){
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}
