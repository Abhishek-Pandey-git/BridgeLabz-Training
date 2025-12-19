import java.util.Scanner;

public class DigitFrerquency{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter a number: ");
		int number=input.nextInt();
		
		// declaring array for frequency
		int[] frequencyOfDigits=new int[10];
		
		// finding frequency and storing them
		
		while(number!=0){
			int tempDigit=number%10;
			frequencyOfDigits[tempDigit]++;
			number/=10;
		}
		
		// Printing the frequency
		System.out.println("Frequency by each digit:");
		
		for(int i=0;i<10;i++){
			System.out.println(i+" - "+frequencyOfDigits[i]);
		}
		
		
	}
}