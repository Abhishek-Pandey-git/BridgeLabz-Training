import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Variable to control the loop
        int continueVoting = 1;
        
        // Loop for multiple voters
        while (continueVoting == 1) {
            // Take age input
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            
            // Check if eligible to vote
            if (age >= 18) {
                System.out.println("You are eligible to vote");
                
                // Record vote
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");
                System.out.print("Enter your choice (1/2/3): ");
                int vote = input.nextInt();
                
                // Display vote recorded message
                if (vote == 1 || vote == 2 || vote == 3) {
                    System.out.println("Vote recorded for Candidate " + vote);
                } else {
                    System.out.println("Invalid choice");
                }
            } else {
                System.out.println("You are not eligible to vote");
            }
            
            // Ask if more voters
            System.out.print("Continue voting? (1 for Yes, 0 to Exit): ");
            continueVoting = input.nextInt();
        }
        
        System.out.println("Voting session ended");
        
        // Close scanner
        input.close();
    }
}
