package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");
                
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            
            // Sort by frequency
            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
            sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
            
            System.out.println("\nTop 5 Most Frequent Words:");
            System.out.println("---------------------------");
            
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedList) {
                if (count >= 5) break;
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
            }
            
            System.out.println("\nTotal unique words: " + wordCount.size());
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}
