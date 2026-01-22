package com.streams;

import java.io.*;
import java.util.Scanner;

public class UpperToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter source file path: ");
        String sourceFile = scanner.nextLine();
        
        System.out.print("Enter destination file path: ");
        String destFile = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            
            System.out.println("File converted to lowercase successfully!");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}
