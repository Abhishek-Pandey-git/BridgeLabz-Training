import java.util.Scanner;
//Q1
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];
        
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        
        // taking input from user
        for(int i = 0; i < 10; i++){
            System.out.println("\nEmployee " + (i + 1) + ":");
            
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();
            
            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();
            
            // validating input
            if(salary[i] <= 0 || yearsOfService[i] < 0){
                System.out.println("Invalid input! Please enter valid values.");
                i--;
                continue;
            }
        }
        
        // calculating bonus and new salary
        for(int i = 0; i < 10; i++){
            if(yearsOfService[i] > 5){
                bonusAmount[i] = salary[i] * 0.05;
            }
            else{
                bonusAmount[i] = salary[i] * 0.02;
            }
            
            newSalary[i] = salary[i] + bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        // displaying results
        System.out.println("\n=== Bonus Summary ===");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        input.close();
    }
}
