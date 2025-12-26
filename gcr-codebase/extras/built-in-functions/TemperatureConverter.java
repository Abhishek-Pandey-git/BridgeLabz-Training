import java.util.Scanner;

//temperature converter
public class TemperatureConverter {
    
    //convert fahrenheit to celsius
    public static double fahrenheitToCelsius(double f)
    {
        double celsius=(f-32)*5/9;
        return celsius;
    }
    
    //convert celsius to fahrenheit
    public static double celsiusToFahrenheit(double c)
    {
        double fahrenheit=(c*9/5)+32;
        return fahrenheit;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("choose conversion:");
        System.out.println("1. fahrenheit to celsius");
        System.out.println("2. celsius to fahrenheit");
        int choice=input.nextInt();
        
        if(choice==1)
        {
            System.out.println("enter temperature in fahrenheit: ");
            double f=input.nextDouble();
            double result=fahrenheitToCelsius(f);
            System.out.println(f+" F = "+result+" C");
        }
        else if(choice==2)
        {
        System.out.println("enter temperature in celsius: ");
        double c=input.nextDouble();
        double result=celsiusToFahrenheit(c);
        System.out.println(c+" C = "+result+" F");
        }
        else
        {
            System.out.println("invalid choice");
        }
        
        input.close();
    }
}
