package com.linkedlist.singlylinkedlist;

/**
 * Simple singly linked list management for student nodes.
 */
public class StudentLinkedList {
    private Node head;

    private static final class Node {
        private final StudentRecord data;
        private Node next;

        private Node(StudentRecord data) {
            this.data = data;
        }
    }

    public void addAtBeginning(StudentRecord record) {
        Node newNode = new Node(record);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(StudentRecord record) {
        Node newNode = new Node(record);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean insertAtPosition(StudentRecord record, int position) {
        if (position <= 0) {
            return false;
        }
        if (position == 1) {
            addAtBeginning(record);
            return true;
        }
        Node current = head;
        int index = 1;
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }
        if (current == null) {
            return false;
        }
        Node newNode = new Node(record);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    public boolean deleteByRollNumber(int rollNumber) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data.getRollNumber() == rollNumber) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public StudentRecord searchByRollNumber(int rollNumber) {
        Node current = head;
        while (current != null) {
            if (current.data.getRollNumber() == rollNumber) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public boolean updateGradeByRollNumber(int rollNumber, String newGrade) {
        StudentRecord found = searchByRollNumber(rollNumber);
        if (found == null) {
            return false;
        }
        found.setGrade(newGrade);
        return true;
    }

    public void displayRecords() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}