package com.objectmodelling.assistedproblems;

public class LibraryAggregationDemo {
    public static void main(String[] args) {
        // Create books independently (aggregation)
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Create libraries
        Library cityLibrary = new Library("City Library");
        Library universityLibrary = new Library("University Library");

        // Add books to libraries
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);
        universityLibrary.addBook(b2); // same book object reused in another library
        universityLibrary.addBook(b3);

        // Show contents
        cityLibrary.showBooks();
        System.out.println();
        universityLibrary.showBooks();

        // Demonstrate book exists independently of libraries
        System.out.println("\nA book exists outside libraries: " + b1);
    }
}
