
/*
 Q6. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
 */
import java.util.*;

class Question_6 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));//true
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> newarr = new HashSet<Integer>();
        try {
            for (int i = 0; i < nums.length; i++) {
                if (newarr.contains(nums[i]))
                    return true;
                newarr.add(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        return false;
    }
}
