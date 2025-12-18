import java.util.Scanner;

// Program to find sum of numbers until user enters 0
public class SumUntilZero {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        double total = 0.0;
        double userNumber;
        
        // Input first number
        System.out.print("Enter a number (0 to stop): ");
        userNumber = scanner.nextDouble();
        
        // Loop until user enters 0
        while (userNumber != 0) {
            // Add to total
            total = total + userNumber;
            
            // Input next number
            System.out.print("Enter a number (0 to stop): ");
            userNumber = scanner.nextDouble();
        }
        
        // Display total sum
        System.out.println("The total sum is: " + total);
        
        scanner.close();
    }
}
