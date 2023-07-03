/*
Question 5

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
Example 1:
Input: s = "abcdefg", k = 2
Output:
"bacdfeg"
 */
class Question_5 {
    public static void main(String[] args) {
        String s = "a";
        int k = 2;
        System.out.println(reverseStr(s, k)); // bacdfeg
    }

    public static String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int end = Math.min(start + k - 1, a.length - 1);
            // reverse
            int i = start, j = end;
            while (i < j) {
                char temp = a[i];
                a[i++] = a[j];
                a[j--] = temp;
            }
        }
        return new String(a);
    }
}