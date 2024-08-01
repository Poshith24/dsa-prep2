package com.posh;

import java.util.Scanner;

public class Magic_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
//        int[] arr={0,0,0,0,0,0,0,0};
//        Binary_convert(arr,n);
//        Magic_number(arr);
//        Magic_number2(n);
        no_of_digits_rep(n);
    }


    static void Binary_convert(int[] arr,int n){
        int i=7;
        while(n>0){
            if (n==1){
                arr[i] =1;
                break;
            }
            arr[i] = n%2;
            i--;
            n=n/2;
        }
    }

    static void Magic_number(int[] arr){
        int magic=0;
        for (int j = 0; j < arr.length; j++) {
            magic+=arr[j]* power_of_5(arr.length-j);
        }
        System.out.println(magic);
    }
    static void no_of_digits_rep(int n){
        int a=0;
        while(n>=0){
            if (n==0){
                System.out.println(a);
                break;
            }
            a++;

            n=n>>1;
        }
    }
    static void Magic_number2(int n){
        int a=0;
        int base=5;
        while(n>0){
            int last = n&1;
            a+=last * base;
            base *=5;
            n=n>>1;
        }
//        for (int i = 0; i < 8; i++) {
//             if((n&1)==1){
//                 a+=power_of_5(i+1);
//             }
//           n = n>>1;
//        }
        System.out.println(a);
    }
    static int power_of_5(int n){
        int ans=1;
        for (int i = 1; i <=n ; i++) {
            ans*=5;
        }
        return ans;
    }
}
