package com.fitnesstracker;

/**
 * Main class to demonstrate the FitnessTracker system with Bubble Sort
 * Scenario: Small group fitness tracking with real-time step syncing
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("🏃 FITNESS TRACKER - Daily Step Count Ranking System 🏃");
        System.out.println();
        
        // Create fitness tracker instance
        FitnessTracker tracker = new FitnessTracker();
        
        // Add users with initial step counts
        System.out.println("📱 Initializing fitness tracker with users...\n");
        tracker.addUser(new User("Alice", 8500));
        tracker.addUser(new User("Bob", 12000));
        tracker.addUser(new User("Charlie", 6800));
        tracker.addUser(new User("Diana", 15200));
        tracker.addUser(new User("Eve", 9300));
        tracker.addUser(new User("Frank", 11500));
        tracker.addUser(new User("Grace", 7600));
        tracker.addUser(new User("Henry", 13400));
        tracker.addUser(new User("Ivy", 10200));
        tracker.addUser(new User("Jack", 8900));
        
        System.out.println("✓ Added " + tracker.getUserCount() + " users to the tracker\n");
        
        // Display initial leaderboard
        System.out.println("--- Initial Leaderboard (End of Day) ---");
        tracker.displayLeaderboard();
        
        // Simulate real-time step syncing (last-minute updates)
        System.out.println("\n\n⚡ REAL-TIME STEP SYNCING ⚡");
        System.out.println("-".repeat(50));
        
        // Bob syncs additional steps from his smartwatch
        tracker.syncUserSteps("Bob", 4500);
        tracker.displayLeaderboard();
        
        // Charlie goes for an evening walk
        System.out.println("\n");
        tracker.syncUserSteps("Charlie", 8200);
        tracker.displayLeaderboard();
        
        // Grace syncs steps from afternoon workout
        System.out.println("\n");
        tracker.syncUserSteps("Grace", 3400);
        tracker.displayLeaderboard();
        
        // Alice syncs final steps before midnight
        System.out.println("\n");
        tracker.syncUserSteps("Alice", 2100);
        tracker.displayLeaderboard();
        
        // Display final statistics
        System.out.println("\n\n📊 DAILY SUMMARY 📊");
        System.out.println("-".repeat(50));
        User topPerformer = tracker.getTopPerformer();
        if (topPerformer != null) {
            System.out.println("🏆 Top Performer: " + topPerformer.getName() 
                + " with " + String.format("%,d", topPerformer.getStepCount()) + " steps!");
        }
        System.out.println("Total Active Users: " + tracker.getUserCount());
        System.out.println("\n✨ Why Bubble Sort?");
        System.out.println("   • Small group size (< 20 users) - O(n²) is acceptable");
        System.out.println("   • Frequent updates - simple to implement and understand");
        System.out.println("   • Nearly sorted data - Bubble Sort performs well (O(n) best case)");
        System.out.println("   • Real-time display - quick re-sorting after each sync");
        
        // Demonstrate efficiency with nearly sorted data
        System.out.println("\n\n🔄 TESTING EFFICIENCY WITH NEARLY SORTED DATA 🔄");
        System.out.println("-".repeat(50));
        System.out.println("When data is already sorted or nearly sorted,");
        System.out.println("Bubble Sort is very efficient due to early termination.\n");
        
        // Data is already sorted, let's add a small update
        tracker.syncUserSteps("Eve", 100);
        tracker.displayLeaderboard();
    }
}
