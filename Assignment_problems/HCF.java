package com.posh;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b = in.nextInt();
        int[] arr = new int[a];
        factor(arr,a);
        int[] brr = new int[b];
        factor(brr,b);
    }



    static void factor(int[] arr,int n){

        int j=0;
        for (int i = 0; i < n; i++) {
            if (n%i==0){
                arr[j] =i;
            }
            else{
                arr[j]=0;
            }
            j++;
        }
    }
}
