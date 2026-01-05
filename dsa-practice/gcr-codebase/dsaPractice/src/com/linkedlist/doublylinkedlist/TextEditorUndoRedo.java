package com.linkedlist.doublylinkedlist;

/**
 * Undo/Redo functionality for text editor using doubly linked list.
 */
public class TextEditorUndoRedo {
    private Node current;
    private final int maxHistorySize;
    private int historyCount;

    private static class Node {
        String textState;
        Node next;
        Node prev;
        Node(String textState) { this.textState = textState; }
    }

    public TextEditorUndoRedo(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.historyCount = 0;
        // Initialize with empty state
        current = new Node("");
        historyCount = 1;
    }

    /**
     * Add a new text state (after typing or editing).
     */
    public void addState(String newState) {
        Node newNode = new Node(newState);
        
        // Remove any redo history
        current.next = null;
        
        // Add new state
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        historyCount++;
        
        // Remove oldest states if exceeding max size
        while (historyCount > maxHistorySize) {
            removeOldest();
        }
    }

    private void removeOldest() {
        if (historyCount <= 1) return;
        
        Node temp = current;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        
        if (temp.next != null) {
            temp.next.prev = null;
        }
        
        historyCount--;
    }

    /**
     * Undo to previous state.
     */
    public String undo() {
        if (current.prev == null) {
            System.out.println("Nothing to undo.");
            return current.textState;
        }
        current = current.prev;
        return current.textState;
    }

    /**
     * Redo to next state.
     */
    public String redo() {
        if (current.next == null) {
            System.out.println("Nothing to redo.");
            return current.textState;
        }
        current = current.next;
        return current.textState;
    }

    /**
     * Get current text state.
     */
    public String getCurrentState() {
        return current.textState;
    }

    /**
     * Display history.
     */
    public void displayHistory() {
        Node temp = current;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        
        System.out.println("History (max " + maxHistorySize + " states):");
        int index = 1;
        while (temp != null) {
            String marker = (temp == current) ? " <- CURRENT" : "";
            System.out.println(index + ". \"" + temp.textState + "\"" + marker);
            temp = temp.next;
            index++;
        }
    }

    public boolean canUndo() {
        return current.prev != null;
    }

    public boolean canRedo() {
        return current.next != null;
    }
}
