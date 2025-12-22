import java.util.Scanner;

public class NullPointerExceptionDemo {

     // method to generate NullPointerException
    public static void generateException() {
        String text = null;
        
        // trying to call string method on null - this will throw exception
        int len = text.length();
        System.out.println("Length is: " + len);
    }
    
    
    // method to demonstrate handling NullPointerException
    public static void handleException() {
        String text = null;
        
        try {
            // trying to access string method on null variable
            int len = text.length();
            System.out.println("Length is: " + len);
        }
        catch(NullPointerException e) {
            System.out.println("Error: NullPointerException occurred!");
            System.out.println("The string is null, cannot perform operations on it");
        }
        
        System.out.println("Program continues after handling exception...");
    }
    
    public static void main(String[] args) {
        
        // First calling method that generates exception
        System.out.println("Calling method that generates exception:");
        // generateException();  // uncomment this to see the exception
        
        
        // Now calling method that handles exception
        System.out.println("Calling method that handles exception:");
        handleException();
        
    }
    
    
   
    
}
