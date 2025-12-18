import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;
        String grade, remarks;

        // Grade calculation
        if (average >= 80) {
            grade = "A";
            remarks = "Above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "At agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("\nAverage Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}

