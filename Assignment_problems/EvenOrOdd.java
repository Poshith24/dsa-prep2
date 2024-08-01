package com.posh;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
        }
        int j=0;
        while(CheckEven(a)){
            for (int i = 0; i < a.length; i++) {
                a[i]/=2;
            }
            j++;
        }
        System.out.println(j);
    }

    static boolean CheckEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]&1) == 1){
                return false;
            }
        }
        return true;
    }
}
