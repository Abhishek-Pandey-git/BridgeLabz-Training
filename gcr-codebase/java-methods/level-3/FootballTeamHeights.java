import java.util.Random;

// Q1. Program to find shortest, tallest, and mean height of football team players
public class FootballTeamHeights {
    
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }
    
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        double mean = (double) sum / heights.length;
        return mean;
    }
    
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
    
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        
        System.out.println("Player Heights (in cms):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        
        int sum = findSum(heights);
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);
        
        System.out.println("\nSum of all heights: " + sum + " cm");
        System.out.println("Mean height: " + meanHeight + " cm");
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
