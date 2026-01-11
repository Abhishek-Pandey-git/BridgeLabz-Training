package com.bookshelf;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Adding books
        library.addBook("Fiction", "Harry Potter", "J.K. Rowling");
        library.addBook("Fiction", "Lord of Rings", "J.R.R. Tolkien");
        library.addBook("Science", "Brief History of Time", "Stephen Hawking");
        library.addBook("Science", "Cosmos", "Carl Sagan");
        library.addBook("Mystery", "Sherlock Holmes", "Arthur Conan Doyle");
        
        // Display catalog
        library.displayCatalog();
        
        // Borrow a book
        System.out.println("\n--- Borrowing Books ---");
        library.borrowBook("Fiction", "Harry Potter");
        
        // Display after borrowing
        library.displayCatalog();
        
        // Return a book
        System.out.println("\n--- Returning Books ---");
        library.returnBook("Fiction", "Harry Potter", "J.K. Rowling");
        
        // Display after returning
        library.displayCatalog();
        
        // Try to borrow non-existent book
        System.out.println("\n--- Testing Error Cases ---");
        library.borrowBook("Fiction", "Random Book");
    }
}
