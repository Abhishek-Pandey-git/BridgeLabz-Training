package com.linkedlist.doublylinkedlist;

import java.util.Scanner;

/**
 * Text Editor with Undo/Redo functionality.
 */
public class TextEditorSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo(10);
        boolean running = true;

        System.out.println("Text Editor with Undo/Redo (History size: 10)");
        System.out.println("Current text: \"" + editor.getCurrentState() + "\"");

        while (running) {
            printMenu();
            int choice = readInt("Choose: ");
            
            switch (choice) {
                case 1 -> {
                    String newText = readLine("Enter new text: ");
                    editor.addState(newText);
                    System.out.println("Text updated: \"" + editor.getCurrentState() + "\"");
                }
                case 2 -> {
                    String state = editor.undo();
                    System.out.println("Undo -> \"" + state + "\"");
                }
                case 3 -> {
                    String state = editor.redo();
                    System.out.println("Redo -> \"" + state + "\"");
                }
                case 4 -> {
                    System.out.println("Current text: \"" + editor.getCurrentState() + "\"");
                }
                case 5 -> {
                    editor.displayHistory();
                }
                case 6 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Text Editor ---");
        System.out.println("1. Type/Edit text  2. Undo  3. Redo");
        System.out.println("4. Display current  5. Show history  6. Exit");
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
