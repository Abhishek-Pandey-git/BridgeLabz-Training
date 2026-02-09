package com.bank_transaction;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("===== Bank Transaction System Started =====\n");
        
        //create bank
        Bank bank=new Bank();
        
        
        //create accounts
        bank.createAccount(1001,1000);
        bank.createAccount(1002,2000);
        bank.createAccount(1003,1500);
        
        System.out.println();
        
        
        //create customers
        Customer customer1=new Customer(1,1001,bank,5);
        Customer customer2=new Customer(2,1002,bank,5);
        Customer customer3=new Customer(3,1003,bank,5);
        Customer customer4=new Customer(4,1001,bank,4);  //same account as customer1
        Customer customer5=new Customer(5,1002,bank,3);  //same account as customer2
        
        
        //start all customer threads
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();
        
        
        //wait for all threads to complete
        try{
            customer1.join();
            customer2.join();
            customer3.join();
            customer4.join();
            customer5.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        
        System.out.println("\n===== All Transactions Completed =====");
        
        //display final balances
        bank.displayAllBalances();
        
        
        //verify balances
        System.out.println("Verifying account balances:");
        System.out.println("Account 1001 balance: "+bank.getBalance(1001));
        System.out.println("Account 1002 balance: "+bank.getBalance(1002));
        System.out.println("Account 1003 balance: "+bank.getBalance(1003));
        
        System.out.println("\n===== System Shutdown =====");
    }
}
