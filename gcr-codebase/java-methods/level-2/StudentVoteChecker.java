import java.util.Scanner;


// Q7. Program to find of a student can vote
public class StudentVoteChecker {
	
	public static boolean canStudentVote(double age){
		if(age<=0){
			return false;
		}
		if(age>=18){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		double[] age=new double[10];
		
		for(int i=0;i<10;i++){
			System.out.println("Enter age of student "+(i+1)+ ": ");
			age[i]=input.nextDouble();
		}
		
		for(int i=0;i<10;i++){
			if(canStudentVote(age[i])){
				System.out.println("Student "+(i+1)+ "can vote");
			}
			else{
				System.out.println("Student "+(i+1)+ "cannot vote");
			}
		}
		
		input.close();
		
	}
	
    
    
    
}
