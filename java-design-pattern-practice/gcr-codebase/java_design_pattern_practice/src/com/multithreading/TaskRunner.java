package com.multithreading;

public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            // TIMED_WAITING
            Thread.sleep(2000);

            // RUNNABLE (computation)
            long sum = 0;
            for (int i = 0; i < 1_000_000; i++) {
                sum += i;
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

