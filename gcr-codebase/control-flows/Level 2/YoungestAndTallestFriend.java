import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();
        
        // Input for Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();
        
        // Input for Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();
        
        // Find the youngest friend
        String youngestFriend = "";
        int minAge = amarAge;
        youngestFriend = "Amar";
        
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngestFriend = "Akbar";
        }
        
        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend
        String tallestFriend = "";
        double maxHeight = amarHeight;
        tallestFriend = "Amar";
        
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        
        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + youngestFriend + " with age " + minAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + maxHeight + " cm");
        
        scanner.close();
    }
}
