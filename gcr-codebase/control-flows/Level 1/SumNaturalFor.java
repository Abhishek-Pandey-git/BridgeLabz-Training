import java.util.Scanner;

// Program to find sum of n natural numbers using for loop and compare with formula
public class SumNaturalFor {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if number is a natural number
        if (number > 0) {
            // Calculate sum using formula
            int sumByFormula = number * (number + 1) / 2;
            
            // Calculate sum using for loop
            int sumByLoop = 0;
            for (int counter = 1; counter <= number; counter++) {
                sumByLoop = sumByLoop + counter;
            }
            
            // Compare both results
            System.out.println("Sum by formula: " + sumByFormula);
            System.out.println("Sum by for loop: " + sumByLoop);
            
            if (sumByFormula == sumByLoop) {
                System.out.println("Both results are correct and equal!");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
        scanner.close();
    }
}
