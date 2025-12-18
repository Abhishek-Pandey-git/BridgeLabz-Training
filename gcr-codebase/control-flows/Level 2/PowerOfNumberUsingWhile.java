import java.util.Scanner;
//Q12
public class PowerOfNumberUsingWhile{
		public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		//Taking input
		System.out.println("Enter a number: ");
		int number=input.nextInt();
		System.out.println("Enter the power to be raised: ");
		
		int power=input.nextInt();
		long result=1;
		
		//initialising The counter
		int counter=1;
		
		while(counter<=power){
			result*=number;
			counter++;
		}
		System.out.println(number+ " raied to power "+power+ " is: "+result);
		
	}
}