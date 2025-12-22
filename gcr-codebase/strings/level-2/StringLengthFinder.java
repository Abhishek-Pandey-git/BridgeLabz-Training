import java.util.Scanner;

public class StringLengthFinder {
    
    // method to find string length without using length() method
    public static int findLengthWithoutBuiltIn(String text) {
        int count=0;
        
        // using infinite loop to count characters
        while(true) {
            try {
                // trying to access character at index count
                char ch = text.charAt(count);
                count++;
            }
            catch(Exception e) {
                // when exception occurs, we have reached the end
                break;
            }
        }
        
        return count;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input from user
        System.out.println("Enter a string:");
        String inputString = input.next();
        
        
        // calling user defined method to find length
        int customLength = findLengthWithoutBuiltIn(inputString);
        System.out.println("Length using custom method: " + customLength);
        
        
        // using built in method
        int actualLength = inputString.length();
        System.out.println("Length using length() method: " + actualLength);
        
        
        // displaying comparison result
        if(customLength == actualLength) {
            System.out.println("\nBoth lengths are equal!");
        }
        else {
            System.out.println("\nLengths are not equal!");
        }
        
        input.close();
    }
    
}
