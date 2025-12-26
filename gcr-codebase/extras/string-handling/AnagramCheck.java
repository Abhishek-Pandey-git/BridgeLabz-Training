import java.util.Scanner;

//program to check if two strings are anagrams
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter first string: ");
        String str1=input.nextLine();
        
        System.out.println("enter second string: ");
        String str2=input.nextLine();
        //check for length
        if(str1.length()!=str2.length()){
            System.out.println("not anagrams");
            input.close();
            return;
        }
        //create frequency array of size 256 for ASCII characters
        int[] frequency=new int[256];
        
        //initialize all values to 0
        for(int i=0;i<256;i++)
        {
            frequency[i]=0;
        }
        
        //increment for each character in first string
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            frequency[ch]++;
        }
        
        //decrement for each character in second string
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
        frequency[ch]--;
        }
        
        //check if all values are zero
        boolean isAnagram=true;
        for(int i=0;i<256;i++)
        {
            if(frequency[i]!=0)
            {
                isAnagram=false;
                break;
            }
        }
        
        if(isAnagram)
        {
            System.out.println("anagrams");
        }
        else
        {
        System.out.println("not anagrams");
        }
        
        input.close();
    }
}
