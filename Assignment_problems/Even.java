package com.posh;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        System.out.println(isOdd(a));
    }

    static boolean isOdd(int n){

        return (n&1) ==1;
    }
}
