package com.feedbackguru;

public class Main {
    public static void main(String[] args) {
        FeedbackGuru<String> guru = new FeedbackGuru<>();
        
        String folderPath = "feedback";
        
        System.out.println("Reading feedback files...");
        guru.readFeedbackFiles(folderPath, "Service");
        
        guru.displaySummary();
        guru.displayByCategory("Positive");
    }
}
