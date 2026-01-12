package com.callcenter;

public class Customer {
    private String name;
    private String phoneNumber;
    private boolean isVIP;
    
    public Customer(String name, String phoneNumber, boolean isVIP) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isVIP = isVIP;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public boolean isVIP() {
        return isVIP;
    }
    
    @Override
    public String toString() {
        String type = isVIP ? "VIP" : "Regular";
        return name + " (" + phoneNumber + ") - " + type;
    }
}
