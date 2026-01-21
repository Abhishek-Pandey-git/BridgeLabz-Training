package com.movietime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Theater showtime manager using Insertion Sort
public class MovieTime {
    private List<Show> shows;
    
    public MovieTime() {
        shows = new ArrayList<>();
    }
    
    // Add show using insertion sort
    public void addShow(Show newShow) {
        shows.add(newShow);
        
        // Insertion sort logic - insert new show at correct position
        int i = shows.size() - 1;
        while (i > 0 && shows.get(i - 1).getTimeInMinutes() > newShow.getTimeInMinutes()) {
            shows.set(i, shows.get(i - 1));
            i--;
        }
        shows.set(i, newShow);
        
        System.out.println("Show added and sorted!");
    }
    
    // Display all shows
    public void displayShows() {
        if (shows.isEmpty()) {
            System.out.println("No shows scheduled.");
            return;
        }
        
        System.out.println("\n=== Today's Shows (Sorted by Time) ===");
        for (Show show : shows) {
            System.out.println(show);
        }
    }
    
    public static void main(String[] args) {
        MovieTime theater = new MovieTime();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== MovieTime Theater ===");
            System.out.println("1. Add Show");
            System.out.println("2. Display All Shows");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String movie = sc.nextLine();
                    System.out.print("Enter showtime (HH:MM): ");
                    String time = sc.nextLine();
                    theater.addShow(new Show(movie, time));
                    break;
                    
                case 2:
                    theater.displayShows();
                    break;
                    
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
