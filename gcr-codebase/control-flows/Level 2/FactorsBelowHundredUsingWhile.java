import java.util.Scanner;
//Q11
public class FactorsBelowHundredUsingWhile{
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
		int counter=(int)number-1;
		while(counter>1){
			if(number%counter==0){
				System.out.println(counter);
				counter--;
			}
			else{
				counter--;
				continue;
			}		
	
		}
		
	}
}