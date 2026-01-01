import java.util.Scanner;

public class FestivalLuckyDraw {
	
	// ANSI Color Constants from previous examples
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	// Corrected ORANGE constant to include escape sequence
	public static final String ORANGE = "\u001B[38;5;208m"; 
	public static final String CYAN = "\u001B[36m"; 
	
    public static void main(String[] args) {
		
      Scanner input = new Scanner(System.in);
	  
	  // UI Border Strings
	  String topLine = "┌─────────────────────────────┐";
	  String bottomLine ="└─────────────────────────────┘";
	  // Removed emoji from header text
	  String headerLine = "│   Diwali Mela Lucky Draw!   │";

	  System.out.println(ORANGE + topLine);
	  System.out.println(headerLine);
	  System.out.println(bottomLine + RESET);
	  
	  // Loop indefinitely for multiple visitors until user decides to stop
	  while(true){
		  System.out.println("\nEnter the visitor's lucky draw number (or enter '0' to exit): ");
		  
		  // Check if the input is a valid integer first
		  if (!input.hasNextInt()) {
			  System.out.println(RED + "Invalid input! Please enter a numerical ticket number." + RESET);
			  input.next(); // Clear the invalid input from the scanner buffer
			  continue;     // Skip the rest of the loop iteration and ask again (as requested by 'continue if input is invalid')
		  }
		  
		  int drawNumber = input.nextInt();
		  
		  if (drawNumber == 0) {
			  break; // Exit the while loop if the user enters 0
		  }

		  // Removed emoji from the notification line
		  System.out.println(CYAN + "Drawing number " + drawNumber + "..." + RESET);
		  
		  // Check for the winning condition using modulus
		  if (drawNumber % 3 == 0 && drawNumber % 5 == 0) {
			  System.out.println(GREEN + "\n" + topLine);
			  // Removed emojis from the win message
			  System.out.println("│   CONGRATULATIONS!          │");
			  System.out.println("│ You win a special gift!     │");
			  System.out.println(bottomLine + RESET);
		  } else {
			  System.out.println(RED + "\n" + topLine);
			  System.out.println("│Sorry, better luck next time │");
			  System.out.println(bottomLine + RESET);
		  }
		  
		  // Prompt for the next visitor implicitly by continuing the loop
	  }
	   
	  System.out.println("\nThankyou for visiting the Diwali Mela!");
	  input.close();
    }
}
