package com.bank_transaction;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    
    //store account balances
    private Map<Integer,Integer> accounts;
    
    public Bank() {
        accounts=new HashMap<>();
    }
    
    
    //create new account
    public void createAccount(int accountNumber,int initialBalance){
        accounts.put(accountNumber, initialBalance);
        System.out.println("Account "+accountNumber+" created with balance: "+initialBalance);
    }
    
    
    //deposit money - synchronized to prevent race condition
    public synchronized void deposit(int accountNumber,int amount){
        if(!accounts.containsKey(accountNumber)){
            System.out.println("Account not found!");
            return;
        }
        
        int currentBalance=accounts.get(accountNumber);
        
        //simulate processing time
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        int newBalance=currentBalance+amount;
        accounts.put(accountNumber,newBalance);
        
        System.out.println("Deposited "+amount+" to account "+accountNumber+". New balance: "+newBalance);
    }
    
    
    
    //withdraw money - synchronized
    public synchronized void withdraw(int accountNumber,int amount){
        if(!accounts.containsKey(accountNumber)){
            System.out.println("Account not found!");
            return;
        }
        
        int currentBalance=accounts.get(accountNumber);
        
        if(currentBalance<amount){
            System.out.println("Insufficient balance! Account "+accountNumber+" has "+currentBalance);
            return;
        }
        
        //simulate processing
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        int newBalance=currentBalance-amount;
        accounts.put(accountNumber,newBalance);
        
        System.out.println("Withdrew "+amount+" from account "+accountNumber+". New balance: "+newBalance);
    }
    
    
    //get balance
    public synchronized int getBalance(int accountNumber){
        if(!accounts.containsKey(accountNumber)){
            System.out.println("Account not found!");
            return -1;
        }
        return accounts.get(accountNumber);
    }
    
    
    //display all balances
    public void displayAllBalances(){
        System.out.println("\n===== Final Account Balances =====");
        for(Map.Entry<Integer,Integer> entry:accounts.entrySet()){
            System.out.println("Account "+entry.getKey()+": "+entry.getValue());
        }
        System.out.println("==================================\n");
    }
}
