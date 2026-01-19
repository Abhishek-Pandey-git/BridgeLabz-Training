package com.fitnesstracker;

/**
 * Represents a user in the fitness tracking system
 */
public class User {
    private String name;
    private int stepCount;
    
    public User(String name, int stepCount) {
        this.name = name;
        this.stepCount = stepCount;
    }
    
    public String getName() {
        return name;
    }
    
    public int getStepCount() {
        return stepCount;
    }
    
    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }
    
    /**
     * Simulates syncing additional steps from device
     */
    public void syncSteps(int additionalSteps) {
        this.stepCount += additionalSteps;
        System.out.println(name + " synced " + additionalSteps + " additional steps. Total: " + stepCount);
    }
    
    @Override
    public String toString() {
        return String.format("%-15s - %,6d steps", name, stepCount);
    }
}
