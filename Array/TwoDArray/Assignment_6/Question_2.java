/*
Question 2


You are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.
Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
 */
class Question_2{
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; 
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
    // m = no. of rows
    // n = no.of cols
    int m = matrix.length; 
    int n = matrix[0].length;

    int start = 0,midInd = 0,end = (m * n) - 1;
    while(start <= end){
        midInd = start + (end - start) / 2;
        int row = midInd / n; //row mens division (r & d) 
        int col = midInd % n; //col means percentile (C & p)
        if(matrix[row][col] == target) return true;
        else if(matrix[row][col] > target) end  = midInd - 1;
        else
            start = midInd + 1;
    } 
    return false;
    }
}