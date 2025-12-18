import java.util.Scanner;

// Program to check which of three numbers is the largest
public class LargestOfThree {
    
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
        
        // Check if first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        
        // Check if second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        
        // Check if third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);
        
        // Display results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        
        scanner.close();
    }
}
