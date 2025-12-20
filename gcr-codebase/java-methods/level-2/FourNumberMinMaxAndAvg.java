

//Program to generate 5 random number and find their min , MAX and , AVERAGE
public class FourNumberMinMaxAndAvg {

    // dmethod to return array with 5 random numbers
    public int[] generate4DigitRandomArray(int size){
        int[] fourRandomArray=new int[size];

        //looping to generate array elements
        for(int i=0;i<size;i++){
            int number = (int) (Math.random()*10000);
            System.out.println(number);
            fourRandomArray[i]=number;
        }

        return fourRandomArray;
    }

    public double[] findAverageMinMax(int[] numbers){
        int sum=0;
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            max=Math.max(max,numbers[i]);
            min=Math.min(min,numbers[i]);
        }
        double average=sum/5.0;
        double[] averageMinMax=new double[3];
        averageMinMax[0]=average;
        averageMinMax[1]=min;
        averageMinMax[2]=max;

        return averageMinMax;

    }

    public static void main(String[] args) {
        //declaring the veariable
        FourNumberMinMaxAndAvg ob=new FourNumberMinMaxAndAvg();
        int[] numbers=ob.generate4DigitRandomArray(5);
        double[] averageMinMax=ob.findAverageMinMax(numbers);
        System.out.println("The average of numbers is: "+averageMinMax[0]);
        System.out.println("The min of numbers is: "+averageMinMax[1]);
        System.out.println("The max of numbers is: "+averageMinMax[2]);
    }
}
