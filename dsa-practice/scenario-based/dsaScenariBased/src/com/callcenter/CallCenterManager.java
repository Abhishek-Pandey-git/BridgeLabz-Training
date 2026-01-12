package com.callcenter;

import java.util.*;

public class CallCenterManager {
    
    private Queue<Customer> regularQueue;
    private PriorityQueue<Customer> vipQueue;
    private HashMap<String, Integer> callCount;
    
    public CallCenterManager() {
        regularQueue = new LinkedList<>();
        // VIP queue processes VIPs first
        vipQueue = new PriorityQueue<>((c1, c2) -> c1.getName().compareTo(c2.getName()));
        callCount = new HashMap<>();
    }
    
    // Add customer to appropriate queue
    public void addCustomerCall(Customer customer) {
        if (customer.isVIP()) {
            vipQueue.offer(customer);
            System.out.println("VIP customer added: " + customer.getName());
        } else {
            regularQueue.offer(customer);
            System.out.println("Regular customer added: " + customer.getName());
        }
        
        // Update call count
        String phone = customer.getPhoneNumber();
        callCount.put(phone, callCount.getOrDefault(phone, 0) + 1);
    }
    
    // Process next call (VIP gets priority)
    public Customer processNextCall() {
        Customer customer = null;
        
        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Processing VIP call: " + customer.getName());
        } else if (!regularQueue.isEmpty()) {
            customer = regularQueue.poll();
            System.out.println("Processing regular call: " + customer.getName());
        } else {
            System.out.println("No calls in queue!");
        }
        
        return customer;
    }
    
    // Check how many times a customer has called this month
    public void checkCallHistory(String phoneNumber) {
        int count = callCount.getOrDefault(phoneNumber, 0);
        System.out.println("Phone " + phoneNumber + " has called " + count + " time(s) this month.");
    }
    
    // Display all waiting calls
    public void displayWaitingCalls() {
        System.out.println("\n--- Waiting Calls ---");
        System.out.println("VIP Queue: " + vipQueue.size() + " customers");
        for (Customer c : vipQueue) {
            System.out.println("  - " + c);
        }
        
        System.out.println("Regular Queue: " + regularQueue.size() + " customers");
        for (Customer c : regularQueue) {
            System.out.println("  - " + c);
        }
    }
    
    // Show all call counts
    public void displayAllCallCounts() {
        System.out.println("\n--- Call History (This Month) ---");
        for (Map.Entry<String, Integer> entry : callCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " call(s)");
        }
    }
}
