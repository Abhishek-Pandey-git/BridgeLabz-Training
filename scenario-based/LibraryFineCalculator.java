import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {

        // Scanner object renamed to 'input'
        Scanner input = new Scanner(System.in);

        int dueDate, returnDate;
        int lateDays, fine;
        final int FINE_PER_DAY = 5;

        System.out.println("========================================");
        System.out.println("     ROHAN'S LIBRARY FINE CALCULATOR     ");
        System.out.println("========================================");

        // Table Header
        System.out.println("\n--------------------------------------------------");
        System.out.printf("%-8s %-10s %-12s %-10s%n",
                "Book", "LateDays", "Fine/Day", "TotalFine");
        System.out.println("--------------------------------------------------");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);
            System.out.print("Enter Due Date: ");
            dueDate = input.nextInt();

            System.out.print("Enter Return Date: ");
            returnDate = input.nextInt();

            if (returnDate > dueDate) {
                lateDays = returnDate - dueDate;
                fine = lateDays * FINE_PER_DAY;

                System.out.printf("%-8d %-10d ₹%-11d ₹%-10d%n",
                        i, lateDays, FINE_PER_DAY, fine);
            } else {
                System.out.printf("%-8d %-10d %-12s ₹%-10d%n",
                        i, 0, "N/A", 0);
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Fine calculation completed.");

        input.close();
    }
}
