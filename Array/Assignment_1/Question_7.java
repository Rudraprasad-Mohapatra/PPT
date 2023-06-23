/*
Q7.Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
import java.util.*;
class Question_7{
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes( nums);
        System.out.println(Arrays.toString(nums)); //[1, 3, 12, 0, 0]
    }
    public static void moveZeroes(int[] nums) {
    int i = 0;//Track the index from start such that start index are always non Zero and inorder

    // Now start traversing from index 0 when you face an non zero elemnet for 1st time move it to i=0th index i.e swap with i th element and then increment i by 1
    for(int j=0;j<nums.length;j++){
        if(nums[j] != 0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
    }
    }
}
