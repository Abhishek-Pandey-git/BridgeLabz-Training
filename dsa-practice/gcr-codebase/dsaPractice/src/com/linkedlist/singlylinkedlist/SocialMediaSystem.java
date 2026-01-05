package com.linkedlist.singlylinkedlist;

import java.util.List;
import java.util.Scanner;

/**
 * Social Media Friend Connections System.
 */
public class SocialMediaSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SocialMediaNetwork network = new SocialMediaNetwork();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose: ");
            
            switch (choice) {
                case 1 -> {
                    int id = readInt("User ID: ");
                    String name = readLine("Name: ");
                    int age = readInt("Age: ");
                    network.addUser(new User(id, name, age));
                    System.out.println("User added.");
                }
                case 2 -> {
                    int id1 = readInt("User 1 ID: ");
                    int id2 = readInt("User 2 ID: ");
                    System.out.println(network.addFriendConnection(id1, id2) ? "Connection added." : "Failed.");
                }
                case 3 -> {
                    int id1 = readInt("User 1 ID: ");
                    int id2 = readInt("User 2 ID: ");
                    System.out.println(network.removeFriendConnection(id1, id2) ? "Connection removed." : "Failed.");
                }
                case 4 -> {
                    int id1 = readInt("User 1 ID: ");
                    int id2 = readInt("User 2 ID: ");
                    List<Integer> mutual = network.findMutualFriends(id1, id2);
                    System.out.println("Mutual friends: " + mutual);
                }
                case 5 -> {
                    int id = readInt("User ID: ");
                    network.displayFriends(id);
                }
                case 6 -> {
                    int id = readInt("User ID: ");
                    User user = network.findUserById(id);
                    System.out.println(user != null ? user : "Not found.");
                }
                case 7 -> {
                    String name = readLine("Name: ");
                    User user = network.findUserByName(name);
                    System.out.println(user != null ? user : "Not found.");
                }
                case 8 -> network.displayAllUsers();
                case 9 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Social Media Network ---");
        System.out.println("1. Add user  2. Add friend connection  3. Remove connection");
        System.out.println("4. Find mutual friends  5. Display user's friends  6. Search by ID");
        System.out.println("7. Search by name  8. Display all users  9. Exit");
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
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
