
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
a. 1 <= nums.length <= 10^4
b. -2^31 <= nums[i] <= 2^31 - 1
 */
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroesFromArray(nums);
        System.out.println(Arrays.toString(nums)); // [1, 3, 12, 0, 0]
    }

    public static void moveZeroesFromArray(int[] nums) {
        int ptr1 = 0;
        for (int ptr2 = 0; ptr2 < nums.length; ptr2++) {
            if (nums[ptr2] != 0) {
                // Swap when encounter non zero element
                int temp = nums[ptr1];
                nums[ptr1] = nums[ptr2];
                nums[ptr2] = temp;
                ptr1++; // Keep track of ptr1
            }
        }
    }
}
