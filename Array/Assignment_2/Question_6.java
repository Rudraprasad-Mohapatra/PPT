/*
Question 6
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise,
return -1.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Explanation: 9 exists in nums and its index is 4
 */

class Question_6 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(search(nums, target)); //4
    }

    public static int search(int[] nums, int target) {
        int lb = 0, ub = nums.length - 1, mid;
        while (lb <= ub) {
            mid = lb + (ub - lb) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                ub = mid - 1;
            } else
                lb = mid + 1;
        }
        return -1;
    }
}