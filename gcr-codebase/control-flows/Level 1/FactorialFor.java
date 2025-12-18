import java.util.Scanner;

// Program to calculate factorial of a number using for loop
public class FactorialFor {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if number is positive
        if (number > 0) {
            // Calculate factorial using for loop
            long factorial = 1;
            
            for (int counter = 1; counter <= number; counter++) {
                factorial = factorial * counter;
            }
            
            // Display result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer");
        }
        
        scanner.close();
    }
}
