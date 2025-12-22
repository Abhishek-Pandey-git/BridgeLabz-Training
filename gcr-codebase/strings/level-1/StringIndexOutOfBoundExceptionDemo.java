
import java.util.Scanner;
public class StringIndexOutOfBoundExceptionDemo {
    
     public static void generateException(String str){
        //calling charAt to make the index out of bound

        char ch=str.charAt(str.length()+2);
        System.out.println(ch);
    }

    public static void handleException(String str){
        //try catch to handle the exception
        try{
            char ch = str.charAt(str.length()+2);
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException e){
            System.err.println("Error: "+e.getMessage());
        }

        System.out.println("Program continues after handling exception...");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Taking input
        System.out.println("Enter anu string: ");
        String str= input.next();

       // First calling method that generates exception
        System.out.println("Calling method that generates exception:");
        // generateException();  // uncomment this to see the exception
        
        
        // Now calling method that handles exception
        System.out.println("Calling method that handles exception:");
        handleException(str);
        input.close();

    }

   
}
