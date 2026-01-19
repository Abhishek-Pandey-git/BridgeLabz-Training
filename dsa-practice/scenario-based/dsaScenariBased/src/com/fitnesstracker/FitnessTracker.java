package com.fitnesstracker;

import java.util.ArrayList;
import java.util.List;

/**
 * FitnessTracker system that manages user step counts and generates leaderboards
 * using Bubble Sort for real-time ranking updates
 */
public class FitnessTracker {
    private List<User> users;
    private int sortComparisons;
    private int sortSwaps;
    
    public FitnessTracker() {
        this.users = new ArrayList<>();
        this.sortComparisons = 0;
        this.sortSwaps = 0;
    }
    
    /**
     * Adds a user to the fitness tracker
     */
    public void addUser(User user) {
        users.add(user);
    }
    
    /**
     * Bubble Sort implementation to rank users by step count (descending order)
     * Ideal for small datasets with frequent updates
     * Time Complexity: O(n²) worst case, O(n) best case (already sorted)
     * Space Complexity: O(1)
     */
    public void sortUsersBySteps() {
        sortComparisons = 0;
        sortSwaps = 0;
        int n = users.size();
        boolean swapped;
        
        // Bubble Sort - descending order (highest steps first)
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                sortComparisons++;
                
                // Compare adjacent users' step counts
                if (users.get(j).getStepCount() < users.get(j + 1).getStepCount()) {
                    // Swap if current user has fewer steps than next user
                    User temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                    swapped = true;
                    sortSwaps++;
                }
            }
            
            // If no swaps occurred, array is already sorted (optimization)
            if (!swapped) {
                break;
            }
        }
    }
    
    /**
     * Displays the current leaderboard with rankings
     */
    public void displayLeaderboard() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("         DAILY STEP COUNT LEADERBOARD");
        System.out.println("=".repeat(50));
        
        if (users.isEmpty()) {
            System.out.println("No users tracked yet!");
            return;
        }
        
        // Sort before displaying
        sortUsersBySteps();
        
        System.out.println(String.format("%-6s %-15s %s", "Rank", "User", "Steps"));
        System.out.println("-".repeat(50));
        
        for (int i = 0; i < users.size(); i++) {
            String medal = "";
            if (i == 0) medal = "🥇";
            else if (i == 1) medal = "🥈";
            else if (i == 2) medal = "🥉";
            
            System.out.println(String.format("%-6s %s", 
                (i + 1) + " " + medal, 
                users.get(i).toString()));
        }
        
        System.out.println("=".repeat(50));
        System.out.println("Sort Statistics: " + sortComparisons + " comparisons, " 
            + sortSwaps + " swaps");
    }
    
    /**
     * Finds a user by name
     */
    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }
    
    /**
     * Simulates real-time step syncing from a device
     */
    public void syncUserSteps(String userName, int additionalSteps) {
        User user = findUser(userName);
        if (user != null) {
            user.syncSteps(additionalSteps);
            System.out.println("→ Leaderboard will be updated...\n");
        } else {
            System.out.println("User not found: " + userName);
        }
    }
    
    /**
     * Gets total number of users
     */
    public int getUserCount() {
        return users.size();
    }
    
    /**
     * Gets the current top performer
     */
    public User getTopPerformer() {
        if (users.isEmpty()) {
            return null;
        }
        sortUsersBySteps();
        return users.get(0);
    }
}
