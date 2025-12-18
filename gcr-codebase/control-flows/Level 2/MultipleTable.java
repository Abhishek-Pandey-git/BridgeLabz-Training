import java.util.Scanner;
public class MultipleTable{
	public static void main(String[] args){
		int number;
		
		// Instantiating the Scanner class for input
		Scanner input=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter a number between 6 and 9: ");
		number=input.nextInt();
		if(number>9 || number<6){
			System.out.println("The numbers must be between 6 and 9. Try again!!!");
			return;
		}
		
		// Looping to print the table
		
		for(int i=0;i<=10;i++){
			System.out.println(number+"*"+i+" = "+(number*i));
		}
		
	}
}