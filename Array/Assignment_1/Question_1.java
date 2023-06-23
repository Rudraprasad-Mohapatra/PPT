
/*
Q1. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example:
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 */
import java.util.*;

class Question_1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int[] arr = twoSum(nums, 9);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) { 
        Map<Integer,Integer> map = new HashMap<>(); 
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target - nums[i]))
                return new int[] {i,map.get(target - nums[i])};
            else
                map.put(nums[i],i);    
        }
        return new int[]{-1,-1};
    }
}
