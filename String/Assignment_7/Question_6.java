/*
Question 6

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
Example 1:
Input: s = "abcde", goal = "cdeab"
Output:
true
 */
class Question_6{
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal)); // true
    }
    public static boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        for(int i = 1 ; i<s.length();i++){
            s = shift(s);
            if(goal.equals(s)) return true;
        }
        return false;
    }
    public static String shift(String s){
        String lastChar = s.substring(s.length() - 1);
        String firstPart = s.substring(0,s.length() - 1);
        s = lastChar + firstPart;
        return s;
    }
}