package com.medwarehouse;

import java.time.LocalDate;

// Medicine class with name, batch number, and expiry date
public class Medicine {
    private String name;
    private String batchNumber;
    private LocalDate expiryDate;
    private String branchName;
    
    public Medicine(String name, String batchNumber, LocalDate expiryDate, String branchName) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.expiryDate = expiryDate;
        this.branchName = branchName;
    }
    
    public String getName() {
        return name;
    }
    
    public String getBatchNumber() {
        return batchNumber;
    }
    
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    
    public String getBranchName() {
        return branchName;
    }
    
    @Override
    public String toString() {
        return String.format("Medicine[%s, Batch: %s, Expiry: %s, Branch: %s]", 
            name, batchNumber, expiryDate, branchName);
    }
}
