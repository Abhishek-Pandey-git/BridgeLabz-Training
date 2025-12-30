/*
6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class SmartParkingGate {
	//counter variable to count the number of parking slots full
	public static int currentlyOccupied=0;
	
	
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		//Taking input from user
		System.out.println("Enter maximum capacity of parking lot: ");
		int capacity=input.nextInt();
		
		//while loop to continue the oarking and exiting
		while(capacity!=currentlyOccupied){
			System.out.println("Enter 1 to park\t Enter 2 to check Occupancy\t Enter 3 to Exit parking\t Enter 4 to Exit program");
			int userCommand=input.nextInt();
			boolean wantToExit=false;
			
			//switch case to match user input and perform task
			switch (userCommand){
				//case checking for parking
				case 1:
					
					System.out.println("Parked");
					currentlyOccupied++;
					
					break;
				
				//case checkong for checking space left or occupied
				case 2:
					System.out.println("currently Occupied: "+currentlyOccupied+"\t Parking left: "+(capacity-currentlyOccupied));
					break;
				
				case 3:
					if(currentlyOccupied==0){
						System.out.println("The parking is already Empty: ");
					}
					else{
						System.out.println("Exited the Parking");
						currentlyOccupied--;
					}
					break;
				
				case 4:
					System.out.println("Thankyou for Using the Parking!!");
					wantToExit=true;
					break;
				default:
					System.out.println("Invalid input. Try Again!!!!");
					break;
			}
			
			
			if(wantToExit==true){
				System.out.println("Exiting...");
				break;
			}
			
		}
		System.out.println("All Parking slots are full. Thankyou");
        
        input.close();
    }
}
