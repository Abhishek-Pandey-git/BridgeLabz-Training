package com.collections.banking;

public class BankingSystemDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Banking System Demo ===\n");
        
        BankingSystem bank = new BankingSystem();
        
        // Create accounts
        System.out.println("--- Creating Accounts ---");
        bank.createAccount("ACC001", "John Doe", 5000.0);
        bank.createAccount("ACC002", "Jane Smith", 3000.0);
        bank.createAccount("ACC003", "Bob Johnson", 7500.0);
        bank.createAccount("ACC004", "Alice Brown", 2000.0);
        bank.createAccount("ACC005", "Charlie Davis", 10000.0);
        
        // Display all accounts (HashMap - no order)
        bank.displayAllAccounts();
        
        // Display sorted by balance (TreeMap - sorted)
        bank.displayAccountsSortedByBalance();
        
        // Deposit money
        System.out.println("\n--- Depositing Money ---");
        bank.deposit("ACC002", 1500.0);
        bank.deposit("ACC004", 3000.0);
        
        // Updated balances
        bank.displayAccountsSortedByBalance();
        
        // Add withdrawal requests to queue
        System.out.println("\n--- Adding Withdrawal Requests to Queue ---");
        bank.requestWithdrawal("ACC001", 500.0);
        bank.requestWithdrawal("ACC003", 1000.0);
        bank.requestWithdrawal("ACC005", 2000.0);
        bank.requestWithdrawal("ACC002", 300.0);
        
        // Display withdrawal queue
        bank.displayWithdrawalQueue();
        
        // Process withdrawals one by one
        System.out.println("\n--- Processing Withdrawals ---");
        bank.processNextWithdrawal();
        bank.processNextWithdrawal();
        
        // Display remaining queue
        bank.displayWithdrawalQueue();
        
        // Process all remaining
        bank.processAllWithdrawals();
        
        // Final balances
        bank.displayAccountsSortedByBalance();
        
        // Try invalid withdrawal
        System.out.println("\n--- Testing Insufficient Balance ---");
        bank.requestWithdrawal("ACC004", 50000.0);
        bank.processNextWithdrawal();
        
        System.out.println("\n=== Demo Completed ===");
        System.out.println("Run BankingSystem.main() for interactive menu");
    }
}
