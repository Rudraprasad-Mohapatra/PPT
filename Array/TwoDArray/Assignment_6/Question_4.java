/*

Question 4

Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Example 1:
Input: nums = [0,1]
Output: 2
Explanation:
[0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
 */

import java.util.HashMap;
import java.util.Map;

class Question_4{
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(findMaxLength(nums)); // 2
    }
    public static int findMaxLength(int[] nums) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer,Integer> map  = new HashMap<>();
        map.put(0,-1); // When My index = -1 , sum = 0 i.e. when I am not traversing the array sum = 0 and I am at index -1.
        // Every
        for(int i = 0;i < nums.length;i++){
            int currIndex = i;
            // Calculate the sum during traverse
            if(nums[i] == 0) sum += (-1);
            else sum += 1;
            
            if(map.containsKey(sum)) {
                int firstIndexOfNum = map.get(sum);
                maxLen = Math.max(maxLen,currIndex - firstIndexOfNum);
                }
            else map.put(sum,currIndex);    
        }
        return maxLen;
    }
}