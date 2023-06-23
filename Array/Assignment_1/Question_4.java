/*
 Q4. You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */

import java.util.*;

class Question_4 {
    public static void main(String[] args) {
        int[] digits = {9,9};
        System.out.println(Arrays.toString(plusOne(digits)));//[1, 0, 0]
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) { // 1.cases like 12,13,54 etc.
                digits[i]++;
                return digits;
            } else { // if digits[i] = 9, 2.cases like 19,199,239
                digits[i] = 0;
            }
        }
        // 3.Cases like 9,99,999
        digits = new int[digits.length + 1]; // by default all elements in array initialized with zero
        digits[0] = 1;
        return digits;
    }
}
