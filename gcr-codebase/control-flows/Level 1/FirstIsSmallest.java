import java.util.Scanner;

// Program to check if the first number is the smallest of three numbers
public class FirstIsSmallest {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers from user
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        
        // Check if first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
        
        // Display result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        
        scanner.close();
    }
}
