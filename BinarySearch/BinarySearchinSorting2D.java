package com.posh;

import java.util.Arrays;

public class BinarySearchinSorting2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] a=Search(arr,6);
        System.out.println(Arrays.toString(a));
    }

    static int[] BinarySearch(int[][] matrix,int rowno,int colStart,int colEnd,int target){
        while(colStart<= colEnd){
            int mid=colStart+(colEnd-colStart)/2;
            if (matrix[rowno][mid]==target){
                return new int[]{rowno,mid};
            }
            if (matrix[rowno][mid]<target){
                colStart=mid+1;
            }
            else{
                colEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] Search(int[][] matrix,int target){

        int rows= matrix.length;
        int cols=matrix[0].length;
        if (rows==1){
           return BinarySearch(matrix,rows,0,cols-1,target);
        }
        int Cmid=cols/2;
        int rowStart=0;
        int rowEnd=rows-1;
        while(rowStart< (rowEnd-1)){
            int mid=rowStart+(rowEnd-rowStart)/2;
            if (matrix[mid][Cmid]==target){
                return new int[] {mid,Cmid};
            }
            if (matrix[mid][Cmid]<target){
                rowStart=mid;
            }
            else
                rowEnd=mid-1;
        }
        if (matrix[rowStart][Cmid]==target){
            return new int[]{rowStart,Cmid};
        }
        if (matrix[rowStart+1][Cmid]==target){
            return new int[]{rowStart+1,Cmid};
        }
        //Binary search in four parts of the remaining two arrays rowStart and rowEnd
        if (target<=matrix[rowStart][Cmid-1]){
           return BinarySearch(matrix,rowStart,0,Cmid-1,target);
        }
        if (target>=matrix[rowStart][Cmid+1] && target<=matrix[rowStart][cols-1]){
            return BinarySearch(matrix,rowStart,Cmid+1,cols-1,target);
        }
        if (target<=matrix[rowStart+1][Cmid-1]){
            return BinarySearch(matrix,rowStart+1,0,Cmid-1,target);
        }
        if (target>=matrix[rowStart+1][Cmid+1] && target<=matrix[rowStart+1][cols-1]){
            return BinarySearch(matrix,rowStart+1,Cmid+1,cols-1,target);
        }
        return new int[]{-1,-1};
    }
}
