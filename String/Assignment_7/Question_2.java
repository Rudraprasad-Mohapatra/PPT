/*
Question 2

Given a string num which represents an integer, return true if num is a strobogrammatic number.
A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
Example 1:
Input: num = "69" 
Output:
true          
 */
class Question_2{
    public static void main(String[] args) {
        String num = "69";
        System.out.println(isStrobogrammatic(num)); // true
    }
    public static boolean isStrobogrammatic(String num) {
        if(num == null || num.length() == 0) return false;
        if(num.length() == 1 && (num.equals("1") || num.equals("0") || num.equals("8"))) return true;
        int l = 0, r = num.length() - 1;
        while(l <= r){
            if(num.charAt(l) == num.charAt(r)){
                if(num.charAt(l) == '1' || num.charAt(l) == '0' || num.charAt(l) == '8') return true;
            }else{
                if((num.charAt(l) == '6' && num.charAt(r) == '9') || (num.charAt(l) == '9' && num.charAt(r) == '6')) return true;
            }

            l++;
            r--;
        }

        return false;
    }
}