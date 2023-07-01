/*
Question 5

The product sum of two equal-length arrays a and b is equal to the sum of a[i] * b[i] for all 0 <= i < a.length (0-indexed).
For example, if a = [1,2,3,4] and b = [5,2,3,1], the product sum would be 1*5 + 2*2 + 3*3 + 4*1 = 22.
Given two arrays nums1 and nums2 of length n, return the minimum product sum if you are allowed to rearrange the order of the elements in nums1.
Example 1:
Input: nums1 = [5,3,4,2], nums2 = [4,2,2,5]
Output: 40
Explanation:
We can rearrange nums1 to become [3,5,4,2]. The product sum of [3,5,4,2] and [4,2,2,5] is 3*4 + 5*2 + 4*2 + 2*5 = 40.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Question_5{
    public static void main(String[] args) {
        int[] nums1 = {5,3,4,2} , nums2 = {4,2,2,5};
        System.out.println(minProductSum(nums1,nums2)); // 40
    }
    public static int minProductSum(int[] nums1, int[] nums2) {
        int ans = 0;
        Arrays.sort(nums1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums2){
            pq.add(num);
        }

        int i = 0;
        while(i < nums1.length && !pq.isEmpty()){
            ans += nums1[i] * pq.poll();
            i++;
        }
        return ans;
    }
}