import java.util.Scanner;

// Sum of Natural Numbers
public class SumOfNaturalNumbers {
    
    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get the value of n from user
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        // Calculate sum using method
        int sum = findSumOfNaturalNumbers(n);
        
        // Display the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        
        
        input.close();
    }
}
