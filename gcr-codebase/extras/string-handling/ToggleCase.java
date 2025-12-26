import java.util.Scanner;

//program to toggle case of characters
public class ToggleCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("enter string: ");
        String str=input.nextLine();
        
        String result=""; //store toggled string
        
        //loop through each character
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            //if uppercase convert to lowercase
            if(ch>='A' && ch<='Z')
            {
                result=result+(char)(ch+32);
            }
            //if lowercase convert to uppercase
            else if(ch>='a' && ch<='z')
            {
            result=result+(char)(ch-32);
            }
            else
            {
                result=result+ch; //keep other characters same
            }
        }
        
        System.out.println("toggled string: "+result);
        
        input.close();
    }
}
