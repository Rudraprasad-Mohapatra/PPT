/*
Q3. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
*/

class Question_3 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 8;
        System.out.println(searchInsert(nums,target));//4
    }
    public static int searchInsert(int[] nums, int target) {
        int lb = 0,ub = nums.length-1;
        int mid = 0;
        while(lb <= ub){
            mid = lb +((ub-lb))/2;
            if(target == nums[mid]) 
                return mid;
            else if(target < nums[mid])
                ub = mid - 1;    
            else 
                lb = mid + 1;    
        } 
        return lb;
    }
}
