import java.util.Scanner;

// Spring Season Checker - Spring is from March 20 to June 20
public class SpringSeasonChecker {
    
    public static boolean isSpringSeasonChecker(int month, int day) {
        // Spring Season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true;  // March 20 onwards
        } else if (month == 4 || month == 5) {
            return true;  // Entire April and May
        } else if (month == 6 && day <= 20) {
            return true;  // June 1 to June 20
        } else {
            return false; // Not Spring Season
        }
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get month and day from user
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        
        System.out.print("Enter the day: ");
        int day = input.nextInt();
        
        // Check if it's Spring Season using method
        boolean isSpring = isSpringSeasonChecker(month, day);
        
        // Display the result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
       
        input.close();
    }
}
