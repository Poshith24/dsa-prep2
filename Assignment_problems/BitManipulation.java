package com.posh.Assignment_problems;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;
         while(n!=0){
             if ((n&1)==0){
                 count++;
             }
             n>>=1;
         }
        System.out.println(count);
    }
}
