import java.util.Scanner;

public class MetroSmartCardFare {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Initialize smart card balance
        System.out.print("Enter initial smart card balance: ");
        double balance = input.nextDouble();
        
        // Variable to control the loop
        int choice = 1;
        
        // Loop until balance is exhausted or user quits
        while (choice == 1 && balance > 0) {
            // Ask user for distance
            System.out.print("Enter distance in km: ");
            int distance = input.nextInt();
            
            // Calculate fare using ternary operator
            double fare = (distance <= 5) ? 10 : (distance <= 10) ? 20 : (distance <= 15) ? 30 : 40;
            
            // Check if sufficient balance
            if (balance >= fare) {
                // Deduct from smart card balance
                balance = balance - fare;
                System.out.println("Fare: " + fare);
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
                System.out.println("Current balance: " + balance);
            }
            
            // Ask if user wants to continue
            System.out.print("Continue travel? (1 for Yes, 0 to Quit): ");
            choice = input.nextInt();
        }
        
        System.out.println("Thank you for using Delhi Metro");
        System.out.println("Final balance: " + balance);
        
        // Close scanner
        input.close();
    }
}
