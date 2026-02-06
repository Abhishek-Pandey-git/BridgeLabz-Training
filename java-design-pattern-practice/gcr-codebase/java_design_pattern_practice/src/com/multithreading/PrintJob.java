package com.multithreading;

class PrintJob implements Runnable {

    private final String jobName;
    private final int pages;
    private final int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for (int i = 1; i <= pages; i++) {
            System.out.println("[" + getPriorityLabel() + "] Printing " +
                    jobName + " - Page " + i + " of " + pages);

            try {
                Thread.sleep(100); // 100 ms per page
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(jobName + " completed in " + (end - start) + " ms");
    }

    public int getPriority() {
        return priority;
    }

    private String getPriorityLabel() {
        if (priority >= 7) return "High Priority";
        if (priority >= 5) return "Medium Priority";
        return "Low Priority";
    }
}

