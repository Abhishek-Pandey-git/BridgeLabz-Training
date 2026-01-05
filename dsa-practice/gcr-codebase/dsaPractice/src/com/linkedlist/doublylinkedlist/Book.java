package com.linkedlist.doublylinkedlist;

/**
 * Represents a library book with title, author, genre, ID, and availability.
 */
public class Book {
    private final String bookTitle;
    private final String author;
    private final String genre;
    private final int bookId;
    private boolean isAvailable;

    public Book(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ID: " + bookId + ", Title: " + bookTitle + ", Author: " + author 
                + ", Genre: " + genre + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
