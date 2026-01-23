package com.bookingbytime;

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
					insertEventUI();
					break;

				case 2:
					cancelEventUI();
					break;

				case 3:
					showEventsUI();
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

	private static void insertEventUI() {
		System.out.print("Enter Event ID: ");
		int eventId = input.nextInt();
		input.nextLine();

		System.out.print("Enter Event Name: ");
		String eventName = input.nextLine();

		System.out.print("Enter Event Time (HH:MM): ");
		String eventTime = input.nextLine();

		BookingManager.insertEvent(eventId, eventName, eventTime);
	}

	private static void cancelEventUI() {
		System.out.print("Enter Event ID to cancel: ");
		int eventId = input.nextInt();

		BookingManager.cancelEvent(eventId);
	}

	private static void showEventsUI() {
		System.out.println("\n========== UPCOMING EVENTS ==========");
		BookingManager.showEvents();
		System.out.println("=====================================");
	}

	// ---------------- HELPER METHODS ----------------

	private static void printMenu() {
		System.out.println();
		System.out.println("╔════════════════════════════════════╗");
		System.out.println("║   ONLINE TICKET BOOKING SYSTEM     ║");
		System.out.println("╠════════════════════════════════════╣");
		System.out.println("║ 1. Insert Event                    ║");
		System.out.println("║ 2. Cancel Event                    ║");
		System.out.println("║ 3. Show Events in Order            ║");
		System.out.println("║ 0. Exit                            ║");
		System.out.println("╚════════════════════════════════════╝");
	}

	private static void pause() {
		System.out.println("\nPress ENTER to continue...");
		input.nextLine();
	}
}
