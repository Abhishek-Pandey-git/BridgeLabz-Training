import java.util.Scanner;

//program to remove duplicate characters
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter string: ");
        String str = input.nextLine();
        
        String result=""; //store result here
        
        //check each character
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            //if character not already in result, add it
            if(result.indexOf(ch)==-1)
            {
            result=result+ch;
            }
        }
        
        //print final string
        System.out.println("string without duplicates: "+result);
        
        input.close();
    }
}
