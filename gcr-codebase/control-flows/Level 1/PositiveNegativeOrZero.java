import java.util.Scanner;

// Program to check if a number is positive, negative, or zero
public class PositiveNegativeOrZero {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        
        scanner.close();
    }
}
