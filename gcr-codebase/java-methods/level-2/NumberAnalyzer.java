import java.util.Scanner;

// Q9. Program to check positive/negative, even/odd, and compare first and last elements
public class NumberAnalyzer {
    
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        System.out.println("\n--- Analysis of Numbers ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + " (" + numbers[i] + "): ");
            
            if (isPositive(numbers[i])) {
                System.out.print("Positive");
                
                if (isEven(numbers[i])) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        
        System.out.println("\n--- Comparison of First and Last Elements ---");
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        
        System.out.print("First element (" + numbers[0] + ") ");
        if (comparisonResult == 1) {
            System.out.println("is GREATER than last element (" + numbers[numbers.length - 1] + ")");
        } else if (comparisonResult == 0) {
            System.out.println("is EQUAL to last element (" + numbers[numbers.length - 1] + ")");
        } else {
            System.out.println("is LESS than last element (" + numbers[numbers.length - 1] + ")");
        }
        
        input.close();
    }
}
