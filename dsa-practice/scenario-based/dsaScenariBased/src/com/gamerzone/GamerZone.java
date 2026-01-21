package com.gamerzone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Gaming leaderboard using Quick Sort
public class GamerZone {
    
    // Partition method for quick sort
    private int partition(List<Player> players, int low, int high) {
        int pivot = players.get(high).getScore();
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            // Sort in descending order (highest score first)
            if (players.get(j).getScore() > pivot) {
                i++;
                // Swap
                Player temp = players.get(i);
                players.set(i, players.get(j));
                players.set(j, temp);
            }
        }
        
        // Swap pivot to correct position
        Player temp = players.get(i + 1);
        players.set(i + 1, players.get(high));
        players.set(high, temp);
        
        return i + 1;
    }
    
    // Quick sort implementation
    public void quickSort(List<Player> players, int low, int high) {
        if (low < high) {
            int pi = partition(players, low, high);
            
            quickSort(players, low, pi - 1);
            quickSort(players, pi + 1, high);
        }
    }
    
    // Display leaderboard
    public void displayLeaderboard(List<Player> players) {
        System.out.println("\n=== Leaderboard (Ranked) ===");
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Rank " + (i + 1) + ": " + players.get(i));
        }
    }
    
    public static void main(String[] args) {
        GamerZone game = new GamerZone();
        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        
        while (true) {
            System.out.println("\n=== GamerZone Leaderboard ===");
            System.out.println("1. Add Player Score");
            System.out.println("2. Display Leaderboard");
            System.out.println("3. Sort and Rank Players");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter score: ");
                    int score = sc.nextInt();
                    sc.nextLine();
                    players.add(new Player(username, score));
                    System.out.println("Player added!");
                    break;
                    
                case 2:
                    if (players.isEmpty()) {
                        System.out.println("No players yet!");
                    } else {
                        for (Player p : players) {
                            System.out.println(p);
                        }
                    }
                    break;
                    
                case 3:
                    if (players.isEmpty()) {
                        System.out.println("No players to rank!");
                    } else {
                        game.quickSort(players, 0, players.size() - 1);
                        game.displayLeaderboard(players);
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
