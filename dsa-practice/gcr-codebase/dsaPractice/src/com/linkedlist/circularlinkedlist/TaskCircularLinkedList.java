package com.linkedlist.circularlinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Circular linked list implementation for task scheduling.
 * The last node points back to the first node, creating a circle.
 */
public class TaskCircularLinkedList {
    private Node head;
    private Node current;  // Tracks the current task

    // Inner Node class
    private static class Node {
        private final Task data;
        private Node next;

        private Node(Task data) {
            this.data = data;
        }
    }

    /**
     * Add a task at the beginning of the circular list.
     */
    public void addAtBeginning(Task task) {
        Node newNode = new Node(task);
        
        if (head == null) {
            // First node - point to itself
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            // Find the last node
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            
            // Insert at beginning
            newNode.next = head;
            last.next = newNode;
            head = newNode;
            current = head;
        }
    }

    /**
     * Add a task at the end of the circular list.
     */
    public void addAtEnd(Task task) {
        Node newNode = new Node(task);
        
        if (head == null) {
            // First node - point to itself
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            // Find the last node
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            
            // Insert at end
            last.next = newNode;
            newNode.next = head;
        }
    }

    /**
     * Insert a task at a specific position (1-indexed).
     */
    public boolean insertAtPosition(Task task, int position) {
        if (position <= 0) {
            return false;
        }
        
        if (position == 1) {
            addAtBeginning(task);
            return true;
        }

        Node temp = head;
        int index = 1;
        
        // Traverse to position-1
        while (index < position - 1 && temp.next != head) {
            temp = temp.next;
            index++;
        }

        // Check if position is valid
        if (index < position - 1) {
            return false;
        }

        Node newNode = new Node(task);
        newNode.next = temp.next;
        temp.next = newNode;
        
        return true;
    }

    /**
     * Remove a task by Task ID.
     */
    public boolean removeByTaskId(int taskId) {
        if (head == null) {
            return false;
        }

        Node temp = head;
        Node prev = null;

        // Check if head needs to be removed
        if (head.data.getTaskId() == taskId) {
            // Find last node
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            
            if (head == head.next) {
                // Only one node
                head = null;
                current = null;
            } else {
                // Move head and update last node's next
                last.next = head.next;
                head = head.next;
                current = head;
            }
            return true;
        }

        // Search for the task in the rest of the list
        prev = head;
        temp = head.next;
        
        while (temp != head) {
            if (temp.data.getTaskId() == taskId) {
                prev.next = temp.next;
                if (current == temp) {
                    current = temp.next;
                }
                return true;
            }
            prev = temp;
            temp = temp.next;
        }

        return false;
    }

    /**
     * Get the current task.
     */
    public Task getCurrentTask() {
        return current != null ? current.data : null;
    }

    /**
     * Move to the next task in the circular list.
     */
    public Task moveToNextTask() {
        if (current != null) {
            current = current.next;
            return current.data;
        }
        return null;
    }

    /**
     * Display all tasks starting from head.
     */
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }

        Node temp = head;
        System.out.println("All Tasks:");
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    /**
     * Search tasks by priority.
     */
    public List<Task> searchByPriority(int priority) {
        List<Task> results = new ArrayList<>();
        
        if (head == null) {
            return results;
        }

        Node temp = head;
        do {
            if (temp.data.getPriority() == priority) {
                results.add(temp.data);
            }
            temp = temp.next;
        } while (temp != head);

        return results;
    }

    /**
     * Check if the list is empty.
     */
    public boolean isEmpty() {
        return head == null;
    }
}
