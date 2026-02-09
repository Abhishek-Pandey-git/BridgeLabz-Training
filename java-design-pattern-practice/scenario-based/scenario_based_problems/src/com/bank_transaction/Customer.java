package com.bank_transaction;

import java.util.Random;

public class Customer extends Thread {
    
    private int customerId;
    private int accountNumber;
    private Bank bank;
    private int numOfTransactions;
    
    
    public Customer(int customerId,int accountNumber,Bank bank,int numOfTransactions){
        this.customerId=customerId;
        this.accountNumber=accountNumber;
        this.bank=bank;
        this.numOfTransactions=numOfTransactions;
    }
    
    
    @Override
    public void run(){
        Random random=new Random();
        
        System.out.println("Customer "+customerId+" started transactions on account "+accountNumber);
        
        for(int i=0;i<numOfTransactions;i++){
            
            //randomly choose deposit or withdraw
            boolean isDeposit=random.nextBoolean();
            int amount=random.nextInt(500)+100;  //amount between 100-600
            
            if(isDeposit){
                System.out.println("Customer "+customerId+" attempting deposit of "+amount);
                bank.deposit(accountNumber,amount);
            }else{
                System.out.println("Customer "+customerId+" attempting withdrawal of "+amount);
                bank.withdraw(accountNumber,amount);
            }
            
            
            //small delay between transactions
            try{
                Thread.sleep(random.nextInt(50));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        System.out.println("Customer "+customerId+" completed all transactions");
    }
    
    
    public int getCustomerId(){
        return customerId;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
}
