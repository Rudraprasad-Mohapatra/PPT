/*
Question 3

Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
Example 1:
Input: num1 = "11", num2 = "123"
Output:
"134"
 */
class Question_3{
    public static void main(String[] args) {
        String num1 = "11", num2 = "123"; // 134
        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        int n1 = num1.length() - 1,n2 = num2.length() - 1;
        int sum = 0;
        int maxLen = Math.max(num1.length(),num2.length())+1;
        char res[] = new char[maxLen];
        while(n1 >= 0 || n2 >= 0){ //If either of them has value at position
            if(n1 >= 0) sum += num1.charAt(n1) - '0';
            if(n2 >= 0) sum += num2.charAt(n2) - '0';
            res[--maxLen] = (char)((sum % 10) + '0');
            sum /= 10;
            n1--;
            n2--;
        }
            if(sum != 0){
                res[0] = '1';
                return String.valueOf(res);
            }
            return String.valueOf(res,1,res.length-1);
    }
}