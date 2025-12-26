import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.Scanner;
public class DateComparison{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		//taking input
		System.out.println("Enter date1 in format yyyy-MM-dd: ");
		String date1=input.nextLine();
		System.out.println("Enter a date2 in for mat yyyy-MM-dd: ");
		String date2=input.nextLine();
		//Extracting the time of the moment
		LocalDate parsedDate1=LocalDate.parse(date1);
		LocalDate parsedDate2=LocalDate.parse(date2);
		
		if(parsedDate1.isBefore(parsedDate2)){
			System.out.println(parsedDate1+ " is before "+parsedDate2);
			
		}
		else if(parsedDate1.isAfter(parsedDate2)){
			System.out.println(parsedDate1+ " is after "+parsedDate2);
		}
		else if(parsedDate1.isEqual(parsedDate2)){
			System.out.println("Both dates are equal");
		}
		
		input.close();
	}	
}