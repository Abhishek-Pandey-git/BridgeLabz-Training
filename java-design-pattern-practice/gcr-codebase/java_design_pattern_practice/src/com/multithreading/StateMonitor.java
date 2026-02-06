package com.multithreading;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class StateMonitor extends Thread {

    private final Thread[] threads;
    private final Set<String> observedStates = new HashSet<>();

    public StateMonitor(Thread... threads) {
        super("Monitor");
        this.threads = threads;
    }

    @Override
    public void run() {

        boolean allTerminated;

        do {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                observedStates.add(t.getName() + " -> " + state);

                System.out.println("[Monitor] " + t.getName() +
                        " is in " + state +
                        " state at " + LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        } while (!allTerminated);

        printSummary();
    }

    private void printSummary() {
        System.out.println("\nSummary of state changes:");
        for (String s : observedStates) {
            System.out.println(s);
        }
    }
}
