/*
Given two sparse matrices mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.
Example 1:


Input: mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]
Output:
[[7,0,0],[-7,0,3]]
 */

import java.util.Arrays;

class Question_8{
    public static void main(String[] args) {
        int[][] mat1 = {{1,0,0},{-1,0,3}}, mat2 = {{7,0,0},{0,0,0},{0,0,1}};
        
        for(int[] row: multiply(mat1,mat2)){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] multiply(int[][] A, int[][] B) {

        //validity check
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < C.length; i++) {
            for (int k = 0; k < A[0].length; k++) {
                if (A[i][k] != 0) { // @note: non-zero check. if zero, then skip since result will be 0
                    for (int j = 0; j < C[0].length; j++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }

        return C;
    }
}