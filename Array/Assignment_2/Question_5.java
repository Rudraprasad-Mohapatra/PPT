/*
 Question 5
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
 */



class Question_5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maximumProduct(nums));//6
    }

    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int n : nums) {
            // Find the min1 and min2
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }

            // find the max1,max2 and max3
            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }

        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}