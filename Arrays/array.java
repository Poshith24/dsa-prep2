package com.posh.Arrays;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        System.out.println(4%5);
        int[] rollno= new int[5];
        System.out.println(Arrays.toString(rollno));

        int[] ros; //declaration of array ros is getting defined in stack.
        ros=new int[5]; // intialisation : actually here object is being created in the memory(heap).

        String[] arr=new String[4];
        System.out.println(arr[3]);

        String str=null;

        int[] b = {1,2,3,4,5};

        for(int i:b){
            System.out.print(i+" ");
        }

//        int a=null;
    }
}
