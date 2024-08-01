package com.posh;

import java.util.Scanner;

public class Power_of_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt(); // note: fix for n=0 it's an exception case.
        // simplest way

       if(n>0){
           boolean ans = (n&(n-1))==0;
           System.out.println(ans);
       }

        // simpler way
//
//        int i=1;
//        int count=0;
//
//        while(n>0){
//            if ((n&1) == 1){
//                count++;
//            }
//            i++;
//            n=n>>1;
//
//        }
//        if (count==1){
//            System.out.println("Power of 2");
//        }
    }
}
