import java.util.Scanner;


// Q10. Program to calculate BMI for multiple persons
public class BMICalculator {
	
	//method to covert cm to m
	public static double cmToMeter(double height){
		return height/100;
	}
	
	//Method to calculate BMI of a person
	public static double calculateBMI(double weight, double height){
		double heighInMeters=cmToMeter(height);
		
		return weight/(heighInMeters*heighInMeters);
	}
	
	
	public static void main(String[] args){
		// Instantiate Scanner class to take input
	
		Scanner input=new Scanner(System.in);
		
		//declaring array
		double[][] weightAndHeight=new double[10][3];
		
		// taking input from user
		for(int i=0;i<10;i++){
			System.out.print("enter weight of the person: ");
			weightAndHeight[i][0]=input.nextDouble();
			System.out.println("enter the height of the person in cm: ");
			weightAndHeight[i][1]=input.nextDouble();
		}
		
		// looping and calling calculateBMI method to calculate the BMI
		
		for(int i=0;i<10;i++){
			weightAndHeight[i][2]=calculateBMI(weightAndHeight[i][0],weightAndHeight[i][1]);
			
		}
		
		//Printing BMI status
		System.out.println("Person         BMI         Status");
		for(int i=0;i<10;i++){
			if(weightAndHeight[i][2]<=18.4){
				System.out.println((i+1)+ "         "+weightAndHeight[i][2]+
				 "         Underweight");
			}
			else if(weightAndHeight[i][2]<=24.9){
				System.out.println((i+1)+ "         "+weightAndHeight[i][2]+
				 "         Normal");
			}
			else if(weightAndHeight[i][2]<=39.9){
				System.out.println((i+1)+ "         "+weightAndHeight[i][2]+
				 "         Overweight");
			}
			else{
				System.out.println((i+1)+ "         "+weightAndHeight[i][2]+
				 "         Obese");
			}
		}
		
		
		
		
		
		input.close();
		
	}
	
    
    
    
}
