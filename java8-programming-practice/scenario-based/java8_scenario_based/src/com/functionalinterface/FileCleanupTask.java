package com.functionalinterface;

public class FileCleanupTask {
    public static void main(String[] args) {
        // Runnable for file cleanup
        Runnable cleanupTask = () -> {
            System.out.println("File cleanup task started");
            System.out.println("Deleting temporary files...");
            System.out.println("Clearing cache...");
            System.out.println("File cleanup completed");
        };
        
        new Thread(cleanupTask).start();
    }
}
