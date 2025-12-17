// Program to find Length of side of square using its permeter
import java.util.Scanner;
public class SquareSideLength{
	public static void main(String[] args){
		double perimeter; // Declaring a variable for input
		//Instantiating Scanner object for input
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the perimeter of the square");
		perimeter=input.nextDouble();
		
		//calculating the side by side=permeter/4;
		double side=perimeter/4;
		System.out.println("Length of side of square is: "+side+ " Whose Perimeter is: "+perimeter);
		
		input.close();
	}
}