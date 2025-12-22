import java.util.Scanner;

public class NumberFormatExceptionDemo {

    //method to generate the exception
    public static void generateException(String str){
        int number=Integer.parseInt(str);
        System.out.println(number);
    }

    //method to handle the exception
    public static void handleException(String str){
        //using try catch
        try{
            int number=Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException e){
            System.err.println("Error: "+e.getMessage()+"\ncannot parse an alphabet to integer");
        }
        catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
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
