import java.util.Scanner;

public class OddEven{
	public static void main(String[] args){
		int number;
		
		// Instantiating Scanner class for input
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		number=input.nextInt();
		if(number<=0){
			System.out.println("The input number is not valid");
			return;
		}
		
		// For loop to loop till the limit 
		for(int i=1;i<=number;i++){
			// condition to check if the number is even or odd
			if((i&1)==0){
				System.out.println(i+" is an even number");
			}
			else{
				System.out.println(i+" is an odd number");
			}
			
		}
	}
}