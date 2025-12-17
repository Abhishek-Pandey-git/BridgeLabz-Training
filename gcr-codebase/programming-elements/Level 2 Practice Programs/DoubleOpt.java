import java.util.Scanner;

// Program to demonstrate double operations with operator precedence
public class DoubleOpt {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();
        
        // Perform double operations with operator precedence
        double operation1 = a + b * c;      // Multiplication first, then addition
        double operation2 = a * b + c;      // Multiplication first, then addition
        double operation3 = c + a / b;      // Division first, then addition
        double operation4 = a % b + c;      // Modulus first, then addition
        
        System.out.println("The results of Double Operations are " + operation1 + ", " + 
                         operation2 + ", " + operation3 + ", and " + operation4);
        
        scanner.close();
    }
}
