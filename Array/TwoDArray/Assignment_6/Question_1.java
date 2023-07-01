/*
Question 1

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
Example 1:
Input: s = "IDID"
Output:
[0,4,1,3,2]
 */

import java.util.Arrays;

class Question_1{
    public static void main(String[] args) {
            String s = "IDID";
            System.out.println(Arrays.toString(diStringMatch(s))); // [0, 4, 1, 3, 2]
    }
    public static int[] diStringMatch(String s) {
        int curD = s.length(); // curD is MAX
        int curI = 0; // curD is MAX
        int[] res = new int[s.length() + 1]; // Output array of length + 1
        
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'I'){
                res[i] = curI++;
            }else if(s.charAt(i) == 'D'){
                res[i] = curD--;
            }
        }
        res[s.length()] = curI; //or res[i] = curI
        return res;
    }
}