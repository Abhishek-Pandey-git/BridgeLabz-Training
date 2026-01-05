package com.linkedlist.doublylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Doubly linked list for library management system.
 */
public class LibraryDoublyLinkedList {
    private Node head;
    private Node tail;

    private static class Node {
        private final Book data;
        private Node next;
        private Node prev;

        private Node(Book data) {
            this.data = data;
        }
    }

    public void addAtBeginning(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtEnd(Book book) {
        Node newNode = new Node(book);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public boolean insertAtPosition(Book book, int position) {
        if (position <= 0) return false;
        if (position == 1) {
            addAtBeginning(book);
            return true;
        }
        Node current = head;
        int index = 1;
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }
        if (current == null) return false;
        Node newNode = new Node(book);
        if (current.next == null) {
            addAtEnd(book);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        return true;
    }

    public boolean removeByBookId(int bookId) {
        Node current = head;
        while (current != null) {
            if (current.data.getBookId() == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        Node current = head;
        while (current != null) {
            if (current.data.getBookTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(current.data);
            }
            current = current.next;
        }
        return results;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        Node current = head;
        while (current != null) {
            if (current.data.getAuthor().equalsIgnoreCase(author)) {
                results.add(current.data);
            }
            current = current.next;
        }
        return results;
    }

    public boolean updateAvailabilityById(int bookId, boolean isAvailable) {
        Node current = head;
        while (current != null) {
            if (current.data.getBookId() == bookId) {
                current.data.setAvailable(isAvailable);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Node current = head;
        System.out.println("Books (Forward):");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        Node current = tail;
        System.out.println("Books (Reverse):");
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
