import java.util.Scanner;

public class CurrencyExchange {
	
	//Questions Array
	
	
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String ORANGE = "\u001B[38;5;208m"; 
	
	
    public static void main(String[] args) {
		
      Scanner input=new Scanner(System.in);
	  
	  //do while loop for continuous input
	  boolean runAgain=false;
	  
	  do{
		  System.out.println("Enter currency in INR: ");
		  double moneyInInr=input.nextDouble();
		  
		  System.out.println("Enter your choice: ");
		  System.out.printf("%-20s %-20s %-20s %-20s", "1: USD", "2: EUR", "3: PAK", "Default: No Exchange");
		  int choice=input.nextInt();
		  
		  //var for proper formatting
		  String topLine = "┌─────────────────────────────┐";
		  String headerFormat = "│ %12s │ %12s │%n";
		  String rowFormat    = "│ %12.2f │ %12.2f │%n";
		  String bottomLine ="└─────────────────────────────┘";

		  
		  //advanced switch for value returning
		  double moneyExchanged=switch(choice){
			  case 1->{ 
				System.out.println(topLine);
				System.out.printf(headerFormat, "INR", "USD");
				System.out.println(bottomLine);
				yield moneyInInr * 0.011;
				}
				 case 2->{ 
				System.out.println(topLine);
				System.out.printf(headerFormat, "INR", "EUR");
				System.out.println(bottomLine);
				yield moneyInInr * 0.0095;
				}
				 case 3->{ 
				System.out.println(topLine);
				System.out.printf(headerFormat, "INR", "PAK");
				System.out.println(bottomLine);
				yield moneyInInr * 3.12;
				}
				
				default->{System.out.println("No Exchange");
				yield moneyInInr;}
				
				
				
		  };
				System.out.printf(rowFormat,moneyInInr,moneyExchanged);
				System.out.println(bottomLine);
				System.out.println();
				System.out.println("Do you want to perform another exchange: \n 1. Yes\t 2.No");
				int runAgainChoice=input.nextInt();
				if(runAgainChoice==1){
					runAgain=true;
				}
				else{
					runAgain=false;
				}
	  }
	  while(runAgain==true);
	   
	  System.out.println("Thankyou for using our software");
	  
    }
}
