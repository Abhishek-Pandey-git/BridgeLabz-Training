import java.util.Scanner;

// Number Checker - returns -1 for negative, 1 for positive, 0 for zero
public class NumberChecker {
    
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;  // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0;  // Zero
        }
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check the number using method
        int result = checkNumber(number);
        
        // Display the result
        if (result == 1) {
            System.out.println(number + " is a Positive number.");
        } else if (result == -1) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println(number + " is Zero.");
        }
        
        
        input.close();
    }
}
