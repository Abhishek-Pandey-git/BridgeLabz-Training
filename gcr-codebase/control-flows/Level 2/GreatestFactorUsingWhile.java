import java.util.Scanner;
//Q10
public class GreatestFactorUsingWhile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//Taking user input
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		int greatestFactor=1;
		
		//Looping from number-1 to 1 to find highest factor and break;
		int i=number-1;
		while(i>=1){
			if(number%i==0){
				greatestFactor=i;
				break;
			}
			i--;
		}
		System.out.println("The Greatest Factor of "+number+ " is: "+ greatestFactor);
		
	}
}