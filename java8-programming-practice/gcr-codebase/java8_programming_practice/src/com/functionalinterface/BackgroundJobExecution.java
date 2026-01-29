package com.functionalinterface;

public class BackgroundJobExecution {
    public static void main(String[] args) {
        // Background tasks using Runnable
        Runnable task1 = () -> {
            System.out.println("Task 1: Processing data in background...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Task 1: Completed");
        };
        
        Runnable task2 = () -> {
            System.out.println("Task 2: Sending email in background...");
            try { Thread.sleep(1500); } catch (InterruptedException e) {}
            System.out.println("Task 2: Completed");
        };
        
        Runnable task3 = () -> {
            System.out.println("Task 3: Generating report in background...");
            try { Thread.sleep(800); } catch (InterruptedException e) {}
            System.out.println("Task 3: Completed");
        };
        
        // Execute tasks asynchronously
        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
        
        System.out.println("Main thread continues...");
    }
}
