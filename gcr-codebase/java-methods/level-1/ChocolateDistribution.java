import java.util.Scanner;


//Program to divide N chocolates among M children

public class ChocolateDistribution {
    
    //Method to find chocolates per child and remaining chocolates
    
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;  // Chocolates each child gets
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Remaining chocolates
        
        // Return array with chocolates per child at index 0 and remaining at index 1
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get number of chocolates from user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        // Get number of children from user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Calculate distribution using method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        
        // Display the results
        System.out.println("Each child will get: " + result[0] + " chocolate(s)");
        System.out.println("Remaining chocolates: " + result[1]);
        
      
        input.close();
    }
}
