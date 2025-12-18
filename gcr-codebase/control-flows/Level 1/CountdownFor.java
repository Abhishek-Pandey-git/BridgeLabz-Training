import java.util.Scanner;

// Program to count down from user input to 1 using for loop
public class CountdownFor {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input countdown starting value
        System.out.print("Enter countdown starting value: ");
        int startValue = scanner.nextInt();
        
        // Countdown using for loop
        for (int counter = startValue; counter >= 1; counter--) {
            System.out.println(counter);
        }
        
        // Display launch message
        System.out.println("Rocket Launch!");
        
        scanner.close();
    }
}
