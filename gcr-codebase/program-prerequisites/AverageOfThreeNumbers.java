import java.util.Scanner;

// Program to calculate average of three numbers
public class AverageOfThreeNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double thirdNumber = scanner.nextDouble();
        
        // Calculate average of three numbers
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        
        System.out.printf("Average of %.2f, %.2f, and %.2f is: %.2f%n", 
                         firstNumber, secondNumber, thirdNumber, average);
        
        scanner.close();
    }
}
