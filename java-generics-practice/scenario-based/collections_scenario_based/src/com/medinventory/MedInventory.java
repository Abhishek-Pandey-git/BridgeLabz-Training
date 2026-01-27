package com.medinventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Item {
    String itemID;
    String itemName;
    int quantity;
    LocalDate expiryDate;
    
    public Item(String itemID, String itemName, int quantity, LocalDate expiryDate) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return itemID.equals(item.itemID);
    }
    
    @Override
    public int hashCode() {
        return itemID.hashCode();
    }
}

class LowSupplyException extends Exception {
    public LowSupplyException(String message) {
        super(message);
    }
}

public class MedInventory {
    
    private static final int CRITICAL_THRESHOLD = 10;
    private static final Pattern DATE_PATTERN = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
    
    public static void main(String[] args) {
        MedInventory inventory = new MedInventory();
        
        try {
            inventory.processInventory("inventory.csv");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public void processInventory(String filename) throws IOException {
        Set<Item> uniqueItems = new HashSet<>();
        Map<String, List<Item>> categoryMap = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine(); // skip header
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 4) continue;
                
                String itemID = parts[0].trim();
                String itemName = parts[1].trim();
                int quantity = Integer.parseInt(parts[2].trim());
                
                String dateStr = parts[3].trim();
                LocalDate expiryDate = parseDate(dateStr, formatter);
                if (expiryDate == null) continue;
                
                Item item = new Item(itemID, itemName, quantity, expiryDate);
                uniqueItems.add(item);
                
                String category = determineCategory(itemName);
                categoryMap.putIfAbsent(category, new ArrayList<>());
                categoryMap.get(category).add(item);
            }
        }
        
        displayResults(uniqueItems, categoryMap);
    }
    
    private LocalDate parseDate(String dateStr, DateTimeFormatter formatter) {
        Matcher matcher = DATE_PATTERN.matcher(dateStr);
        if (matcher.matches()) {
            try {
                return LocalDate.parse(dateStr, formatter);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
    
    private String determineCategory(String itemName) {
        String lower = itemName.toLowerCase();
        if (lower.contains("glove")) return "Safety Equipment";
        if (lower.contains("syringe") || lower.contains("needle")) return "Medical Instruments";
        if (lower.contains("oxygen") || lower.contains("cylinder")) return "Gas Supplies";
        return "General Supplies";
    }
    
    private void displayResults(Set<Item> items, Map<String, List<Item>> categoryMap) {
        System.out.println("=== MedInventory Report ===\n");
        
        System.out.println("Total Unique Items: " + items.size());
        System.out.println("\nExpired Items:");
        
        LocalDate today = LocalDate.now();
        for (Item item : items) {
            if (item.expiryDate.isBefore(today)) {
                System.out.println("  - " + item.itemName + " (Expired on: " + item.expiryDate + ")");
            }
        }
        
        System.out.println("\nCritical Low Supply Items:");
        for (Item item : items) {
            try {
                if (item.quantity < CRITICAL_THRESHOLD) {
                    throw new LowSupplyException(item.itemName + " has only " + item.quantity + " units!");
                }
            } catch (LowSupplyException e) {
                System.out.println("  ALERT: " + e.getMessage());
            }
        }
        
        System.out.println("\nItems by Category:");
        for (Map.Entry<String, List<Item>> entry : categoryMap.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            for (Item item : entry.getValue()) {
                System.out.println("  - " + item.itemName + " (Qty: " + item.quantity + ")");
            }
        }
    }
}
