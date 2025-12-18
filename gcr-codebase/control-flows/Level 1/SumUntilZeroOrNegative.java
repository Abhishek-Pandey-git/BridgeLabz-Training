import java.util.Scanner;

// Program to find sum until user enters 0 or negative number using break
public class SumUntilZeroOrNegative {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        double total = 0.0;
        double userNumber;
        
        // Infinite loop with break condition
        while (true) {
            // Input number
            System.out.print("Enter a number (0 or negative to stop): ");
            userNumber = scanner.nextDouble();
            
            // Check if user entered 0 or negative number
            if (userNumber <= 0) {
                break;
            }
            
            // Add to total
            total = total + userNumber;
        }
        
        // Display total sum
        System.out.println("The total sum is: " + total);
        
        scanner.close();
    }
}
