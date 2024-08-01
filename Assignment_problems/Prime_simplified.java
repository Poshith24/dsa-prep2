package com.posh;

import java.util.Scanner;

public class Prime_simplified {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        boolean[] arr = new boolean[n+1];
        Prime(n,arr);
    }

    static void Prime(int n,boolean[] arr){

        for (int i = 2; i*i <= n; i++) {

            if (!arr[i]){
                for (int j = 2*i; j <=n; j+=i) {
                    arr[j] =true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if (!arr[i]){
                System.out.println(i+" ");
            }
        }
    }
}
