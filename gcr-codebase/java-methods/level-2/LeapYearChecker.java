import java.util.Scanner;
//Q3
public class LeapYearChecker {
    
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Error: Year must be >= 1582 (Gregorian calendar)");
            return false;
        }
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        if (year < 1582) {
            System.out.println("\nThe year must be >= 1582 (corresponding to the Gregorian calendar)");
            input.close();
            return;
        }
        
        if (isLeapYear(year)) {
            System.out.println("\n" + year + " is a Leap Year");
        } else {
            System.out.println("\n" + year + " is NOT a Leap Year");
        }
        
        // Display leap year rules
        System.out.println("\nLeap Year Rules:");
        System.out.println("- Year must be divisible by 4 AND not divisible by 100");
        System.out.println("  OR");
        System.out.println("- Year must be divisible by 400");
        
        input.close();
    }
}
