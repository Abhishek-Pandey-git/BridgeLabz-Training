package com.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    private String transactionId;
    private double amount;
    
    // Constructor
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
        this.amount = Math.random() * 1000 + 100; // Random amount
    }
    
    @Override
    public String toString() {
        return "Invoice{transactionId='" + transactionId + "', amount=" + String.format("%.2f", amount) + "}";
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        // Transaction IDs
        List<String> transactionIds = Arrays.asList(
            "TXN001",
            "TXN002",
            "TXN003",
            "TXN004",
            "TXN005"
        );
        
        // Generate invoice objects using constructor reference
        List<Invoice> invoices = transactionIds.stream()
            .map(Invoice::new)
            .collect(Collectors.toList());
        
        System.out.println("Generated Invoices:");
        invoices.forEach(System.out::println);
    }
}
