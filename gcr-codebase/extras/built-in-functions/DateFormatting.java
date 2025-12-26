import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.Scanner;
public class DateFormatting{
	public static void main(String[] args){
		//Extracting the time of the moment
		LocalDate nowTime=LocalDate.now();
		
		//Initializing the formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//formatting for dd/MM/yyyy
		String formattedDate= nowTime.format(formatter);
		System.out.println("Date in format \"dd/MM/yyyy\" is: "+formattedDate);
		
		// formatting for "yyyy-MM-dd"
 		formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String newFormatted= nowTime.format(formatter);
		System.out.println("Date in format \"yyyy/MM/dd\" is: "+newFormatted);
		
		//formatting for EEE, MMM dd, yyyy
		formatter=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		String newFormatted1=nowTime.format(formatter);
		System.out.println("Date in format EEE, MMM dd, yyyy: "+newFormatted1);
		
		
		
		
	}	
}