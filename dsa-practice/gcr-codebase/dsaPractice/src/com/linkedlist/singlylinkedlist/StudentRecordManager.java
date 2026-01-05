package com.linkedlist.singlylinkedlist;

import java.util.Scanner;

/**
 * Console driver that demonstrates linked list operations on student data.
 */
public class StudentRecordManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentLinkedList registry = new StudentLinkedList();
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose an operation: ");
            switch (choice) {
                case 1 -> {
                    registry.addAtBeginning(promptForRecord());
                    System.out.println("Student added at the beginning.");
                }
                case 2 -> {
                    registry.addAtEnd(promptForRecord());
                    System.out.println("Student added at the end.");
                }
                case 3 -> {
                    StudentRecord target = promptForRecord();
                    int position = readInt("Position (starting from 1): ");
                    if (registry.insertAtPosition(target, position)) {
                        System.out.println("Student inserted at position " + position + ".");
                    } else {
                        System.out.println("Position " + position + " is invalid.");
                    }
                }
                case 4 -> {
                    int roll = readInt("Roll number to delete: ");
                    if (registry.deleteByRollNumber(roll)) {
                        System.out.println("Record deleted for roll " + roll + ".");
                    } else {
                        System.out.println("No record found for roll " + roll + ".");
                    }
                }
                case 5 -> {
                    int roll = readInt("Roll number to search: ");
                    StudentRecord found = registry.searchByRollNumber(roll);
                    if (found == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Found: " + found);
                    }
                }
                case 6 -> {
                    System.out.println("-- Student Records --");
                    registry.displayRecords();
                }
                case 7 -> {
                    int roll = readInt("Roll number to update grade: ");
                    String grade = readLine("New grade: ");
                    if (registry.updateGradeByRollNumber(roll, grade)) {
                        System.out.println("Grade updated for roll " + roll + ".");
                    } else {
                        System.out.println("Unable to update grade for roll " + roll + ".");
                    }
                }
                case 8 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("1. Add student at beginning");
        System.out.println("2. Add student at end");
        System.out.println("3. Insert student at position");
        System.out.println("4. Delete student by roll number");
        System.out.println("5. Search student by roll number");
        System.out.println("6. Display all students");
        System.out.println("7. Update student grade");
        System.out.println("8. Exit");
    }

    private static StudentRecord promptForRecord() {
        int roll = readInt("Roll number: ");
        String name = readLine("Name: ");
        int age = readInt("Age: ");
        String grade = readLine("Grade: ");
        return new StudentRecord(roll, name, age, grade);
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}