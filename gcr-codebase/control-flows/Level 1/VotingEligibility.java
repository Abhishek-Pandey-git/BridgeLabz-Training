import java.util.Scanner;

// Program to check voting eligibility based on age
public class VotingEligibility {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input age from user
        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        
        // Check if person is eligible to vote (age >= 18)
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        scanner.close();
    }
}
