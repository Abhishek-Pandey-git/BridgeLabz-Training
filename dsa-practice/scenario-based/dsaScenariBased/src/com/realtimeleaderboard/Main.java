package com.realtimeleaderboard;

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
					insertOrUpdatePlayerUI();
					break;

				case 2:
					showTopPlayersUI();
					break;

				case 3:
					removePlayerUI();
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

	private static void insertOrUpdatePlayerUI() {
		System.out.print("Enter Player Name: ");
		String name = input.nextLine();

		System.out.print("Enter Score: ");
		int score = input.nextInt();
		input.nextLine();

		LeaderboardManager.insertOrUpdatePlayer(name, score);
	}

	private static void removePlayerUI() {
		System.out.print("Enter Player Name to remove: ");
		String name = input.nextLine();

		LeaderboardManager.removePlayer(name);
	}

	private static void showTopPlayersUI() {
		System.out.println("\n========== TOP 10 PLAYERS ==========");
		LeaderboardManager.showTopPlayers();
		System.out.println("====================================");
	}

	// ---------------- HELPER METHODS ----------------

	private static void printMenu() {
		System.out.println();
		System.out.println("╔════════════════════════════════════╗");
		System.out.println("║    GAMING APP - LEADERBOARD        ║");
		System.out.println("╠════════════════════════════════════╣");
		System.out.println("║ 1. Insert/Update Player            ║");
		System.out.println("║ 2. Display Top 10 Players          ║");
		System.out.println("║ 3. Remove Player                   ║");
		System.out.println("║ 0. Exit                            ║");
		System.out.println("╚════════════════════════════════════╝");
	}

	private static void pause() {
		System.out.println("\nPress ENTER to continue...");
		input.nextLine();
	}
}
