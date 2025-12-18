import java.util.Scanner;

// Program to calculate factorial of a number using while loop
public class FactorialWhile {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if number is positive
        if (number > 0) {
            // Calculate factorial using while loop
            long factorial = 1;
            int counter = 1;
            
            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }
            
            // Display result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer");
        }
        
        scanner.close();
    }
}
