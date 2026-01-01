import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        // Scanner object renamed to 'input'
        Scanner input = new Scanner(System.in);

        int customerCount;
        int movieChoice, seatChoice;
        char snackChoice;
        int totalPrice;

        System.out.println("========================================");
        System.out.println("        MOVIE TICKET BOOKING APP         ");
        System.out.println("========================================");

        System.out.print("Enter number of customers: ");
        customerCount = input.nextInt();

        // Table Header
        System.out.println("\n----------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
                "Customer", "Movie", "Seat", "Snacks", "Amount");
        System.out.println("----------------------------------------------------------");

        for (int i = 1; i <= customerCount; i++) {

            totalPrice = 0;
            String movieType = "";
            String seatType = "";
            String snackStatus = "No";

            // Movie selection
            System.out.println("\nCustomer " + i);
            System.out.println("1. Action (₹200)");
            System.out.println("2. Comedy (₹150)");
            System.out.println("3. Drama  (₹180)");
            System.out.print("Select Movie: ");
            movieChoice = input.nextInt();

            switch (movieChoice) {
                case 1:
                    totalPrice += 200;
                    movieType = "Action";
                    break;
                case 2:
                    totalPrice += 150;
                    movieType = "Comedy";
                    break;
                case 3:
                    totalPrice += 180;
                    movieType = "Drama";
                    break;
                default:
                    System.out.println("Invalid movie choice. Skipping.");
                    continue;
            }

            // Seat selection
            System.out.println("1. Gold (₹100)");
            System.out.println("2. Silver (₹50)");
            System.out.print("Select Seat: ");
            seatChoice = input.nextInt();

            if (seatChoice == 1) {
                totalPrice += 100;
                seatType = "Gold";
            } else if (seatChoice == 2) {
                totalPrice += 50;
                seatType = "Silver";
            } else {
                System.out.println("Invalid seat choice. Skipping.");
                continue;
            }

            // Snacks option
            System.out.print("Add Snacks (Y/N): ");
            snackChoice = input.next().charAt(0);

            if (snackChoice == 'Y' || snackChoice == 'y') {
                totalPrice += 80;
                snackStatus = "Yes";
            }

            // Table Row Output
            System.out.printf("%-10d %-10s %-10s %-10s ₹%-10d%n",
                    i, movieType, seatType, snackStatus, totalPrice);
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Booking process completed.");

        input.close();
    }
}
