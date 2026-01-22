package com.medwarehouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Demo for MedWarehouse Merge Sort
public class MedWarehouseDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Medicine Warehouse - Merge Sort Demo ===\n");
        
        MedWarehouse warehouse = new MedWarehouse();
        
        // Create sample data from different branches (each already sorted)
        System.out.println("Branch 1 Inventory (sorted):");
        List<Medicine> branch1 = new ArrayList<>();
        branch1.add(new Medicine("Aspirin", "B001", LocalDate.of(2026, 1, 30), "Branch-1"));
        branch1.add(new Medicine("Paracetamol", "B002", LocalDate.of(2026, 3, 15), "Branch-1"));
        branch1.add(new Medicine("Ibuprofen", "B003", LocalDate.of(2026, 5, 20), "Branch-1"));
        for (Medicine med : branch1) {
            System.out.println("  " + med);
        }
        
        System.out.println("\nBranch 2 Inventory (sorted):");
        List<Medicine> branch2 = new ArrayList<>();
        branch2.add(new Medicine("Amoxicillin", "B101", LocalDate.of(2026, 2, 10), "Branch-2"));
        branch2.add(new Medicine("Ciprofloxacin", "B102", LocalDate.of(2026, 4, 25), "Branch-2"));
        branch2.add(new Medicine("Metformin", "B103", LocalDate.of(2026, 6, 30), "Branch-2"));
        for (Medicine med : branch2) {
            System.out.println("  " + med);
        }
        
        System.out.println("\nBranch 3 Inventory (sorted):");
        List<Medicine> branch3 = new ArrayList<>();
        branch3.add(new Medicine("Lisinopril", "B201", LocalDate.of(2026, 1, 25), "Branch-3"));
        branch3.add(new Medicine("Atorvastatin", "B202", LocalDate.of(2026, 3, 5), "Branch-3"));
        branch3.add(new Medicine("Omeprazole", "B203", LocalDate.of(2026, 7, 15), "Branch-3"));
        for (Medicine med : branch3) {
            System.out.println("  " + med);
        }
        
        // Merge all branches using merge sort
        System.out.println("\n--- Merging All Branches Using Merge Sort ---");
        List<List<Medicine>> allBranches = new ArrayList<>();
        allBranches.add(branch1);
        allBranches.add(branch2);
        allBranches.add(branch3);
        
        List<Medicine> sortedInventory = warehouse.mergeBranchInventories(allBranches);
        
        // Display merged and sorted inventory
        warehouse.displayMedicines(sortedInventory);
        
        // Show medicines expiring soon
        warehouse.showExpiringMedicines(sortedInventory, 30);
        warehouse.showExpiringMedicines(sortedInventory, 60);
        
        // Check for expired medicines
        warehouse.showExpiredMedicines(sortedInventory);
        
        System.out.println("\n=== Demo Completed ===");
        System.out.println("Merge Sort efficiently merged 3 sorted branch inventories!");
        System.out.println("Perfect for combining sorted sublists from multiple sources.");
    }
}
