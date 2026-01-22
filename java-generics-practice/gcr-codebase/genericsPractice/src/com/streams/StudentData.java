package com.streams;

import java.io.*;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Save Student Data");
        System.out.println("2. Retrieve Student Data");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            saveStudent(scanner);
        } else if (choice == 2) {
            retrieveStudent();
        }
        
        scanner.close();
    }
    
    // Save student data using DataOutputStream
    public static void saveStudent(Scanner scanner) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
            
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            
            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            
            System.out.println("Student data saved successfully!");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Retrieve student data using DataInputStream
    public static void retrieveStudent() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            
            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            
            System.out.println("\nStudent Details:");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
