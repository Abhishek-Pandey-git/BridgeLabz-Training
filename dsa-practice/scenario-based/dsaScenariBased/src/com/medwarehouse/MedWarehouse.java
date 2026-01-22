package com.medwarehouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Medicine warehouse management using Merge Sort
public class MedWarehouse {
    
    // Merge two sorted lists by expiry date
    private List<Medicine> merge(List<Medicine> left, List<Medicine> right) {
        List<Medicine> merged = new ArrayList<>();
        int i = 0, j = 0;
        
        // Compare and merge based on expiry date
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getExpiryDate().isBefore(right.get(j).getExpiryDate()) ||
                left.get(i).getExpiryDate().equals(right.get(j).getExpiryDate())) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
        
        // Add remaining elements from left list
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        
        // Add remaining elements from right list
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }
        
        return merged;
    }
    
    // Merge sort implementation
    private List<Medicine> mergeSort(List<Medicine> medicines) {
        if (medicines.size() <= 1) {
            return medicines;
        }
        
        // Split into two halves
        int mid = medicines.size() / 2;
        List<Medicine> left = new ArrayList<>(medicines.subList(0, mid));
        List<Medicine> right = new ArrayList<>(medicines.subList(mid, medicines.size()));
        
        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);
        
        // Merge sorted halves
        return merge(left, right);
    }
    
    // Merge multiple branch inventories (already sorted) into one sorted list
    public List<Medicine> mergeBranchInventories(List<List<Medicine>> branchInventories) {
        if (branchInventories.isEmpty()) {
            return new ArrayList<>();
        }
        
        // Combine all inventories into one list
        List<Medicine> allMedicines = new ArrayList<>();
        for (List<Medicine> inventory : branchInventories) {
            allMedicines.addAll(inventory);
        }
        
        // Sort using merge sort
        return mergeSort(allMedicines);
    }
    
    // Display medicines sorted by expiry date
    public void displayMedicines(List<Medicine> medicines) {
        if (medicines.isEmpty()) {
            System.out.println("No medicines in inventory.");
            return;
        }
        
        System.out.println("\n=== Medicines Sorted by Expiry Date ===");
        for (int i = 0; i < medicines.size(); i++) {
            System.out.println((i + 1) + ". " + medicines.get(i));
        }
    }
    
    // Show medicines expiring within next n days
    public void showExpiringMedicines(List<Medicine> medicines, int days) {
        LocalDate threshold = LocalDate.now().plusDays(days);
        System.out.println("\n=== Medicines Expiring in Next " + days + " Days ===");
        
        boolean found = false;
        for (Medicine medicine : medicines) {
            if (!medicine.getExpiryDate().isAfter(threshold)) {
                System.out.println(medicine);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No medicines expiring in next " + days + " days.");
        }
    }
    
    // Show expired medicines
    public void showExpiredMedicines(List<Medicine> medicines) {
        LocalDate today = LocalDate.now();
        System.out.println("\n=== Expired Medicines (URGENT REMOVAL) ===");
        
        boolean found = false;
        for (Medicine medicine : medicines) {
            if (medicine.getExpiryDate().isBefore(today)) {
                System.out.println(medicine);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No expired medicines.");
        }
    }
    
    public static void main(String[] args) {
        MedWarehouse warehouse = new MedWarehouse();
        Scanner scanner = new Scanner(System.in);
        
        // Create sample data from different branches
        System.out.println("Loading medicine data from multiple branches...\n");
        
        // Branch 1 inventory (already sorted)
        List<Medicine> branch1 = new ArrayList<>();
        branch1.add(new Medicine("Aspirin", "B001", LocalDate.of(2026, 1, 30), "Branch-1"));
        branch1.add(new Medicine("Paracetamol", "B002", LocalDate.of(2026, 3, 15), "Branch-1"));
        branch1.add(new Medicine("Ibuprofen", "B003", LocalDate.of(2026, 5, 20), "Branch-1"));
        
        // Branch 2 inventory (already sorted)
        List<Medicine> branch2 = new ArrayList<>();
        branch2.add(new Medicine("Amoxicillin", "B101", LocalDate.of(2026, 2, 10), "Branch-2"));
        branch2.add(new Medicine("Ciprofloxacin", "B102", LocalDate.of(2026, 4, 25), "Branch-2"));
        branch2.add(new Medicine("Metformin", "B103", LocalDate.of(2026, 6, 30), "Branch-2"));
        
        // Branch 3 inventory (already sorted)
        List<Medicine> branch3 = new ArrayList<>();
        branch3.add(new Medicine("Lisinopril", "B201", LocalDate.of(2026, 1, 25), "Branch-3"));
        branch3.add(new Medicine("Atorvastatin", "B202", LocalDate.of(2026, 3, 5), "Branch-3"));
        branch3.add(new Medicine("Omeprazole", "B203", LocalDate.of(2026, 7, 15), "Branch-3"));
        
        // Merge all branch inventories
        List<List<Medicine>> allBranches = new ArrayList<>();
        allBranches.add(branch1);
        allBranches.add(branch2);
        allBranches.add(branch3);
        
        List<Medicine> sortedInventory = warehouse.mergeBranchInventories(allBranches);
        System.out.println("All branches merged successfully!");
        
        while (true) {
            System.out.println("\n=== Medicine Warehouse Management ===");
            System.out.println("1. Display All Medicines (Sorted by Expiry)");
            System.out.println("2. Show Medicines Expiring Soon");
            System.out.println("3. Show Expired Medicines");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    warehouse.displayMedicines(sortedInventory);
                    break;
                    
                case 2:
                    System.out.print("Enter number of days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();
                    warehouse.showExpiringMedicines(sortedInventory, days);
                    break;
                    
                case 3:
                    warehouse.showExpiredMedicines(sortedInventory);
                    break;
                    
                case 4:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
