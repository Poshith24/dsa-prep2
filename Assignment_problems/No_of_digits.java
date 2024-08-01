package com.posh;

public class No_of_digits {
    public static void main(String[] args) {
        int n= 14;
        int b= 2;
        // Imp formula for finding No_of_digits in base b
        int ans = (int)(Math.log(n)/Math.log(b)) +1;
        System.out.println(ans);
    }
}
