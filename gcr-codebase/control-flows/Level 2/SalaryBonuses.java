import java.util.Scanner;
public class SalaryBonuses{
	public static void main(String[] args){
		double salary, yearOfService;
		// Scanner object for input
		Scanner input=new Scanner(System.in);
		//taking input
		System.out.print("Enter the salary of the employee: ");
		salary=input.nextDouble();
		System.out.print("Enter the yearOfService: ");
		yearOfService=input.nextDouble();
		
		
		// Checking if the service years are hreater than 5
		if(yearOfService>5){
			//calculating bous
			double bonus=0.05*salary;
			System.out.println("Your bonus is: "+bonus);
		}
		else{
			System.out.println("You are not eligible for bonus");
		}
		
		
	}
}