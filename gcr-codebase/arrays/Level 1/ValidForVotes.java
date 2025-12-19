import java.util.Scanner;

public class ValidForVotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // declaring an array of size 10
	   
       int[] studentAges=new int[10];
		// taking input
		
		for(int i=0;i<studentAges.length;i++){
			System.out.print("Enter the age of the student: ");
			studentAges[i]=input.nextInt();
		}
		
		// Determining if the students are eligible to vote
		
		for(int i=0;i<studentAges.length;i++){
			if(studentAges[i]<=0){
				System.out.println("Invalid age");
			}
			else if(studentAges[i]>=18){
				System.out.println("Student with age "+studentAges[i]+ " can vote");
			}
			else{
				System.out.println("The student with age "+studentAges[i]+ " cannot vote");
			}
		}
		
	   
        
        input.close();
    }
}
