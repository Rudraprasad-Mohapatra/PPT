/*
Question 6

An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.
Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
Example 1:
Input: changed = [1,3,4,2,6,8]
Output: [1,3,4]
Explanation: One possible original array could be [1,3,4]:
Twice the value of 1 is 1 * 2 = 2.
Twice the value of 3 is 3 * 2 = 6.
Twice the value of 4 is 4 * 2 = 8.
Other original arrays could be [4,3,1] or [3,1,4].
 */

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Question_6 {
    public static void main(String[] args) {
        int[] changed = {1,3,4,2,6,8};
        System.out.println(Arrays.toString(findOriginalArray(changed)));
    }

    public static int[] findOriginalArray(int[] A) {
        if (A.length % 2 == 1)
            return new int[0];
        int[] res = new int[A.length / 2];
        Map<Integer, Integer> hm = new TreeMap<>();
        for (int val : A) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }
        int i = 0;
        for (int key : hm.keySet()) {
            if (hm.get(key) > hm.getOrDefault(key * 2, 0)) {
                return new int[0];
            }
            for (int j = 0; j < hm.get(key); ++j) {
                res[i++] = key;
                hm.put(key * 2, hm.get(key * 2) - 1);
            }
        }
        return res;
    }
}