package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLargeFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
            String line;
            int lineCount = 0;
            
            System.out.println("\nLines containing 'error':");
            System.out.println("-------------------------");
            
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    lineCount++;
                    System.out.println(line);
                }
            }
            
            System.out.println("-------------------------");
            System.out.println("Total lines with 'error': " + lineCount);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}
