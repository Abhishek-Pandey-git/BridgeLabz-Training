package com.universityrecord;

import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            printMenu();

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    addStudentUI();
                    break;

                case 2:
                    deleteStudentUI();
                    break;

                case 3:
                    displayStudentsUI();
                    break;

                case 0:
                    System.out.println("\nExiting system. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            pause();
        }
    }

    // ---------------- UI METHODS ----------------

    private static void addStudentUI() {
        System.out.print("Enter Roll Number: ");
        int roll = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        RecordManager.addStudent(roll, name);
        System.out.println("Student added successfully.");
    }

    private static void deleteStudentUI() {
        System.out.print("Enter Roll Number to delete: ");
        int roll = input.nextInt();

        RecordManager.deleteStudent(roll);
    }

    private static void displayStudentsUI() {
        System.out.println("\n========== STUDENT RECORDS ==========");
        RecordManager.showStudent();
        System.out.println("====================================");
    }

    // ---------------- HELPER METHODS ----------------

    private static void printMenu() {
        System.out.println();
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║        UNIVERSITY RECORD SYSTEM    ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Add Student                     ║");
        System.out.println("║ 2. Delete Student                  ║");
        System.out.println("║ 3. Display All Students            ║");
        System.out.println("║ 0. Exit                            ║");
        System.out.println("╚════════════════════════════════════╝");
    }

    private static void pause() {
        System.out.println("\nPress ENTER to continue...");
        input.nextLine();
    }
}
