import java.util.Scanner;

public class StudentVotingEligibility {
    
    // method to get ages of students
    public static int[] getStudentAges(int numStudents, Scanner input) {
        int[] ages = new int[numStudents];
        
        for(int i=0;i<numStudents;i++){
            System.out.println("Enter age of student " + (i+1) + ":");
            ages[i] = input.nextInt();
        }
        
        return ages;
    }
    
    
    // checking voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for(int i=0;i<ages.length;i++){
            result[i][0] = String.valueOf(ages[i]);
            
            // checking for negative age
            if(ages[i]<0){
                result[i][1] = "false";
            }
            else if(ages[i]>=18){
                result[i][1]="true";
            }
            else{
                result[i][1] = "false";
            }
        }
        
        return result;
    }
    
    
    // displaying result
    public static void displayResult(String[][] data) {
        System.out.println("\nAge and Voting Eligibility:");
        
        for(int i=0;i<data.length;i++){
            System.out.println("Student " + (i+1) + ": Age = " + data[i][0] + ", Can Vote = " + data[i][1]);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents=10;
        
        System.out.println("Enter ages of 10 students:");
        
        // getting ages
        int[] studentAges = getStudentAges(numStudents, input);
        
        
        // checking eligibility
        String[][] eligibilityData = checkVotingEligibility(studentAges);
        
        
        // displaying result
        displayResult(eligibilityData);
        
        input.close();
    }
    
}
