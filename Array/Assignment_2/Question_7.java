/*
Question 7
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true
 */

class Question_7 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));//true
    }

    public static boolean isMonotonic(int[] nums) {
        if (checkMI(nums) || checkMD(nums)) {
            return true;
        }
        return false;
    }

    public static boolean checkMI(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if (nums[i] > nums[j])
                return false;
        }
        return true;
    }

    public static boolean checkMD(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if (nums[i] < nums[j])
                return false;
        }
        return true;
    }
}