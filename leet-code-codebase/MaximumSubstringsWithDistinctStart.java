// LINK: https://leetcode.com/problems/maximum-substrings-with-distinct-start/description/?envType=problem-list-v2&envId=array

public class MaximumSubstringsWithDistinctStart {
     public int maxDistinct(String s) {
        int[] freq=new int[26];
        for(int i=0; i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaximumSubstringsWithDistinctStart solution = new MaximumSubstringsWithDistinctStart();
        String s = "abacaba";
        int result = solution.maxDistinct(s);
        System.out.print(result + " ");
    }
}
