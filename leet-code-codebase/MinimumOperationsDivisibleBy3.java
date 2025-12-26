/*
You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

Return the minimum number of operations to make all elements of nums divisible by 3.
*/

public class MinimumOperationsDivisibleBy3 {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for (int i = 0; i < nums.length; i++) {
            int remainder = nums[i] % 3;
            if (remainder != 0) {
                operations++;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        MinimumOperationsDivisibleBy3 solution = new MinimumOperationsDivisibleBy3();
        
        int[] nums = {1, 2, 3, 4};
        int result = solution.minimumOperations(nums);
        System.out.println("Minimum operations: " + result);
    }
}
