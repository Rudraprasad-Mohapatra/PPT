/*
Question 1

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
Example 1:
Input: s = "egg", t = "add"
Output: true
 */

import java.util.HashMap;
import java.util.Map;

class Question_1 {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t)); //true
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        if (s.length() == 1 && t.length() == 1)
            return true;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (map.containsKey(ch1)) {
                if (map.get(ch1).equals(ch2))
                    continue;
                else
                    return false;
            } else {
                if (map.containsValue(ch2))
                    return false;
                else
                    map.put(ch1, ch2);
            }
        }
        return true;
    }
}