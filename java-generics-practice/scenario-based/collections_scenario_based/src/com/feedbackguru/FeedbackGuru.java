package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru<T> {
    private Map<String, List<Feedback<T>>> categoryMap;

    public FeedbackGuru() {
        categoryMap = new HashMap<>();
        categoryMap.put("Positive", new ArrayList<>());
        categoryMap.put("Neutral", new ArrayList<>());
        categoryMap.put("Negative", new ArrayList<>());
    }

    public void readFeedbackFiles(String folderPath, T type) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("No files found");
            return;
        }

        for (File file : files) {
            if (file.getName().endsWith(".txt")) {
                try {
                    processFeedbackFile(file, type);
                } catch (Exception e) {
                    System.out.println("Error reading: " + file.getName());
                }
            }
        }
    }

    private void processFeedbackFile(File file, T type) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            try {
                if (line.trim().isEmpty()) {
                    continue;
                }

                int rating = extractRating(line);
                String category = categorize(rating);

                Feedback<T> feedback = new Feedback<>(type, line, rating);
                categoryMap.get(category).add(feedback);
            } catch (Exception e) {
                System.out.println("Skipping invalid line");
            }
        }

        reader.close();
    }

    private int extractRating(String text) {
        Pattern pattern = Pattern.compile("(\\d+)/10");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }

        throw new IllegalArgumentException("No rating found");
    }

    private String categorize(int rating) {
        if (rating >= 7) {
            return "Positive";
        } else if (rating >= 4) {
            return "Neutral";
        } else {
            return "Negative";
        }
    }

    public void displaySummary() {
        System.out.println("\n--- Feedback Summary ---");
        for (String category : categoryMap.keySet()) {
            List<Feedback<T>> feedbacks = categoryMap.get(category);
            System.out.println(category + ": " + feedbacks.size() + " feedbacks");
        }
    }

    public void displayByCategory(String category) {
        System.out.println("\n--- " + category + " Feedbacks ---");
        List<Feedback<T>> feedbacks = categoryMap.get(category);
        for (Feedback<T> feedback : feedbacks) {
            System.out.println(feedback);
        }
    }
}
