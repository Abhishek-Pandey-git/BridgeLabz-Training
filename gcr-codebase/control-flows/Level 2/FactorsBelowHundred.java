import java.util.Scanner;
//Q11
public class FactorsBelowHundred{
	public static void main(String[] args){
		double number;
		Scanner input=new Scanner(System.in);
		
		//Taking input
		while(true)
		{
			System.out.println("Enter a number");
			number=input.nextDouble();
			if(number<=0 || number>100 )
			{
				System.out.println("Number must be a positive and less than 100. Try again!!!");
			}
			else
			{
				break;
			}
		}
		//Looping to find the factors
		for(int i=100;i>=1;i--){
			if(number%i==0){
				System.out.println(i);
				continue;
			}
		}
		
	}
}