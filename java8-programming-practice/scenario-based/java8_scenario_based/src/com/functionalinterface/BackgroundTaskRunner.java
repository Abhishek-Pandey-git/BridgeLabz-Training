package com.functionalinterface;

public class BackgroundTaskRunner {
    public static void main(String[] args) {
        // Runnable for background task
        Runnable task = () -> {
            System.out.println("Background task started");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing step " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
            System.out.println("Background task completed");
        };
        
        new Thread(task).start();
        System.out.println("Main thread continues");
    }
}
