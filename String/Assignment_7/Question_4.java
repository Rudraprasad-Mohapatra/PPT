/*
Question 4

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */
class Question_4{
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // s'teL ekat edoCteeL tsetnoc
    }
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end;
        for(end = 0; end <= chars.length; end++){
            if(end == chars.length || chars[end] == ' '){ //Sequence matters in or operator
                reverse(chars,start,end - 1);
                start = end + 1;
            }
        }
        return new String(chars);
    }
    public static void reverse(char[] chars,int start,int end){
        int i = start,j = end;
        while(i < j){
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
    }
}