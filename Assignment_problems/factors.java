package com.posh;

import java.util.ArrayList;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        boolean[] arr = new boolean[n+1];
        factors2(n);
//        for (int i = 1; i < arr.length ; i++) {
//            if (arr[i]){
//                System.out.println(i);
//            }
//        }
    }

    static void factors(int n,boolean[] arr){
        int i=1;
        while(i*i <n){
            if (n%i==0){
                arr[i] = true;
                arr[n/i] = true;
            }
            i++;
        }
    }

    static void factors2(int n){
        int i=1;
        ArrayList<Integer> list = new ArrayList<>();
        while(i*i <n){
            if (n%i==0){
                 if (i==n/i){
                     System.out.print(i+" ");
                 }
                 else{
                     System.out.print(i+" ");
                     list.add(n/i);
                 }
            }
            i++;
        }
        for (int j = list.size()-1; j >=0; j--) {
            System.out.print(list.get(j)+" ");
        }
    }
}

