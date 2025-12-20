import java.util.Scanner;

// Smallest and Largest Finder
public class SmallestAndLargest {
    
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;
        
        // Find the smallest number
        smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        
        // Find the largest number
        largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        // Return array with smallest at index 0 and largest at index 1
        return new int[]{smallest, largest};
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get three numbers from user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        
        // Find smallest and largest using method
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        // Display the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
        
        
        input.close();
    }
}
