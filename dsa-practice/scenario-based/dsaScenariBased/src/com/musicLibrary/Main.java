package com.musicLibrary;

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
                    addTrackUI();
                    break;

                case 2:
                    searchTrackUI();
                    break;

                case 3:
                    displayTracksUI();
                    break;

                case 4:
                    displayPlaylistAlphabeticallyUI();
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

    private static void addTrackUI() {
        System.out.print("Enter Track ID: ");
        int trackId = input.nextInt();
        input.nextLine();

        System.out.print("Enter Song Title: ");
        String title = input.nextLine();

        System.out.print("Enter Artist Name: ");
        String artist = input.nextLine();

        MusicManager.addTrack(trackId, title, artist);
        System.out.println("Track added successfully.");
    }

    private static void searchTrackUI() {
        System.out.print("Enter Track ID to search: ");
        int trackId = input.nextInt();
        input.nextLine();

        Track track = MusicManager.searchTrack(trackId);
        
        if(track != null) {
            System.out.println("\n========== TRACK FOUND ==========");
            System.out.println("Track ID: " + track.trackId);
            System.out.println("Title: " + track.title);
            System.out.println("Artist: " + track.artist);
            System.out.println("==================================");
        }
        else {
            System.out.println("Track not found!");
        }
    }

    private static void displayTracksUI() {
        System.out.println("\n========== MUSIC LIBRARY (SORTED BY TRACK ID) ==========");
        MusicManager.showTracks();
        System.out.println("========================================================");
    }

    private static void displayPlaylistAlphabeticallyUI() {
        System.out.println("\n========== PLAYLIST (ALPHABETICALLY BY TITLE) ==========");
        MusicManager.showPlaylistAlphabetically();
        System.out.println("========================================================");
    }

    // ---------------- HELPER METHODS ----------------

    private static void printMenu() {
        System.out.println();
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║    MUSIC APP - TRACK ORGANIZER     ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Add New Track                   ║");
        System.out.println("║ 2. Search Track by ID              ║");
        System.out.println("║ 3. Display All Tracks (by ID)      ║");
        System.out.println("║ 4. Show Playlist Alphabetically    ║");
        System.out.println("║ 0. Exit                            ║");
        System.out.println("╚════════════════════════════════════╝");
    }

    private static void pause() {
        System.out.println("\nPress ENTER to continue...");
        input.nextLine();
    }
}
