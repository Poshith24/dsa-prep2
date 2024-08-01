package com.posh.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr= new int[5];

        arr[0]=99;
        arr[1]=23;
        arr[2]=48;
        arr[3]=105;
        arr[4]=343;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
                arr[i]=in.nextInt();
        }
        for (int j : arr) { // for every elemnt in the array ,print the element
            System.out.print(j + " "); //here j represents element of the array.
        }

        String[] str = new String[5];

        for (int i =0;i<str.length;i++){
            str[i] = in.next();
        }
        for(String i:str){
            System.out.print(i+" ");
        }

    }
}
