// LINK: https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/?envType=problem-list-v2&envId=array

import java.util.*;
public class TheTwoSneakyNumbersOfDigitville {
     public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> st=new HashSet<>();
        int[] ans=new int[2];
        int index=0;
        for(int i=0;i<nums.length;i++){
            boolean it=st.add(nums[i]);
            if(it==false){
                ans[index]=nums[i];
                index++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        TheTwoSneakyNumbersOfDigitville solution = new TheTwoSneakyNumbersOfDigitville();
        int[] nums = {1, 2, 3, 2, 4, 5, 1};
        int[] result = solution.getSneakyNumbers(nums);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
