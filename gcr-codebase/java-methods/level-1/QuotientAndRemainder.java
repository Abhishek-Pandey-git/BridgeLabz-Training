import java.util.Scanner;

// Quotient and Remainder Calculator
public class QuotientAndRemainder {
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Quotient using division operator
        int remainder = number % divisor;  // Remainder using modulus operator
        
        // Return array with quotient at index 0 and remainder at index 1
        return new int[]{quotient, remainder};
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get the two numbers from user
        System.out.print("Enter the dividend: ");
        int number = input.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        
        // Find quotient and remainder using method
        int[] result = findRemainderAndQuotient(number, divisor);
        
        // Display the results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
       
        input.close();
    }
}
