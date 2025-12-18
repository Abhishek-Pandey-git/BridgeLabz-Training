import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args){
        double number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=input.nextDouble();
        if(number%5==0){
            System.out.println(number+ " is divisible by 5");
        }
        else{
            System.out.println(number+" is not divisible by 5");
        }
    }
}
