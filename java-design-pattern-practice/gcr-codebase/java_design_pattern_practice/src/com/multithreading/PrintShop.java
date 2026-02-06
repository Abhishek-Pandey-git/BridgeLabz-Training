package com.multithreading;

public class PrintShop {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting print jobs...");

        long startTime = System.currentTimeMillis();

        PrintJob job1 = new PrintJob("Job1", 10, 5);
        PrintJob job2 = new PrintJob("Job2", 5, 8);
        PrintJob job3 = new PrintJob("Job3", 15, 3);
        PrintJob job4 = new PrintJob("Job4", 8, 6);
        PrintJob job5 = new PrintJob("Job5", 12, 7);

        Thread t1 = new Thread(job1, "Job1-Thread");
        Thread t2 = new Thread(job2, "Job2-Thread");
        Thread t3 = new Thread(job3, "Job3-Thread");
        Thread t4 = new Thread(job4, "Job4-Thread");
        Thread t5 = new Thread(job5, "Job5-Thread");

        // Set priorities
        t1.setPriority(job1.getPriority());
        t2.setPriority(job2.getPriority());
        t3.setPriority(job3.getPriority());
        t4.setPriority(job4.getPriority());
        t5.setPriority(job5.getPriority());

        // Start jobs
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all jobs
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        long endTime = System.currentTimeMillis();

        System.out.println("All jobs completed in " +
                (endTime - startTime) + " ms");
    }
}
