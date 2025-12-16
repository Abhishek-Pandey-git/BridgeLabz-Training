import java.util.Scanner;

// Program to calculate simple interest
public class CalculateSimpleInterest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter rate of interest (in %): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        
        // Simple Interest = (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
        System.out.printf("Total Amount: %.2f%n", (principal + simpleInterest));
        
        scanner.close();
    }
}
