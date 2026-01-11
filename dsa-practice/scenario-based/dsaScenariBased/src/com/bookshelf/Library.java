package com.bookshelf;

import java.util.HashMap;

public class Library {
    HashMap<String, BookList> catalog;
    
    public Library() {
        catalog = new HashMap<>();
    }
    
    public void addBook(String genre, String title, String author) {
        Book book = new Book(title, author);
        
        if (!catalog.containsKey(genre)) {
            catalog.put(genre, new BookList());
        }
        
        catalog.get(genre).addBook(book);
        System.out.println("Added: " + book + " to " + genre);
    }
    
    public void borrowBook(String genre, String title) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found!");
            return;
        }
        
        BookList list = catalog.get(genre);
        if (list.removeBook(title)) {
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not found!");
        }
    }
    
    public void returnBook(String genre, String title, String author) {
        addBook(genre, title, author);
        System.out.println("Book returned: " + title);
    }
    
    public void displayCatalog() {
        System.out.println("\n=== Library Catalog ===");
        for (String genre : catalog.keySet()) {
            System.out.println("\n" + genre + ":");
            catalog.get(genre).displayBooks();
        }
    }
}
