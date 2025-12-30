import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        char continueRecharge;

        System.out.println("Phone Recharge Simulator");
        System.out.println("-------------------------");

        do {
            System.out.print("Enter Mobile Operator (Airtel / Jio / Vi): ");
            String mobileOperator = scanner.next();

            System.out.print("Enter Recharge Amount: ");
            double rechargeAmount = scanner.nextDouble();

            // Add recharge to balance
            balance += rechargeAmount;

            // Display offers using switch
            System.out.println("\nRecharge Offer Details:");
            switch (mobileOperator.toLowerCase()) {

                case "airtel":
                    System.out.println("Operator : Airtel");
                    System.out.println("Offer    : 1.5GB/day for 28 days");
                    break;

                case "jio":
                    System.out.println("Operator : Jio");
                    System.out.println("Offer    : 2GB/day for 28 days");
                    break;

                case "vi":
                    System.out.println("Operator : Vi");
                    System.out.println("Offer    : Unlimited calls + 1GB/day");
                    break;

                default:
                    System.out.println("Operator : Unknown");
                    System.out.println("Offer    : No offer available");
            }

            // Display updated balance
            System.out.printf("Recharge Amount : ₹%.2f%n", rechargeAmount);
            System.out.printf("Current Balance : ₹%.2f%n", balance);

            // Ask user to continue
            System.out.print("\nDo you want to recharge again? (Y/N): ");
            continueRecharge = scanner.next().charAt(0);

            System.out.println("----------------------------------");

        } while (continueRecharge == 'Y' || continueRecharge == 'y');

        System.out.println("Thank you for using the Recharge Simulator.");
        scanner.close();
    }
}

