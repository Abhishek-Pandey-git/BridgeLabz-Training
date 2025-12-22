import java.util.Scanner;


public class CompareStrings {

    //Function to compare string using chrAt()
    public boolean compareUsingCharAt(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // Scanner object to read input
        Scanner input=new Scanner(System.in);

        //Taking input
        System.out.println("Enter a string: ");
        String str1=input.next();
        System.out.println("Enter another String: ");
        String str2=input.next();
        // making object to call comparing function
        CompareStrings ob=new CompareStrings();

        if(str1.equals(str2)== ob.compareUsingCharAt(str1, str2)){
            System.out.println("Both method gives same output as: "+ str1.equals(str2));
        }
        else{
            System.out.println("The output of both function is not same: \ncharAt(): "+ob.compareUsingCharAt(str1, str2)
                                +" \n.equals: "+str1.equals(str2));
        }
        input.close();

    }  

}

