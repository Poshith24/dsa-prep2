package com.posh;

public class Digits {
    public static void main(String[] args) {
        int[] arr={18,124,9,1764,98,1};
        int digi_count=0;
        System.out.println(digit2(-345789));

        for (int j : arr) {
            int k = digit(j);
            if (k % 2 == 0) {
                digi_count++;

            }
        }
        System.out.println(digi_count);
    }

    static int digit2(int n){
        if(n<0){
            n=n*-1;
        }
        if(n==0){
            return 1;
        }
        return (int)(Math.log10(n))+1;
    }
    static int digit(int n){

        int count=0;

        if(n<0){
            n=n*-1;
        }
        if(n==0){
            return 1;

        }
        while(n>0){
            int rem=n%10;
            n=n/10;
            count++;
        }
        return count;


    }
}
