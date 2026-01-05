package com.linkedlist.circularlinkedlist;

import java.util.List;
import java.util.Scanner;

/**
 * Task Scheduler using Circular Linked List.
 * Provides menu-driven interface for task management.
 */
public class TaskScheduler {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TaskCircularLinkedList taskList = new TaskCircularLinkedList();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose an operation: ");
            
            switch (choice) {
                case 1 -> {
                    taskList.addAtBeginning(promptForTask());
                    System.out.println("Task added at the beginning.");
                }
                case 2 -> {
                    taskList.addAtEnd(promptForTask());
                    System.out.println("Task added at the end.");
                }
                case 3 -> {
                    Task task = promptForTask();
                    int position = readInt("Position (starting from 1): ");
                    if (taskList.insertAtPosition(task, position)) {
                        System.out.println("Task inserted at position " + position + ".");
                    } else {
                        System.out.println("Invalid position.");
                    }
                }
                case 4 -> {
                    int taskId = readInt("Task ID to remove: ");
                    if (taskList.removeByTaskId(taskId)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Task not found.");
                    }
                }
                case 5 -> {
                    Task current = taskList.getCurrentTask();
                    if (current != null) {
                        System.out.println("Current Task: " + current);
                    } else {
                        System.out.println("No tasks available.");
                    }
                }
                case 6 -> {
                    Task next = taskList.moveToNextTask();
                    if (next != null) {
                        System.out.println("Moved to next task: " + next);
                    } else {
                        System.out.println("No tasks available.");
                    }
                }
                case 7 -> {
                    taskList.displayAllTasks();
                }
                case 8 -> {
                    int priority = readInt("Priority to search: ");
                    List<Task> results = taskList.searchByPriority(priority);
                    if (results.isEmpty()) {
                        System.out.println("No tasks found with priority: " + priority);
                    } else {
                        System.out.println("Tasks with priority " + priority + ":");
                        results.forEach(System.out::println);
                    }
                }
                case 9 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
        
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Task Scheduler (Circular List) ---");
        System.out.println("1. Add task at beginning");
        System.out.println("2. Add task at end");
        System.out.println("3. Insert task at position");
        System.out.println("4. Remove task by ID");
        System.out.println("5. View current task");
        System.out.println("6. Move to next task");
        System.out.println("7. Display all tasks");
        System.out.println("8. Search by priority");
        System.out.println("9. Exit");
    }

    private static Task promptForTask() {
        int taskId = readInt("Task ID: ");
        String taskName = readLine("Task name: ");
        int priority = readInt("Priority: ");
        String dueDate = readLine("Due date: ");
        return new Task(taskId, taskName, priority, dueDate);
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
