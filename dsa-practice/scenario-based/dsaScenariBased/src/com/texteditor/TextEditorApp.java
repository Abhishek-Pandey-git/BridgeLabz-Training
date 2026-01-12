package com.texteditor;

import java.util.Scanner;

public class TextEditorApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        
        System.out.println("=== Welcome to Shanaya's Text Editor ===\n");
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Characters");
            System.out.println("3. Format to Uppercase");
            System.out.println("4. Undo");
            System.out.println("5. Redo");
            System.out.println("6. View Document");
            System.out.println("7. Show Stack Status");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert: ");
                    String text = sc.nextLine();
                    editor.insertText(text);
                    editor.displayDocument();
                    break;
                    
                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int numChars = sc.nextInt();
                    sc.nextLine();
                    editor.deleteText(numChars);
                    editor.displayDocument();
                    break;
                    
                case 3:
                    editor.formatToUpperCase();
                    editor.displayDocument();
                    break;
                    
                case 4:
                    editor.undo();
                    editor.displayDocument();
                    break;
                    
                case 5:
                    editor.redo();
                    editor.displayDocument();
                    break;
                    
                case 6:
                    editor.displayDocument();
                    break;
                    
                case 7:
                    editor.showStackStatus();
                    break;
                    
                case 8:
                    System.out.println("Thank you for using the Text Editor!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
