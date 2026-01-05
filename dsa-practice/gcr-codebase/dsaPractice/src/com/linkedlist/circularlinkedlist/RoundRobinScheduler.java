package com.linkedlist.circularlinkedlist;

/**
 * Circular linked list for Round Robin CPU Scheduling.
 */
public class RoundRobinScheduler {
    private Node head;
    private Node current;
    private int timeQuantum;

    private static class Node {
        Process data;
        Node next;
        Node(Process data) { this.data = data; }
    }

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(Process process) {
        Node newNode = new Node(process);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            Node last = head;
            while (last.next != head) last = last.next;
            last.next = newNode;
            newNode.next = head;
        }
    }

    public boolean removeProcess(int processId) {
        if (head == null) return false;
        if (head.data.getProcessId() == processId && head == head.next) {
            head = null;
            current = null;
            return true;
        }
        Node temp = head, prev = null;
        if (head.data.getProcessId() == processId) {
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            head = head.next;
            current = head;
            return true;
        }
        prev = head;
        temp = head.next;
        while (temp != head) {
            if (temp.data.getProcessId() == processId) {
                prev.next = temp.next;
                if (current == temp) current = temp.next;
                return true;
            }
            prev = temp;
            temp = temp.next;
        }
        return false;
    }

    public void simulate() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        
        System.out.println("\n=== Round Robin Scheduling (Time Quantum: " + timeQuantum + ") ===\n");
        int currentTime = 0;
        int round = 1;
        
        while (head != null) {
            System.out.println("Round " + round + ":");
            Node temp = head;
            boolean anyProcessLeft = false;
            
            do {
                Process p = temp.data;
                if (!p.isComplete()) {
                    int execTime = Math.min(timeQuantum, p.getRemainingTime());
                    p.setRemainingTime(p.getRemainingTime() - execTime);
                    currentTime += execTime;
                    
                    System.out.println("  P" + p.getProcessId() + " executed for " + execTime 
                            + " units (Remaining: " + p.getRemainingTime() + ")");
                    
                    if (p.isComplete()) {
                        p.setTurnaroundTime(currentTime);
                        p.setWaitingTime(currentTime - p.getBurstTime());
                    } else {
                        anyProcessLeft = true;
                    }
                }
                temp = temp.next;
            } while (temp != head);
            
            // Remove completed processes
            Node check = head;
            do {
                Node nextNode = check.next;
                if (check.data.isComplete()) {
                    removeProcess(check.data.getProcessId());
                }
                check = nextNode;
            } while (check != null && check != head && head != null);
            
            round++;
            if (!anyProcessLeft) break;
        }
        System.out.println("\nAll processes completed.");
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }
        Node temp = head;
        System.out.println("Process Queue:");
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }
}
