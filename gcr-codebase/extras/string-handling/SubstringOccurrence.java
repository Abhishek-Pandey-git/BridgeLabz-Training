import java.util.Scanner;

public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Taking input
        System.out.println("Enter a string: ");
        String str=input.nextLine();
        System.out.println("Enter a substring to match: ");
        String substr=input.nextLine();

        //initializing counter variable
        int count=0;
        //checking for each index as allowing operlapping
        for(int i=0;i<=str.length()-substr.length();i++){
            if(str.substring(i,i+substr.length()).equals(substr)){
                count++;
            }
        }

        System.out.println("The substring "+substr+ "apears "+count+" times inside "+str);
        input.close();
    }
}
