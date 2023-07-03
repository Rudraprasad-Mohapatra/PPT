/*
Question 7

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation:
Both s and t become "ac".
 */

import java.util.Stack;

class Question_7{
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(build(s).equals(build(t))); // true
    }

    public static String build(String s){
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i != '#') st.push(i);
            else if(!st.isEmpty()) st.pop();
        }
        return String.valueOf(st);
    }
}