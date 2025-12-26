import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;
import java.util.Scanner;
public class DateManipulation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//taking input
		System.out.println("Enter the date in format: yyyy-MM-dd: ");
		String str=input.nextLine();
		
		//converting to date object
		LocalDate dateNow=LocalDate.parse(str);
		
		//adding 7 days, 1 month, and 2 years to it
		
		LocalDate newDate=dateNow.plusDays(7).plusMonths(1).plusYears(2);
		
		//subtracting 3 weeks
		LocalDate finalDate=newDate.minusWeeks(3);
		
		System.out.println("The final date is: "+finalDate);
		input.close();
	}	
}