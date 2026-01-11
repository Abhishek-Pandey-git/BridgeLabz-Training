package com.bookshelf;

public class BookList {
    BookNode head;
    
    public BookList() {
        this.head = null;
    }
    
    public void addBook(Book book) {
        BookNode newNode = new BookNode(book);
        if (head == null) {
            head = newNode;
        } else {
            BookNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public boolean removeBook(String title) {
        if (head == null) {
            return false;
        }
        
        if (head.book.title.equals(title)) {
            head = head.next;
            return true;
        }
        
        BookNode temp = head;
        while (temp.next != null) {
            if (temp.next.book.title.equals(title)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public void displayBooks() {
        if (head == null) {
            System.out.println("  No books available");
            return;
        }
        BookNode temp = head;
        while (temp != null) {
            System.out.println("  - " + temp.book);
            temp = temp.next;
        }
    }
}
