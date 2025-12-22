import java.util.Scanner;

public class CharArrayComparison {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input from user
        System.out.println("Enter a string:");
        String text = input.next();
        
        // calling user defined method to get character array
        char[] arr1 = getCharactersFromString(text);
        System.out.println("Characters using user-defined method:");
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        
        // using built-in method
        char[] arr2 = text.toCharArray();
        System.out.println("Characters using toCharArray():");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        
        // comparing both arrays
        boolean isEqual = compareCharArrays(arr1, arr2);
        
        if(isEqual) {
            System.out.println("\nBoth arrays are same!");
        } else {
            System.out.println("\nBoth arrays are different!");
        }
        
        input.close();
    }
    
    
    // method to convert string to character array without using toCharArray
    public static char[] getCharactersFromString(String str) {
        char[] charArray = new char[str.length()];
        
        // loop through string and add each character to array
        for(int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        
        return charArray;
    }
    
    
    // method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        // first check if lengths are same
        if(array1.length != array2.length) {
            return false;
        }
        
        // compare each element
        for(int i = 0; i<array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
}
