package com.posh;
import java.lang.Math;
public class fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fib_formula(i));
        }
//        System.out.println(fib_formula(3));

        System.out.println(fib_formula(50));

    }

    static long fib_formula(int n){
       return (long)((Math.pow(( 1+ Math.sqrt(5))/2,n) -  Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
    }

    static int fib_iterative(int n){
        int[] arr = new int[n+1];
        arr[0] =0;
        arr[1] = 1;
        for (int i = 2; i <=n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    static int fib(int n){

        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
