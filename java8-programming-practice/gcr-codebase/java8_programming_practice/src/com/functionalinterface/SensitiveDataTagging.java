package com.functionalinterface;

// Custom marker interface for sensitive data
interface SensitiveData {
}

class BankAccount implements SensitiveData {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }
}

class CreditCardInfo implements SensitiveData {
    private String cardNumber;
    private String cvv;
    
    public CreditCardInfo(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    
    @Override
    public String toString() {
        return "CreditCardInfo{cardNumber='" + cardNumber + "', cvv='" + cvv + "'}";
    }
}

class PublicInfo {
    private String name;
    
    public PublicInfo(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "PublicInfo{name='" + name + "'}";
    }
}

public class SensitiveDataTagging {
    public static void encryptIfSensitive(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
        } else {
            System.out.println("No encryption needed: " + obj);
        }
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 50000);
        CreditCardInfo card = new CreditCardInfo("9876543210", "123");
        PublicInfo info = new PublicInfo("John Doe");
        
        encryptIfSensitive(account);
        encryptIfSensitive(card);
        encryptIfSensitive(info);
    }
}
