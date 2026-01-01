import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int availableSeats = 5;
        int userChoice;

        System.out.println("Train Reservation System");
        System.out.println("------------------------");

        while (true) {

            System.out.println("\nMenu");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            userChoice = scanner.nextInt();

            switch (userChoice) {

                case 1:
                    if (availableSeats > 0) {
                        availableSeats--;
                        System.out.println("Ticket booked successfully.");
                        System.out.println("Remaining Seats: " + availableSeats);
                    } else {
                        System.out.println("No seats available. Booking closed.");
                        break;
                    }

                    if (availableSeats == 0) {
                        System.out.println("All seats are booked. System exiting.");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Available Seats: " + availableSeats);
                    break;

                case 3:
                    System.out.println("Thank you for using the reservation system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (availableSeats == 0) {
                break;
            }
        }

        scanner.close();
    }
}
