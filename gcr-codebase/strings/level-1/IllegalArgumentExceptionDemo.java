
import java.util.Scanner;
public class IllegalArgumentExceptionDemo {

    //Method to generate exception
    public static void generateException(String str){
        String str1=str.substring(5,1);
        System.out.println(str1);

    }

    //method with handling excpetion
    public static void handleException(String str){

        //using try catch block
        try{
            String str1=str.substring(5,1);
            System.out.println(str1);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("The program continues");


    }
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);

        //Taking input
        System.out.println("Enter any string: ");
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
