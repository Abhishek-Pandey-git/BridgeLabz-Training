import java.util.Scanner;

// Q8. Program to generate and validate unique OTP numbers
public class OTPGenerator {
	
	public static int generateOTP(){
		int otp=(int)(Math.random()*900000)+100000;
		return otp;
	}
	
	public static boolean areOTPsUnique(int[] otps){
		for(int i=0;i<otps.length;i++){
			for(int j=i+1;j<otps.length;j++){
				if(otps[i]==otps[j]){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int[] otps=new int[10];
		
		System.out.println("Generating 10 OTP numbers...\n");
		
		for(int i=0;i<10;i++){
			otps[i]=generateOTP();
			System.out.println("OTP "+(i+1)+": "+otps[i]);
		}
		
		boolean unique=areOTPsUnique(otps);
		
		System.out.println("\n--- Validation Result ---");
		if(unique){
			System.out.println("All OTP numbers are UNIQUE");
		}
		else{
			System.out.println("OTP numbers are NOT UNIQUE - Duplicates found");
		}
		
		input.close();
	}
}
