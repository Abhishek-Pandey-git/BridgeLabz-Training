package com.linkedlist.circularlinkedlist;

/**
 * Process for Round Robin CPU Scheduling.
 */
public class Process {
    private final int processId;
    private int burstTime;
    private final int priority;
    private int remainingTime;
    private int waitingTime;
    private int turnaroundTime;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }

    public int getProcessId() { return processId; }
    public int getBurstTime() { return burstTime; }
    public int getPriority() { return priority; }
    public int getRemainingTime() { return remainingTime; }
    public int getWaitingTime() { return waitingTime; }
    public int getTurnaroundTime() { return turnaroundTime; }

    public void setRemainingTime(int remainingTime) { this.remainingTime = remainingTime; }
    public void setWaitingTime(int waitingTime) { this.waitingTime = waitingTime; }
    public void setTurnaroundTime(int turnaroundTime) { this.turnaroundTime = turnaroundTime; }

    public boolean isComplete() { return remainingTime <= 0; }

    @Override
    public String toString() {
        return "P" + processId + " [Burst:" + burstTime + " Remaining:" + remainingTime 
                + " Priority:" + priority + "]";
    }
}
