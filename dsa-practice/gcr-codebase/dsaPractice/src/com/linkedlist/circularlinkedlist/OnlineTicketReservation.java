package com.linkedlist.circularlinkedlist;

import java.util.List;
import java.util.Scanner;

/**
 * Online Ticket Reservation Management.
 */
public class OnlineTicketReservation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose: ");
            
            switch (choice) {
                case 1 -> {
                    int id = readInt("Ticket ID: ");
                    String customer = readLine("Customer name: ");
                    String movie = readLine("Movie name: ");
                    String seat = readLine("Seat number: ");
                    String time = readLine("Booking time: ");
                    system.addTicket(new Ticket(id, customer, movie, seat, time));
                    System.out.println("Ticket booked.");
                }
                case 2 -> {
                    int id = readInt("Ticket ID to remove: ");
                    System.out.println(system.removeTicket(id) ? "Ticket cancelled." : "Not found.");
                }
                case 3 -> {
                    system.displayAllTickets();
                }
                case 4 -> {
                    String customer = readLine("Customer name: ");
                    List<Ticket> results = system.searchByCustomer(customer);
                    if (results.isEmpty()) {
                        System.out.println("No tickets found.");
                    } else {
                        results.forEach(System.out::println);
                    }
                }
                case 5 -> {
                    String movie = readLine("Movie name: ");
                    List<Ticket> results = system.searchByMovie(movie);
                    if (results.isEmpty()) {
                        System.out.println("No tickets found.");
                    } else {
                        results.forEach(System.out::println);
                    }
                }
                case 6 -> {
                    System.out.println("Total booked tickets: " + system.getTotalTickets());
                }
                case 7 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Online Ticket Reservation ---");
        System.out.println("1. Book ticket  2. Cancel ticket  3. Display all");
        System.out.println("4. Search by customer  5. Search by movie  6. Total tickets  7. Exit");
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
