import java.util.Scanner;

public class ArrayIndexOfBoundDemo {

    //method to generate exception
    public static void generateException(String[] str){
        System.out.println(str[str.length+2]);
    }

    //method to handle exception
    public static void handleException(String[] str){
        //using try catch blocks
        try{
            System.out.println(str[str.length+2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage()+"\nThe program is trying to acceess an index which is out of bounds");

        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        //Taking input
        System.out.println("Enter number of people: ");
        int people=input.nextInt();

        String[] names=new String[people];
        for(int i=0;i<people;i++){
            System.out.println("Enter a name: ");
            names[i]=input.next();
        }
       

       // First calling method that generates exception
        System.out.println("Calling method that generates exception:");
        // generateException(names);  // uncomment this to see the exception
        
        
        // Now calling method that handles exception
        System.out.println("Calling method that handles exception:");
        handleException(names);
        input.close();
    }
}
