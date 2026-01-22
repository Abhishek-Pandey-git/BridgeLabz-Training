package com.streams;

import java.io.*;
import java.util.Scanner;

public class ImageToByteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter source image path: ");
        String sourceImage = scanner.nextLine();
        
        System.out.print("Enter destination image path: ");
        String destImage = scanner.nextLine();
        
        try {
            // Read image into byte array
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            
            byte[] imageBytes = baos.toByteArray();
            fis.close();
            baos.close();
            
            System.out.println("Image converted to byte array. Size: " + imageBytes.length + " bytes");
            
            // Write byte array back to image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destImage);
            
            int data;
            while ((data = bais.read()) != -1) {
                fos.write(data);
            }
            
            bais.close();
            fos.close();
            
            System.out.println("Image saved successfully to " + destImage);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}
