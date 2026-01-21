package com.collections.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Voting system demonstrating HashMap, TreeMap, and LinkedHashMap
public class VotingSystem {
    
    private HashMap<String, Integer> voteCount;           // Fast lookup
    private LinkedHashMap<String, Integer> voteOrder;     // Maintains insertion order
    private TreeMap<String, Integer> sortedResults;       // Alphabetically sorted
    
    public VotingSystem() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
        sortedResults = new TreeMap<>();
    }
    
    // Cast a vote for a candidate
    public void castVote(String candidate) {
        // Update HashMap
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        
        // Update LinkedHashMap (maintains order of first appearance)
        if (!voteOrder.containsKey(candidate)) {
            voteOrder.put(candidate, 0);
        }
        voteOrder.put(candidate, voteOrder.get(candidate) + 1);
        
        // Update TreeMap
        sortedResults.put(candidate, sortedResults.getOrDefault(candidate, 0) + 1);
        
        System.out.println("Vote cast for: " + candidate);
    }
    
    // Display results using HashMap (unordered)
    public void displayHashMapResults() {
        System.out.println("\n=== Results (HashMap - No specific order) ===");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
    
    // Display results using LinkedHashMap (insertion order)
    public void displayLinkedHashMapResults() {
        System.out.println("\n=== Results (LinkedHashMap - Insertion order) ===");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
    
    // Display results using TreeMap (sorted alphabetically)
    public void displayTreeMapResults() {
        System.out.println("\n=== Results (TreeMap - Sorted alphabetically) ===");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
    
    // Display winner
    public void displayWinner() {
        if (voteCount.isEmpty()) {
            System.out.println("No votes cast yet!");
            return;
        }
        
        String winner = null;
        int maxVotes = 0;
        
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        
        System.out.println("\n=== Winner ===");
        System.out.println(winner + " with " + maxVotes + " votes!");
    }
    
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Voting System Menu ===");
            System.out.println("1. Cast Vote");
            System.out.println("2. Display Results (HashMap)");
            System.out.println("3. Display Results (LinkedHashMap)");
            System.out.println("4. Display Results (TreeMap)");
            System.out.println("5. Display All Results");
            System.out.println("6. Display Winner");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter candidate name: ");
                    String candidate = sc.nextLine();
                    votingSystem.castVote(candidate);
                    break;
                    
                case 2:
                    votingSystem.displayHashMapResults();
                    break;
                    
                case 3:
                    votingSystem.displayLinkedHashMapResults();
                    break;
                    
                case 4:
                    votingSystem.displayTreeMapResults();
                    break;
                    
                case 5:
                    votingSystem.displayHashMapResults();
                    votingSystem.displayLinkedHashMapResults();
                    votingSystem.displayTreeMapResults();
                    break;
                    
                case 6:
                    votingSystem.displayWinner();
                    break;
                    
                case 7:
                    System.out.println("Exiting voting system...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
