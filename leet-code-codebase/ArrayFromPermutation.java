
/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length
where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
LINK:https://leetcode.com/problems/build-array-from-permutation/description/?envType=problem-list-v2&envId=array
*/

public class ArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayFromPermutation solution = new ArrayFromPermutation();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
