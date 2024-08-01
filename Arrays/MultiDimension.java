package com.posh.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
//        int[][] arr= new int[3][];

//        int[] [] arr= {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
//
//        System.out.println(Arrays.toString(arr));

        Scanner in=new Scanner(System.in);
        int[][] arr={
                {1,2,3,4},
                {5,6},
                {7,8,9}
//
        };

//        for (int rowno = 0; rowno < arr.length; rowno++) {
//            for (int colno = 0; colno < arr[rowno].length; colno++) {
//                arr[rowno][colno]=in.nextInt();
//            }
//
//        }

//        for (int rowno = 0; rowno < arr.length; rowno++) {
//            for (int colno = 0; colno < arr[rowno].length; colno++) {
//                System.out.print(arr[rowno][colno]+" ");
//
//            }
//            System.out.println();
//
//        }

        for (int rowno = 0; rowno < arr.length; rowno++) {
            for (int colno = 0; colno < arr[rowno].length; colno++) {
                System.out.print(arr[rowno][colno]+" ");
            }
            System.out.println();

        }

//        for (int rowno = 0; rowno < arr.length; rowno++) {
//            System.out.println(Arrays.toString(arr[rowno]));
//
//
//        }
//        for (int a[] : arr){
//            System.out.println(Arrays.toString(a));
//        }

    }
}
