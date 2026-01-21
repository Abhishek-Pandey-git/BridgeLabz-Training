package com.collections.insurancepolicy;

import java.time.LocalDate;
import java.util.List;

public class DemoRunner {
    
    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        
        System.out.println("=== Insurance Policy Management System Demo ===\n");
        
        // Add sample policies
        System.out.println("Adding sample policies...");
        system.addPolicy(new Policy("P001", "John Doe", LocalDate.of(2026, 2, 15), "Health", 1200.0));
        system.addPolicy(new Policy("P002", "Jane Smith", LocalDate.of(2026, 3, 20), "Auto", 800.0));
        system.addPolicy(new Policy("P003", "Bob Johnson", LocalDate.of(2026, 1, 25), "Home", 1500.0));
        system.addPolicy(new Policy("P004", "Alice Brown", LocalDate.of(2026, 2, 5), "Health", 1100.0));
        system.addPolicy(new Policy("P005", "Charlie Davis", LocalDate.of(2027, 5, 10), "Auto", 900.0));
        System.out.println("5 policies added!\n");
        
        // Display from HashSet
        system.displayHashSetPolicies();
        
        // Display from LinkedHashSet
        system.displayLinkedHashSetPolicies();
        
        // Display from TreeSet
        system.displayTreeSetPolicies();
        
        // Show policies expiring soon
        System.out.println("\n=== Policies Expiring Soon (30 days) ===");
        List<Policy> expiring = system.getPoliciesExpiringSoon();
        if (expiring.isEmpty()) {
            System.out.println("No policies expiring soon.");
        } else {
            for (Policy policy : expiring) {
                System.out.println(policy);
            }
        }
        
        // Search by coverage type
        System.out.println("\n=== Health Coverage Policies ===");
        List<Policy> healthPolicies = system.getPoliciesByCoverageType("Health");
        for (Policy policy : healthPolicies) {
            System.out.println(policy);
        }
        
        // Search for specific policy
        System.out.println("\n=== Search Policy P003 ===");
        boolean found = system.searchPolicy("P003");
        System.out.println("Policy P003 found: " + found);
        
        // Performance comparison
        system.performanceComparison(1000);
        
        System.out.println("\n=== Demo completed! ===");
        System.out.println("\nTo use interactive menu, run InsurancePolicyManagement.main()");
    }
}
