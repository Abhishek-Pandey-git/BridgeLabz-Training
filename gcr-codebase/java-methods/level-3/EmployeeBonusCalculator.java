import java.util.Scanner;

// Q11. Program to calculate employee bonus based on years of service
public class EmployeeBonusCalculator {
	
	public static double[][] generateEmployeeData(){
		double[][] data=new double[10][2];
		
		for(int i=0;i<10;i++){
			data[i][0]=(int)(Math.random()*90000)+10000;
			data[i][1]=(int)(Math.random()*15)+1;
		}
		
		return data;
	}
	
	public static double[][] calculateBonusAndNewSalary(double[][] employeeData){
		double[][] result=new double[10][2];
		
		for(int i=0;i<10;i++){
			double salary=employeeData[i][0];
			double years=employeeData[i][1];
			double bonus=0;
			
			if(years>5){
				bonus=salary*0.05;
			}
			else{
				bonus=salary*0.02;
			}
			
			result[i][0]=salary+bonus;
			result[i][1]=bonus;
		}
		
		return result;
	}
	
	public static void displayResults(double[][] employeeData, double[][] bonusData){
		double oldSalarySum=0;
		double newSalarySum=0;
		double totalBonus=0;
		
		System.out.println("\nEmployee Details:");
		
		for(int i=0;i<10;i++){
			double oldSalary=employeeData[i][0];
			double years=employeeData[i][1];
			double bonus=bonusData[i][1];
			double newSalary=bonusData[i][0];
			
			System.out.println("\nEmployee "+(i+1)+":");
			System.out.println("Years of service: "+(int)years);
			System.out.println("Old Salary: "+oldSalary);
			System.out.println("Bonus: "+bonus);
			System.out.println("New Salary: "+newSalary);
			
			oldSalarySum+=oldSalary;
			newSalarySum+=newSalary;
			totalBonus+=bonus;
		}
		
		System.out.println("\n--- Summary ---");
		System.out.println("Total Old Salary: "+oldSalarySum);
		System.out.println("Total Bonus: "+totalBonus);
		System.out.println("Total New Salary: "+newSalarySum);
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Zara Company - 10 Year Bonus Calculation");
		System.out.println("Bonus Policy: 5% for >5 years, 2% for <=5 years\n");
		
		double[][] employeeData=generateEmployeeData();
		
		double[][] bonusData=calculateBonusAndNewSalary(employeeData);
		
		displayResults(employeeData, bonusData);
		
		input.close();
	}
}
