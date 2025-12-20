import java.util.Scanner;

// Q8. Program to find the youngest and tallest friends among Amar, Akbar and Anthony
public class YoungestAndTallestFriend {
    
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int youngestIndex = 0;
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        
        return names[youngestIndex];
    }
    
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int tallestIndex = 0;
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        
        return names[tallestIndex];
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            
            System.out.println("Enter height of " + names[i] + " (in feet): ");
            heights[i] = input.nextDouble();
        }
        
        String youngest = findYoungest(names, ages);
        
        String tallest = findTallest(names, heights);
        
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
        
        input.close();
    }
}
