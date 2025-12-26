import java.util.Scanner;

//program to remove specific character
public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter string: ");
        String str = input.nextLine();
        
        System.out.println("enter character to remove: ");
        char charToRemove=input.next().charAt(0);
        
        String result=""; //store modified string
        
        //loop through string
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            //add character only if it's not the one to remove
            if(ch!=charToRemove)
            {
            result=result+ch;
            }
        }
        
        System.out.println("Modified String: "+result);
        
        input.close();
    }
}
