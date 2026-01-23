package com.hospitalqueuemanagement;

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
					registerPatientUI();
					break;

				case 2:
					dischargePatientUI();
					break;

				case 3:
					showPatientsUI();
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

	private static void registerPatientUI() {
		System.out.print("Enter Patient ID: ");
		int patientId = input.nextInt();
		input.nextLine();

		System.out.print("Enter Name: ");
		String name = input.nextLine();

		System.out.print("Enter Check-In Time (HH:MM): ");
		String checkInTime = input.nextLine();

		QueueManager.registerPatient(patientId, name, checkInTime);
	}

	private static void dischargePatientUI() {
		System.out.print("Enter Patient ID to discharge: ");
		int patientId = input.nextInt();

		QueueManager.dischargePatient(patientId);
	}

	private static void showPatientsUI() {
		System.out.println("\n========== PATIENT QUEUE ==========");
		QueueManager.showPatients();
		System.out.println("===================================");
	}

	// ---------------- HELPER METHODS ----------------

	private static void printMenu() {
		System.out.println();
		System.out.println("╔════════════════════════════════════╗");
		System.out.println("║  HOSPITAL QUEUE MANAGEMENT SYSTEM  ║");
		System.out.println("╠════════════════════════════════════╣");
		System.out.println("║ 1. Patient Registration            ║");
		System.out.println("║ 2. Discharge Patient               ║");
		System.out.println("║ 3. Display by Arrival Time         ║");
		System.out.println("║ 0. Exit                            ║");
		System.out.println("╚════════════════════════════════════╝");
	}

	private static void pause() {
		System.out.println("\nPress ENTER to continue...");
		input.nextLine();
	}
}
