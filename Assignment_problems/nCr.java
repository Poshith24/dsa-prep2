package com.posh;

import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int r = in.nextInt();
        int num=1;
        for (int i = n; i >n-r ; i--) {
            num *= i;
        }
        int den = fac(r);
        int ans = num/den;
        System.out.println(ans);
        System.out.println(ans % 1000003);
    }

    static int fac(int n){
        int fac =1;
        for (int i = 1; i <= n ; i++) {
            fac *= i;
        }
        return fac;
    }
}
