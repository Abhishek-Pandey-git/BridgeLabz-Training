import java.util.Scanner;

// program to compare two strings
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter first string: ");
        String str1 = input.nextLine();
        
        System.out.println("enter second string: ");
        String str2=input.nextLine();
        
        int len1=str1.length();
        int len2=str2.length();
        int minLen=len1;
        
        //find minimum length
        if(len2<minLen)
        {
            minLen=len2;
        }
        
        int result=0; //0 means equal, -1 means str1 comes first, 1 means str2 comes first
        
        //compare character by character
        for(int i=0;i<minLen;i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            
            if(ch1<ch2)
            {
                result=-1;
                break;
            }
            else if(ch1>ch2)
            {
            result=1;
            break;
            }
        }
        
        //if all characters same check length
        if(result==0)
        {
            if(len1<len2)
            {
                result=-1;
            }
            else if(len1>len2)
            {
                result=1;
            }
        }
        
        //print result
        if(result==-1)
        {
            System.out.println("\""+str1+"\" comes before \""+str2+"\" in lexicographical order");
        }
        else if(result==1)
        {
        System.out.println("\""+str2+"\" comes before \""+str1+"\" in lexicographical order");
        }
        else
        {
            System.out.println("both strings are equal");
        }
        
        input.close();
    }
}
