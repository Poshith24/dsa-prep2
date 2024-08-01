package com.posh;

import java.util.Scanner;

public class hell {

    public static void main(String[] args) {

//        System.out.println(Math.pow(3,2));
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int pow = in.nextInt();
        int ans =1;
        for (int i = 0; i < pow; i++) {
            ans *= a;
        }
        System.out.println(ans);
    }
}
