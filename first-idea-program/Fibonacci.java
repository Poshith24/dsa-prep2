package com.posh;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=input.nextInt();
        int a=0;
        int b=1;
        for (int i = 2; i <=n; i++) {
            int k=b;
            b=a+b;
            a=k;

        }
        System.out.println(b);
    }
}
