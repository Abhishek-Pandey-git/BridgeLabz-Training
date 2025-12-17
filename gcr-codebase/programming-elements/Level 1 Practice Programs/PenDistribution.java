// Program to distribute pens equally among students
public class PenDistribution {
    
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        
        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;
        
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                         " and the remaining pen not distributed is " + remainingPens);
    }
}
