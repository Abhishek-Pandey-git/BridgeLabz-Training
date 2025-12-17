import java.util.Scanner;
//program to convert this distance 
public class DistanceInYardsAndMiles{
	public static void main(String[] args){
		double distanceInFeet;
		// Using scanner object for input
		Scanner input=new Scanner(System.in);
		
		//Taking Input from user
		System.out.println("Enter the distance in Feet");
		distanceInFeet=input.nextDouble();
		
		//Calculating distance in yards by yard=feet/3;
		double distanceInYard= distanceInFeet/3;
		double distanceInMiles=distanceInYard/1760;
		
		System.out.println("The distance of "+distanceInFeet+" Feet in Yards is "+distanceInYard+" Yards while in Miles is "+distanceInMiles+ "Miles");
		
		input.close();
	}
}