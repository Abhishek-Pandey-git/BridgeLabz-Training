

public class Clock {
	//colors that i can use
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String ORANGE = "\u001B[38;5;208m";
	
	
    public static void main(String[] args) throws InterruptedException{
		
      
	   //loop to start from 0h and zero minutes
	   
	   int hours=12;
	   
	   for(;hours<13;hours++){
		   
		   for(int minutes=50;minutes<60;minutes++){
			   System.out.println(GREEN+hours+" : "+ORANGE+minutes+RESET);
			   Thread.sleep(500);
		   }
	   }
	    System.out.println(GREEN+hours+" : "+ORANGE+"00"+RESET+RED+"\nPOWER CUT!!!!!"+RESET);
	   
    }
}
