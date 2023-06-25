/*
Question 8
You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 */



class Question_8 {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        System.out.println(smallestRangeI(nums, k)); //0
    }
    public static int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int  i =0;i<nums.length;i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        int res = (max-k) - (min+k);
        return res > 0 ? res : 0;
    }
}