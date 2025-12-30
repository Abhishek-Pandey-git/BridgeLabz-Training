import java.util.Scanner;

public class FitnessChallengeTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] weeklyPushUps = new int[7];
        String[] dayNames = {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"
        };

        int totalPushUps = 0;
        int activeDays = 0;

        System.out.println("Sandeep's Fitness Challenge Tracker");
        System.out.println("-----------------------------------");
        System.out.println("Enter push-up count for each day.");
        System.out.println("Enter -1 for rest day.\n");

        // Input section
        for (int day = 0; day < weeklyPushUps.length; day++) {
            System.out.print(dayNames[day] + ": ");
            weeklyPushUps[day] = scanner.nextInt();
        }

        // Calculation using for-each loop
        for (int dailyCount : weeklyPushUps) {

            if (dailyCount == -1) {
                continue;
            }

            totalPushUps += dailyCount;
            activeDays++;
        }

        double averagePushUps = (activeDays > 0)
                ? (double) totalPushUps / activeDays
                : 0.0;

        // Table Output
        System.out.println("\nWeekly Push-Up Report");
        System.out.println("------------------------------------------------");
        System.out.printf("%-12s | %-15s%n", "Day", "Push-Ups");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < weeklyPushUps.length; i++) {
            String displayValue = (weeklyPushUps[i] == -1)
                    ? "Rest Day"
                    : String.valueOf(weeklyPushUps[i]);

            System.out.printf("%-12s | %-15s%n", dayNames[i], displayValue);
        }

        System.out.println("------------------------------------------------");
        System.out.printf("%-12s | %-15d%n", "Total", totalPushUps);
        System.out.printf("%-12s | %-15.2f%n", "Average", averagePushUps);

        scanner.close();
    }
}

