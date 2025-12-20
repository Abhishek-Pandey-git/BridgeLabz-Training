import java.util.Scanner;
// Q2
public class SumOfNaturalNumbers {
    
    public static int sumUsingRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static boolean isNaturalNumber(int n) {
        return n > 0;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (!isNaturalNumber(number)) {
            System.out.println("Error: Please enter a natural number (positive integer greater than 0)");
            input.close();
            return;
        }
        
        int sumRecursion = sumUsingRecursion(number);
        
        int sumFormula = sumUsingFormula(number);
        
        System.out.println("\nResults:");
        System.out.println("Sum using Recursion: " + sumRecursion);
        System.out.println("Sum using Formula n*(n+1)/2: " + sumFormula);
        
        if (sumRecursion == sumFormula) {
            System.out.println("\nVerification: Both methods give the same result - CORRECT ✓");
        } else {
            System.out.println("\nVerification: Results do not match - ERROR");
        }
        
        input.close();
    }
}
