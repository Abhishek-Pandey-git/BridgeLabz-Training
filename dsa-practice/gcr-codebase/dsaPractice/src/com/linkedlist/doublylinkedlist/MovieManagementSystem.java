package com.linkedlist.doublylinkedlist;

import java.util.List;
import java.util.Scanner;

/**
 * Movie Management System using Doubly Linked List.
 * Provides menu-driven interface for managing movies.
 */
public class MovieManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MovieDoublyLinkedList movieList = new MovieDoublyLinkedList();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose an operation: ");
            
            switch (choice) {
                case 1 -> {
                    movieList.addAtBeginning(promptForMovie());
                    System.out.println("Movie added at the beginning.");
                }
                case 2 -> {
                    movieList.addAtEnd(promptForMovie());
                    System.out.println("Movie added at the end.");
                }
                case 3 -> {
                    Movie movie = promptForMovie();
                    int position = readInt("Position (starting from 1): ");
                    if (movieList.insertAtPosition(movie, position)) {
                        System.out.println("Movie inserted at position " + position + ".");
                    } else {
                        System.out.println("Invalid position.");
                    }
                }
                case 4 -> {
                    String title = readLine("Movie title to remove: ");
                    if (movieList.removeByTitle(title)) {
                        System.out.println("Movie removed successfully.");
                    } else {
                        System.out.println("Movie not found.");
                    }
                }
                case 5 -> {
                    String director = readLine("Director name: ");
                    List<Movie> results = movieList.searchByDirector(director);
                    if (results.isEmpty()) {
                        System.out.println("No movies found for director: " + director);
                    } else {
                        System.out.println("Movies by " + director + ":");
                        results.forEach(System.out::println);
                    }
                }
                case 6 -> {
                    double rating = readDouble("Rating to search: ");
                    List<Movie> results = movieList.searchByRating(rating);
                    if (results.isEmpty()) {
                        System.out.println("No movies found with rating: " + rating);
                    } else {
                        System.out.println("Movies with rating " + rating + ":");
                        results.forEach(System.out::println);
                    }
                }
                case 7 -> {
                    String title = readLine("Movie title: ");
                    double newRating = readDouble("New rating: ");
                    if (movieList.updateRatingByTitle(title, newRating)) {
                        System.out.println("Rating updated successfully.");
                    } else {
                        System.out.println("Movie not found.");
                    }
                }
                case 8 -> {
                    movieList.displayForward();
                }
                case 9 -> {
                    movieList.displayReverse();
                }
                case 10 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
        
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Movie Management System ---");
        System.out.println("1. Add movie at beginning");
        System.out.println("2. Add movie at end");
        System.out.println("3. Insert movie at position");
        System.out.println("4. Remove movie by title");
        System.out.println("5. Search by director");
        System.out.println("6. Search by rating");
        System.out.println("7. Update movie rating");
        System.out.println("8. Display all movies (forward)");
        System.out.println("9. Display all movies (reverse)");
        System.out.println("10. Exit");
    }

    private static Movie promptForMovie() {
        String title = readLine("Movie title: ");
        String director = readLine("Director: ");
        int year = readInt("Year of release: ");
        double rating = readDouble("Rating: ");
        return new Movie(title, director, year, rating);
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input.trim());
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
