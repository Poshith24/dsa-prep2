package com.posh;

import java.util.Scanner;

public class Ith {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i = in.nextInt();
        int b=1<<i-1;
        System.out.println(and(n,b));
    }
    static int and(int n,int b){
        if ((n&b)==0){
            return 0;
        }
        return 1;
    }
}
