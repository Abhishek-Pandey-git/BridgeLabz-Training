
import java.util.Scanner;
//Q12
public class EuclideanDistanceAndLineEquation {

    //calculating eucledian distance 
    public static double calculateEuclideanDistance(int[][] points){
        //Clculating distance by distance = sqrt((x2-x1)^2 +(y2-y1)^2) 
        double distance=Math.sqrt(Math.pow(points[1][0]-points[0][0],2)+Math.pow(points[1][1]-points[0][1],2));
        return distance;
    }

    //CALCULATINg slope and y intercept

    public static double[] calcSlopeAndIntercept(int[][] points){
        if(points[1][0]==points[0][0]){
            System.out.println("Error: Vertical line - slope is undefined");
            return new double[]{0,0};
        }
        
        //calculating slope by m = (y2 - y1)/(x2 - x1)
        double slope=(double)(points[1][1]-points[0][1])/(points[1][0]-points[0][0]);
        double intercept=points[0][1]-(slope*points[0][0]);

        return new double[]{slope,intercept};
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // using 2d array to store the points;
        int[][] points=new int[2][2];

        //Taking input for the pints

        for(int i=0;i<2;i++){
            System.out.println("Enter x intercept for point: "+(i+1)+ ": ");
            points[i][0]=input.nextInt();
            System.out.println("Enter y intercept for point: "+(i+1)+ ": ");
            points[i][1]=input.nextInt();
        }

        double distance=calculateEuclideanDistance(points);

        double[] slopeAndIntercept=calcSlopeAndIntercept(points);

        System.out.println("The euclidean distance is: "+ distance);
        System.out.println("The equation is: y= "+ slopeAndIntercept[0]+"x + "+slopeAndIntercept[1]);

        input.close();
    }
    
}
