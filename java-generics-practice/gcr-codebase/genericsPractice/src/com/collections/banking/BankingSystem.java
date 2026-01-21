package com.collections.banking;

import java.util.*;

public class BankingSystem {
    
    // HashMap stores account number to Account mapping
    private HashMap<String, Account> accounts;
    
    // Queue processes withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue;
    
    private Scanner scanner;

    public BankingSystem() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    // Create new account
    public void createAccount(String accountNumber, String customerName, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists!");
            return;
        }
        
        Account account = new Account(accountNumber, customerName, initialBalance);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully!");
    }

    // Get account by account number
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Display all accounts
    public void displayAllAccounts() {
        System.out.println("\n=== All Accounts ===");
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }

    // Display accounts sorted by balance using TreeMap
    public void displayAccountsSortedByBalance() {
        System.out.println("\n=== Accounts Sorted by Balance ===");
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        
        // Create TreeMap sorted by balance
        TreeMap<Double, List<Account>> sortedByBalance = new TreeMap<>(Collections.reverseOrder());
        
        for (Account account : accounts.values()) {
            double balance = account.getBalance();
            sortedByBalance.computeIfAbsent(balance, k -> new ArrayList<>()).add(account);
        }
        
        for (Map.Entry<Double, List<Account>> entry : sortedByBalance.entrySet()) {
            for (Account account : entry.getValue()) {
                System.out.println(account);
            }
        }
    }

    // Deposit money
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        
        account.deposit(amount);
        System.out.printf("$%.2f deposited successfully! New balance: $%.2f\n", 
            amount, account.getBalance());
    }

    // Add withdrawal request to queue
    public void requestWithdrawal(String accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }
        
        WithdrawalRequest request = new WithdrawalRequest(accountNumber, amount);
        withdrawalQueue.offer(request);
        System.out.println("Withdrawal request added to queue!");
    }

    // Process next withdrawal request
    public void processNextWithdrawal() {
        if (withdrawalQueue.isEmpty()) {
            System.out.println("No pending withdrawal requests!");
            return;
        }
        
        WithdrawalRequest request = withdrawalQueue.poll();
        System.out.println("\nProcessing: " + request);
        
        Account account = accounts.get(request.getAccountNumber());
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        
        if (account.withdraw(request.getAmount())) {
            System.out.printf("Withdrawal successful! New balance: $%.2f\n", 
                account.getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Process all withdrawal requests
    public void processAllWithdrawals() {
        System.out.println("\n=== Processing All Withdrawal Requests ===");
        int count = 0;
        
        while (!withdrawalQueue.isEmpty()) {
            processNextWithdrawal();
            count++;
        }
        
        System.out.println("Total requests processed: " + count);
    }

    // Display pending withdrawal requests
    public void displayWithdrawalQueue() {
        System.out.println("\n=== Pending Withdrawal Requests ===");
        if (withdrawalQueue.isEmpty()) {
            System.out.println("No pending requests!");
            return;
        }
        
        int position = 1;
        for (WithdrawalRequest request : withdrawalQueue) {
            System.out.println(position + ". " + request);
            position++;
        }
    }

    // Interactive menu
    public void showMenu() {
        while (true) {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Display Accounts Sorted by Balance");
            System.out.println("4. Deposit Money");
            System.out.println("5. Request Withdrawal");
            System.out.println("6. Process Next Withdrawal");
            System.out.println("7. Process All Withdrawals");
            System.out.println("8. View Withdrawal Queue");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccountInteractive();
                    break;
                case 2:
                    displayAllAccounts();
                    break;
                case 3:
                    displayAccountsSortedByBalance();
                    break;
                case 4:
                    depositInteractive();
                    break;
                case 5:
                    requestWithdrawalInteractive();
                    break;
                case 6:
                    processNextWithdrawal();
                    break;
                case 7:
                    processAllWithdrawals();
                    break;
                case 8:
                    displayWithdrawalQueue();
                    break;
                case 9:
                    System.out.println("Thank you for using our banking system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Helper method to create account with user input
    private void createAccountInteractive() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        createAccount(accountNumber, name, balance);
    }

    // Helper method to deposit
    private void depositInteractive() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Amount to Deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        deposit(accountNumber, amount);
    }

    // Helper method to request withdrawal
    private void requestWithdrawalInteractive() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Amount to Withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        requestWithdrawal(accountNumber, amount);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        
        // Create sample accounts
        System.out.println("Creating sample accounts...");
        bank.createAccount("ACC001", "John Doe", 5000.0);
        bank.createAccount("ACC002", "Jane Smith", 3000.0);
        bank.createAccount("ACC003", "Bob Johnson", 7500.0);
        bank.createAccount("ACC004", "Alice Brown", 2000.0);
        
        // Display accounts
        bank.displayAllAccounts();
        bank.displayAccountsSortedByBalance();
        
        // Add withdrawal requests
        System.out.println("\nAdding withdrawal requests...");
        bank.requestWithdrawal("ACC001", 500.0);
        bank.requestWithdrawal("ACC002", 1000.0);
        bank.requestWithdrawal("ACC003", 200.0);
        
        // Display queue
        bank.displayWithdrawalQueue();
        
        // Process withdrawals
        bank.processAllWithdrawals();
        
        // Display updated balances
        bank.displayAccountsSortedByBalance();
        
        System.out.println("\n--- Starting Interactive Menu ---");
        bank.showMenu();
    }
}
