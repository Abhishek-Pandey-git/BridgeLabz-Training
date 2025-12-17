import java.util.Scanner;

// Program to find quotient and remainder of two numbers
public class QuotientAndRemainder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                         " of two number " + number1 + " and " + number2);
        
        scanner.close();
    }
}
