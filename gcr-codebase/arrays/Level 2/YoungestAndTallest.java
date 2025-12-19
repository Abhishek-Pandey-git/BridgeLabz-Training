import java.util.Scanner;
//Q2
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // taking input for ages and heights
        for(int i = 0; i < 3; i++){
            System.out.println("\nEnter details for " + names[i] + ":");
            System.out.print("Enter age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();
        }
        
        // finding youngest friend
        int youngestIndex = 0;
        for(int i = 1; i < 3; i++){
            if(ages[i] < ages[youngestIndex]){
                youngestIndex = i;
            }
        }
        
        // finding tallest friend
        int tallestIndex = 0;
        for(int i = 1; i < 3; i++){
            if(heights[i] > heights[tallestIndex]){
                tallestIndex = i;
            }
        }
        
        // displaying results
        System.out.println("\n=== Results ===");
        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");
        
        input.close();
    }
}
