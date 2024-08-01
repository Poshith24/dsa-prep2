package com.posh;

import java.util.Arrays;

public class BinarySearchin2D {
    public static void main(String[] args) {

        int[][] arr={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12,},
                {13,14,15,16}};
       int[] a= BinarySearch(arr,7 );
        System.out.println(Arrays.toString(a));
    }

    static int[] BinarySearch(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        int[] a={-1,-1};
        while (r<arr.length && c>=0){
            if (arr[r][c]==target){
                a[0]=r;
//                 a[1]=c;
//                 break;
                return new int[]{r,c};
            }
            else if (arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }

        }
        return new int[]{-1,-1};
    }
}
