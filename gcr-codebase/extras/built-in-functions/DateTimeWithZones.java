import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Set;

public class DateTimeWithZones{
	public static void main(String[] args){
		ZonedDateTime zonedt=ZonedDateTime.now();
		
		//Printing time for GMT
		ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("Time in GMT: "+gmt);
		
		//printing time for ist
		ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Time in ist: "+ist);
		
		//printing in Pacific
		ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Time in pst: "+pst);
	}	
}