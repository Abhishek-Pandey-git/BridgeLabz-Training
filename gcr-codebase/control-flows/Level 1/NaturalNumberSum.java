import java.util.Scanner;

// Program to check for natural number and calculate sum of n natural numbers
public class NaturalNumberSum {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if number is a natural number (positive integer)
        if (number > 0) {
            // Calculate sum using formula: n * (n + 1) / 2
            int sum = number * (number + 1) / 2;
            
            // Display result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Display error message for non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
        scanner.close();
    }
}
