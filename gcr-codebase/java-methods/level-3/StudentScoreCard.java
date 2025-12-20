
import java.util.Scanner;


public class StudentScoreCard {

    // generate random 2 digit PCM marks
    static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10; // physics
            marks[i][1] = (int)(Math.random() * 90) + 10; // chemistry
            marks[i][2] = (int)(Math.random() * 90) + 10; // maths
        }
        return marks;
    }

    // calculate total, average and percentage
    static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            per = Math.round(per * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = per;
        }
        return result;
    }

    // display scorecard
    static void display(int[][] marks, double[][] result) {

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\tPercent");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculateResults(marks);

        System.out.println();
        display(marks, result);

        sc.close();
    }
}

