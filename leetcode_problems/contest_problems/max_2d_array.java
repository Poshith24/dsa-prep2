package com.posh.leetcode_problems.contest_problems;

public class max_2d_array {
    public static int[][] modifiedMatrix(int[][] matrix) {

        int[] max = new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            int max_val = Integer.MIN_VALUE+1;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>max_val){
                    max_val = matrix[j][i];
                }
            }
            max[i] = max_val;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i]==-1){
                    matrix[j][i] = max[i];
                }
            }
        }
//        for(int i=0;i<max.length;i++){
//            System.out.print(max[i]+" ");
//        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,-1},
                {4,-1,6},
                {7,8,9}
        };
       int[][] x =  modifiedMatrix(arr);
    }
}
