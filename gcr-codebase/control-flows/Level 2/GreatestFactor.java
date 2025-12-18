import java.util.Scanner;
public class GreatestFactor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//Taking user input
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		int greatestFactor=1;
		
		//Looping from number-1 to 1 to find highest factor and break;
		
		for(int i=number-1;i>=1;i--){
			if(number%i==0){
				greatestFactor=i;
				break;
			}
		}
		System.out.println("The Greatest Factor of "+number+ " is: "+ greatestFactor);
		
	}
}