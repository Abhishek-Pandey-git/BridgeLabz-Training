package com.linkedlist.doublylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Doubly linked list implementation for movie management.
 * Each node has both next and previous pointers.
 */
public class MovieDoublyLinkedList {
    private Node head;
    private Node tail;

    // Inner Node class with both next and prev pointers
    private static class Node {
        private final Movie data;
        private Node next;
        private Node prev;

        private Node(Movie data) {
            this.data = data;
        }
    }

    /**
     * Add a movie at the beginning of the list.
     */
    public void addAtBeginning(Movie movie) {
        Node newNode = new Node(movie);
        if (head == null) {
            // Empty list - set both head and tail
            head = tail = newNode;
        } else {
            // Link new node before current head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     * Add a movie at the end of the list.
     */
    public void addAtEnd(Movie movie) {
        Node newNode = new Node(movie);
        if (tail == null) {
            // Empty list - set both head and tail
            head = tail = newNode;
        } else {
            // Link new node after current tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    /**
     * Insert a movie at a specific position (1-indexed).
     * Returns true if successful, false if position is invalid.
     */
    public boolean insertAtPosition(Movie movie, int position) {
        if (position <= 0) {
            return false;
        }
        if (position == 1) {
            addAtBeginning(movie);
            return true;
        }

        Node current = head;
        int index = 1;
        
        // Traverse to the position
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            return false;
        }

        Node newNode = new Node(movie);
        
        // Insert at the end if current is the tail
        if (current.next == null) {
            addAtEnd(movie);
        } else {
            // Insert in the middle
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        
        return true;
    }

    /**
     * Remove a movie by title.
     * Returns true if found and removed, false otherwise.
     */
    public boolean removeByTitle(String title) {
        Node current = head;
        
        while (current != null) {
            if (current.data.getTitle().equalsIgnoreCase(title)) {
                // Update prev node's next pointer
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    // Removing head
                    head = current.next;
                }
                
                // Update next node's prev pointer
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    // Removing tail
                    tail = current.prev;
                }
                
                return true;
            }
            current = current.next;
        }
        
        return false;
    }

    /**
     * Search movies by director name.
     * Returns list of all matching movies.
     */
    public List<Movie> searchByDirector(String director) {
        List<Movie> results = new ArrayList<>();
        Node current = head;
        
        while (current != null) {
            if (current.data.getDirector().equalsIgnoreCase(director)) {
                results.add(current.data);
            }
            current = current.next;
        }
        
        return results;
    }

    /**
     * Search movies by rating.
     * Returns list of all movies with the given rating.
     */
    public List<Movie> searchByRating(double rating) {
        List<Movie> results = new ArrayList<>();
        Node current = head;
        
        while (current != null) {
            if (Math.abs(current.data.getRating() - rating) < 0.01) {
                results.add(current.data);
            }
            current = current.next;
        }
        
        return results;
    }

    /**
     * Update a movie's rating by title.
     * Returns true if found and updated, false otherwise.
     */
    public boolean updateRatingByTitle(String title, double newRating) {
        Node current = head;
        
        while (current != null) {
            if (current.data.getTitle().equalsIgnoreCase(title)) {
                current.data.setRating(newRating);
                return true;
            }
            current = current.next;
        }
        
        return false;
    }

    /**
     * Display all movies in forward order (head to tail).
     */
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }
        
        Node current = head;
        System.out.println("Movies (Forward Order):");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /**
     * Display all movies in reverse order (tail to head).
     */
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list.");
            return;
        }
        
        Node current = tail;
        System.out.println("Movies (Reverse Order):");
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    /**
     * Check if the list is empty.
     */
    public boolean isEmpty() {
        return head == null;
    }
}
