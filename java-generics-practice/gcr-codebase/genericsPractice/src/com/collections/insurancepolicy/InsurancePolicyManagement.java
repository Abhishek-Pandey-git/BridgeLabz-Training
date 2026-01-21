package com.collections.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagement {
    
    private HashSet<Policy> hashSet;
    private LinkedHashSet<Policy> linkedHashSet;
    private TreeSet<Policy> treeSet;
    private Scanner scanner;

    public InsurancePolicyManagement() {
        hashSet = new HashSet<>();
        linkedHashSet = new LinkedHashSet<>();
        treeSet = new TreeSet<>();
        scanner = new Scanner(System.in);
    }

    // Add policy to all three sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Remove policy from all sets
    public void removePolicy(String policyNumber) {
        hashSet.removeIf(p -> p.getPolicyNumber().equals(policyNumber));
        linkedHashSet.removeIf(p -> p.getPolicyNumber().equals(policyNumber));
        treeSet.removeIf(p -> p.getPolicyNumber().equals(policyNumber));
    }

    // Display policies from HashSet
    public void displayHashSetPolicies() {
        System.out.println("\n=== HashSet Policies (No order) ===");
        for (Policy policy : hashSet) {
            System.out.println(policy);
        }
    }

    // Display policies from LinkedHashSet
    public void displayLinkedHashSetPolicies() {
        System.out.println("\n=== LinkedHashSet Policies (Insertion order) ===");
        for (Policy policy : linkedHashSet) {
            System.out.println(policy);
        }
    }

    // Display policies from TreeSet
    public void displayTreeSetPolicies() {
        System.out.println("\n=== TreeSet Policies (Sorted by expiry date) ===");
        for (Policy policy : treeSet) {
            System.out.println(policy);
        }
    }

    // Get policies expiring within next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringSoon = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysLater = today.plusDays(30);

        for (Policy policy : hashSet) {
            LocalDate expiry = policy.getExpiryDate();
            if (!expiry.isBefore(today) && !expiry.isAfter(thirtyDaysLater)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    // Get policies by coverage type
    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Find duplicate policies
    public void findDuplicates(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy policy : policies) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy.getPolicyNumber());
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate policies found.");
        } else {
            System.out.println("Duplicate policy numbers: " + duplicates);
        }
    }

    // Search for a policy
    public boolean searchPolicy(String policyNumber) {
        for (Policy policy : hashSet) {
            if (policy.getPolicyNumber().equals(policyNumber)) {
                return true;
            }
        }
        return false;
    }

    // Performance comparison
    public void performanceComparison(int numberOfOperations) {
        System.out.println("\n=== Performance Comparison ===");
        
        List<Policy> testPolicies = new ArrayList<>();
        for (int i = 0; i < numberOfOperations; i++) {
            testPolicies.add(new Policy("P" + i, "Holder" + i, 
                LocalDate.now().plusDays(i), "Health", 1000.0));
        }

        // HashSet performance
        HashSet<Policy> testHashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (Policy p : testPolicies) {
            testHashSet.add(p);
        }
        long endTime = System.nanoTime();
        System.out.printf("HashSet Add Time: %.2f ms\n", (endTime - startTime) / 1000000.0);

        startTime = System.nanoTime();
        testHashSet.contains(testPolicies.get(0));
        endTime = System.nanoTime();
        System.out.printf("HashSet Search Time: %.4f ms\n", (endTime - startTime) / 1000000.0);

        // LinkedHashSet performance
        LinkedHashSet<Policy> testLinkedHashSet = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (Policy p : testPolicies) {
            testLinkedHashSet.add(p);
        }
        endTime = System.nanoTime();
        System.out.printf("LinkedHashSet Add Time: %.2f ms\n", (endTime - startTime) / 1000000.0);

        startTime = System.nanoTime();
        testLinkedHashSet.contains(testPolicies.get(0));
        endTime = System.nanoTime();
        System.out.printf("LinkedHashSet Search Time: %.4f ms\n", (endTime - startTime) / 1000000.0);

        // TreeSet performance
        TreeSet<Policy> testTreeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (Policy p : testPolicies) {
            testTreeSet.add(p);
        }
        endTime = System.nanoTime();
        System.out.printf("TreeSet Add Time: %.2f ms\n", (endTime - startTime) / 1000000.0);

        startTime = System.nanoTime();
        testTreeSet.contains(testPolicies.get(0));
        endTime = System.nanoTime();
        System.out.printf("TreeSet Search Time: %.4f ms\n", (endTime - startTime) / 1000000.0);
    }

    // Interactive menu
    public void showMenu() {
        while (true) {
            System.out.println("\n=== Insurance Policy Management System ===");
            System.out.println("1. Add Policy");
            System.out.println("2. Remove Policy");
            System.out.println("3. Display HashSet Policies");
            System.out.println("4. Display LinkedHashSet Policies");
            System.out.println("5. Display TreeSet Policies");
            System.out.println("6. Show Policies Expiring Soon (30 days)");
            System.out.println("7. Search by Coverage Type");
            System.out.println("8. Search Policy by Number");
            System.out.println("9. Performance Comparison");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPolicyInteractive();
                    break;
                case 2:
                    removePolicyInteractive();
                    break;
                case 3:
                    displayHashSetPolicies();
                    break;
                case 4:
                    displayLinkedHashSetPolicies();
                    break;
                case 5:
                    displayTreeSetPolicies();
                    break;
                case 6:
                    showPoliciesExpiringSoon();
                    break;
                case 7:
                    searchByCoverageType();
                    break;
                case 8:
                    searchPolicyInteractive();
                    break;
                case 9:
                    System.out.print("Enter number of operations: ");
                    int ops = scanner.nextInt();
                    performanceComparison(ops);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Helper method to add policy with user input
    private void addPolicyInteractive() {
        System.out.print("Enter Policy Number: ");
        String policyNumber = scanner.nextLine();

        System.out.print("Enter Policyholder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();
        LocalDate expiryDate = LocalDate.parse(dateStr);

        System.out.print("Enter Coverage Type (Health/Auto/Home): ");
        String coverageType = scanner.nextLine();

        System.out.print("Enter Premium Amount: ");
        double premium = scanner.nextDouble();
        scanner.nextLine();

        Policy policy = new Policy(policyNumber, name, expiryDate, coverageType, premium);
        addPolicy(policy);
        System.out.println("Policy added successfully!");
    }

    // Helper method to remove policy
    private void removePolicyInteractive() {
        System.out.print("Enter Policy Number to remove: ");
        String policyNumber = scanner.nextLine();
        removePolicy(policyNumber);
        System.out.println("Policy removed successfully!");
    }

    // Helper method to show expiring policies
    private void showPoliciesExpiringSoon() {
        List<Policy> expiring = getPoliciesExpiringSoon();
        System.out.println("\n=== Policies Expiring Soon (30 days) ===");
        if (expiring.isEmpty()) {
            System.out.println("No policies expiring soon.");
        } else {
            for (Policy policy : expiring) {
                System.out.println(policy);
            }
        }
    }

    // Helper method to search by coverage type
    private void searchByCoverageType() {
        System.out.print("Enter Coverage Type: ");
        String coverageType = scanner.nextLine();
        List<Policy> policies = getPoliciesByCoverageType(coverageType);
        
        System.out.println("\n=== Policies with Coverage Type: " + coverageType + " ===");
        if (policies.isEmpty()) {
            System.out.println("No policies found.");
        } else {
            for (Policy policy : policies) {
                System.out.println(policy);
            }
        }
    }

    // Helper method to search policy
    private void searchPolicyInteractive() {
        System.out.print("Enter Policy Number: ");
        String policyNumber = scanner.nextLine();
        
        if (searchPolicy(policyNumber)) {
            System.out.println("Policy found!");
        } else {
            System.out.println("Policy not found.");
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        
        // Add sample data
        system.addPolicy(new Policy("P001", "John Doe", LocalDate.of(2026, 2, 15), "Health", 1200.0));
        system.addPolicy(new Policy("P002", "Jane Smith", LocalDate.of(2026, 3, 20), "Auto", 800.0));
        system.addPolicy(new Policy("P003", "Bob Johnson", LocalDate.of(2026, 1, 25), "Home", 1500.0));
        system.addPolicy(new Policy("P004", "Alice Brown", LocalDate.of(2026, 2, 5), "Health", 1100.0));
        system.addPolicy(new Policy("P005", "Charlie Davis", LocalDate.of(2027, 5, 10), "Auto", 900.0));

        System.out.println("Sample policies added!");
        
        // Start interactive menu
        system.showMenu();
    }
}
