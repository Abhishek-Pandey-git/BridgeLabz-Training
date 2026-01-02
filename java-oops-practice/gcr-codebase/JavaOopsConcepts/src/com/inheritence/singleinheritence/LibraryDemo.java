package com.inheritence.singleinheritence;

import java.util.Scanner;

// Small demo to create an Author (subclass) and display book+author info
public class LibraryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        System.out.println("Enter publication year:");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter author name:");
        String name = scanner.nextLine();

        System.out.println("Enter a short author bio:");
        String bio = scanner.nextLine();

        Author author = new Author(title, year, name, bio);
        System.out.println("\n--- Book and Author Info ---");
        author.displayInfo();

        scanner.close();
    }
}
