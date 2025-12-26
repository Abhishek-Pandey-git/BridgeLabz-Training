import java.util.Scanner;

//program to reverse a string
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter string: ");
        String str = input.nextLine();
        
        String reversed=""; //empty string for result
        
        //start from last character and go backwards
        for(int i=str.length()-1; i>=0; i--)
        {
        reversed=reversed+str.charAt(i); //add each character
        }
        
        //display reversed string
        System.out.println("reversed string: "+reversed);
        
        input.close();
    }
}
