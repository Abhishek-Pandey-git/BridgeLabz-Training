import java.util.Scanner;

// Program to count down from user input to 1 using while loop
public class CountdownWhile {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input countdown starting value
        System.out.print("Enter countdown starting value: ");
        int counter = scanner.nextInt();
        
        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        
        // Display launch message
        System.out.println("Rocket Launch!");
        
        scanner.close();
    }
}
