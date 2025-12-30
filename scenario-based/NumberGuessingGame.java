/*
7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.Scanner;


public class NumberGuessingGame {
	//counter variable to count the number of parking slots full
	public static int triesLeft=5;
	
	//colorfulloutput
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
	public static final String ORANGE = "\u001B[38;5;208m";
	
	
    public static void main(String[] args) {
		
		//Generating random number between 1 and 100
		int number=(int)((Math.random()*100)+1);
		
		
        Scanner input=new Scanner(System.in);
		//Taking input from user
		System.out.println(YELLOW+"Chances left: "+triesLeft+RESET);
		
		do{
			System.out.println(YELLOW+"Guess the number between 1 and 100: "+RESET);
			int guessedNumber=input.nextInt();
			if(guessedNumber==number){
				System.out.println(GREEN+"Bravoo!!!!. You guessed it right"+RESET);
				break;
			}else{
				if(guessedNumber<number){
					System.out.println(ORANGE+"Too Low. Try again!!!"+RESET);
					
				}
				else{
					System.out.println(ORANGE+"Too High. Try again!!!"+RESET);
				}
				triesLeft--;
			
				
				System.out.println();
				System.out.println("======================\t==================");
				System.out.println();
				System.out.println(YELLOW+"Chances left: "+triesLeft+ RESET);
				
			}
		}
		while(triesLeft>0);
		if(triesLeft==0){
			System.out.println("All chances Exhausted. Exiting");
		}
        input.close();
    }
}
