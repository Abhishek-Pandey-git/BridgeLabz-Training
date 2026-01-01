import java.util.Scanner;

public class BusRouteTracker {

    // ANSI Color Constants
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tracker Variables
        double totalDistance = 0.0;
        int stopCount = 0;
        boolean passengerWantsToGetOff = false;

        // UI Border Strings
         String topLine = "┌─────────────────────────────┐";
        String midLine  = "├─────────────────────────────┤"; // Midline remains the same connector
        String bottomLine = "└─────────────────────────────┘";
        String rowFormat = "│ %-15s : %6.2f km │%n";

        System.out.println(YELLOW + " Bus Route Tracker Started..." + RESET);

        while (!passengerWantsToGetOff) {
            stopCount++;
            
            // Scenario: Each stop adds a random distance between 2-10 km
            double nextStopDistance = 2.0 + (Math.random() * 8.0);
            totalDistance += nextStopDistance;

            // Display Current Progress
            System.out.println(CYAN + topLine);
            System.out.printf(rowFormat, "Current Stop", (double)stopCount);
            System.out.printf(rowFormat, "Stop Distance", nextStopDistance);
            System.out.printf(rowFormat, "Total Distance", totalDistance);
            System.out.println(bottomLine + RESET);

            // Passenger Input
            System.out.println("The bus has reached Stop #" + stopCount);
            System.out.print("Do you want to get off here? (" + GREEN + "1: Yes" + RESET + " / " + RED + "2: No" + RESET + "): ");
            
            int choice = input.nextInt();

            if (choice == 1) {
                passengerWantsToGetOff = true;
            } else {
                System.out.println(YELLOW + "Moving to the next stop..." + RESET);
                System.out.println();
            }
        }

        // Final Summary
        System.out.println("\n" + GREEN + "┌─────────────────────────────────────┐");
        System.out.println("│          PASSENGER SUMMARY          │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.printf("│ Total Stops Traveled: %-13d │%n", stopCount);
        System.out.printf("│ Final Distance: %-16.2f km │%n", totalDistance);
        System.out.println("└─────────────────────────────────────┘" + RESET);
        
        System.out.println("Thank you for riding with us!");
        input.close();
    }
}
