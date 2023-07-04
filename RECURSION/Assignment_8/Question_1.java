/*
Question 1

Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.
Example 1:
Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
 */
class Question_1{
    public static void main(String[] args) {
        String s1 = "sea", s2 = "eat";
        System.out.println(minimumDeleteSum(s1, s2)); //231
    }
    public static int minimumDeleteSum(String s1, String s2){
        return minSum(0,0,s1,s2);
    }
    
    public static int minSum(int i,int j,String s1,String s2){
        if(i == s1.length() && j == s2.length()){
            return 0;
        }
        else if(i<s1.length() && j == s2.length()){
            int curr = 0;
            for(int idx = i;idx<s1.length();idx++){
                curr += s1.charAt(idx);
            }
            return curr;
        }
        else if(j<s2.length() && i == s1.length()){
            int curr = 0;
            for(int idx = j;idx<s2.length();idx++){
                curr += s2.charAt(idx);
            }
            return curr;
        }
        
        if(s1.charAt(i) == s2.charAt(j)){
            return minSum(i+1,j+1,s1,s2);
        }
        else{
            int first = (int)(s1.charAt(i)) + minSum(i+1,j,s1,s2);
            int second = (int)(s2.charAt(j)) + minSum(i,j+1,s1,s2);
            
            return Math.min(first,second);
        }
    }
}
