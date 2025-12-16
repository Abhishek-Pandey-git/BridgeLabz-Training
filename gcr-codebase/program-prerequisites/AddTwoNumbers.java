import java.util.Scanner;

// Program to add two numbers
public class AddTwoNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        
        // Calculate and display sum
        double sum = firstNumber + secondNumber;
        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        
        scanner.close();
    }
}
