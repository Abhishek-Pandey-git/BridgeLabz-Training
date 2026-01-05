package com.linkedlist.doublylinkedlist;

import java.util.List;
import java.util.Scanner;

/**
 * Library Management System using Doubly Linked List.
 */
public class LibraryManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose: ");
            
            switch (choice) {
                case 1 -> {
                    library.addAtBeginning(promptForBook());
                    System.out.println("Book added at beginning.");
                }
                case 2 -> {
                    library.addAtEnd(promptForBook());
                    System.out.println("Book added at end.");
                }
                case 3 -> {
                    Book book = promptForBook();
                    int pos = readInt("Position: ");
                    System.out.println(library.insertAtPosition(book, pos) ? "Inserted." : "Invalid position.");
                }
                case 4 -> {
                    int id = readInt("Book ID to remove: ");
                    System.out.println(library.removeByBookId(id) ? "Removed." : "Not found.");
                }
                case 5 -> {
                    String title = readLine("Book title: ");
                    List<Book> results = library.searchByTitle(title);
                    if (results.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        results.forEach(System.out::println);
                    }
                }
                case 6 -> {
                    String author = readLine("Author: ");
                    List<Book> results = library.searchByAuthor(author);
                    if (results.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        results.forEach(System.out::println);
                    }
                }
                case 7 -> {
                    int id = readInt("Book ID: ");
                    boolean avail = readLine("Available (yes/no): ").equalsIgnoreCase("yes");
                    System.out.println(library.updateAvailabilityById(id, avail) ? "Updated." : "Not found.");
                }
                case 8 -> library.displayForward();
                case 9 -> library.displayReverse();
                case 10 -> System.out.println("Total books: " + library.countBooks());
                case 11 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Library Management ---");
        System.out.println("1. Add at beginning  2. Add at end  3. Insert at position");
        System.out.println("4. Remove by ID  5. Search by title  6. Search by author");
        System.out.println("7. Update availability  8. Display forward  9. Display reverse");
        System.out.println("10. Count books  11. Exit");
    }

    private static Book promptForBook() {
        String title = readLine("Title: ");
        String author = readLine("Author: ");
        String genre = readLine("Genre: ");
        int id = readInt("Book ID: ");
        boolean avail = readLine("Available (yes/no): ").equalsIgnoreCase("yes");
        return new Book(title, author, genre, id, avail);
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
        return scanner.nextLine().trim();
    }
}
