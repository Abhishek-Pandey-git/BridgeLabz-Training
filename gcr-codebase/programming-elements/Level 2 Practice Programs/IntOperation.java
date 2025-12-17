import java.util.Scanner;

// Program to demonstrate integer operations with operator precedence
public class IntOperation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        
        // Perform integer operations with operator precedence
        int operation1 = a + b * c;      // Multiplication first, then addition
        int operation2 = a * b + c;      // Multiplication first, then addition
        int operation3 = c + a / b;      // Division first, then addition
        int operation4 = a % b + c;      // Modulus first, then addition
        
        System.out.println("The results of Int Operations are " + operation1 + ", " + 
                         operation2 + ", " + operation3 + ", and " + operation4);
        
        scanner.close();
    }
}
