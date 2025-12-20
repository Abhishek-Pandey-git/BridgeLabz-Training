import java.util.Scanner;

// Simple Interest Calculator
public class SimpleInterestCalculator {
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Take input from user for principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
        
        // Take input from user for rate of interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();
        
        // Take input from user for time period
        System.out.print("Enter the Time period (in years): ");
        double time = input.nextDouble();
        
        // Calculate simple interest using method
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        
        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + 
                          " for Principal " + principal + 
                          ", Rate of Interest " + rate + 
                          " and Time " + time);
        
       
        input.close();
    }
}
