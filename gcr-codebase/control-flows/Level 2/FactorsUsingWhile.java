import java.util.Scanner;
public class FactorsUsingWhile{
	public static void main(String[] args){
		double number;
		Scanner input=new Scanner(System.in);
		
		//Taking input
		while(true){
			System.out.println("Enter a number");
			number=input.nextDouble();
			if(number<=0){
				System.out.println("Number must be a positive number. Try again!!!");
			}
			else
			{
				break;
			}
			
		}
		int i=0;
		
		// finding the factors
		while(i<number){
			if(number%i==0){
				System.out.println(number+ " is divisible by "+i);
			}
			i++;
		}
		
	}
}