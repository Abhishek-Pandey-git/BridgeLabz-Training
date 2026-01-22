package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter source file path: ");
        String sourceFile = scanner.nextLine();
        
        System.out.print("Enter destination file path: ");
        String destFile = scanner.nextLine();
        
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);
            
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            
            System.out.println("File copied successfully!");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
