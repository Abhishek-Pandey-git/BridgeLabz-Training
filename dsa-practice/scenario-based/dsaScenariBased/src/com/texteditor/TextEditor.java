package com.texteditor;

import java.util.Stack;

public class TextEditor {
    
    private StringBuilder document;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;
    
    public TextEditor() {
        document = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }
    
    // Insert text at current end
    public void insertText(String text) {
        int position = document.length();
        document.append(text);
        
        Action action = new Action("insert", text, position);
        undoStack.push(action);
        redoStack.clear(); // clear redo when new action is performed
        
        System.out.println("Inserted: " + text);
    }
    
    // Delete last n characters
    public void deleteText(int numChars) {
        if (document.length() < numChars) {
            System.out.println("Cannot delete! Only " + document.length() + " characters available.");
            return;
        }
        
        int position = document.length() - numChars;
        String deletedText = document.substring(position);
        document.delete(position, document.length());
        
        Action action = new Action("delete", deletedText, position);
        undoStack.push(action);
        redoStack.clear();
        
        System.out.println("Deleted: " + deletedText);
    }
    
    // Format (simple example - make uppercase)
    public void formatToUpperCase() {
        if (document.length() == 0) {
            System.out.println("Nothing to format!");
            return;
        }
        
        String original = document.toString();
        document = new StringBuilder(original.toUpperCase());
        
        Action action = new Action("format", original, 0);
        undoStack.push(action);
        redoStack.clear();
        
        System.out.println("Formatted to uppercase!");
    }
    
    // Undo last action
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
            return;
        }
        
        Action action = undoStack.pop();
        redoStack.push(action);
        
        if (action.type.equals("insert")) {
            // Reverse insert = delete
            int start = action.position;
            int end = start + action.content.length();
            document.delete(start, end);
            System.out.println("Undone insert of: " + action.content);
            
        } else if (action.type.equals("delete")) {
            // Reverse delete = insert back
            document.insert(action.position, action.content);
            System.out.println("Undone delete, restored: " + action.content);
            
        } else if (action.type.equals("format")) {
            // Restore original text
            document = new StringBuilder(action.content);
            System.out.println("Undone formatting!");
        }
    }
    
    // Redo last undone action
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo!");
            return;
        }
        
        Action action = redoStack.pop();
        undoStack.push(action);
        
        if (action.type.equals("insert")) {
            document.insert(action.position, action.content);
            System.out.println("Redone insert of: " + action.content);
            
        } else if (action.type.equals("delete")) {
            int start = action.position;
            int end = start + action.content.length();
            document.delete(start, end);
            System.out.println("Redone delete of: " + action.content);
            
        } else if (action.type.equals("format")) {
            document = new StringBuilder(document.toString().toUpperCase());
            System.out.println("Redone formatting!");
        }
    }
    
    // Display current document
    public void displayDocument() {
        System.out.println("\n--- Current Document ---");
        if (document.length() == 0) {
            System.out.println("[Empty Document]");
        } else {
            System.out.println(document.toString());
        }
        System.out.println("------------------------");
    }
    
    // Show stack status
    public void showStackStatus() {
        System.out.println("\nUndo Stack size: " + undoStack.size());
        System.out.println("Redo Stack size: " + redoStack.size());
    }
}
