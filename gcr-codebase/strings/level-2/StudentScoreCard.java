import java.util.Scanner;
import java.util.Random;

class StudentScoreCard
{

    static int[][] generatePCM(int students)
    {
        Random r = new Random();
        int pcm[][] = new int[students][3];

        for(int i=0;i<students;i++)
        {
            pcm[i][0] = r.nextInt(90) + 10;
            pcm[i][1] = r.nextInt(90) + 10;
            pcm[i][2] = r.nextInt(90) + 10;
        }

        return pcm;
    }


    static double[][] calculateValues(int[][] pcm)
    {
        double values[][] = new double[pcm.length][3];

        for(int i=0;i<pcm.length;i++)
        {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            values[i][0] = total;
            values[i][1] = avg;
            values[i][2] = percent;
        }

        return values;
    }


    static char[] calculateGrade(double[][] values)
    {
        char grade[] = new char[values.length];

        for(int i=0;i<values.length;i++)
        {
            double p = values[i][2];

            if(p >= 80)
                grade[i] = 'A';
            else if(p >= 70)
                grade[i] = 'B';
            else if(p >= 60)
                grade[i] = 'C';
            else if(p >= 50)
                grade[i] = 'D';
            else if(p >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        return grade;
    }


    static void display(int[][] pcm,double[][] values,char[] grade)
    {
        System.out.println("Phy Chem Math Total Avg Percent Grade");

        for(int i=0;i<pcm.length;i++)
        {
            System.out.println(
                pcm[i][0] + "   " +
                pcm[i][1] + "   " +
                pcm[i][2] + "   " +
                values[i][0] + "   " +
                values[i][1] + "   " +
                values[i][2] + "   " +
                grade[i]
            );
        }
    }


    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = input.nextInt();

        int pcm[][] = generatePCM(n);
        double values[][] = calculateValues(pcm);
        char grade[] = calculateGrade(values);

        display(pcm,values,grade);
        
        input.close();
    }
}

