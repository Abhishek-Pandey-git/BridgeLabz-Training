/*
You are given a string s. The score of a string is defined
 as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s. */

public class StringScore {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs(((int)s.charAt(i))-((int)s.charAt(i+1)));
        }
        return sum;
    }
    public static void main(String[] args) {
        StringScore stringScore = new StringScore();
        String s = "abc";
        int result = stringScore.scoreOfString(s);
        System.out.println("Score of the string: " + result);
    }
}
