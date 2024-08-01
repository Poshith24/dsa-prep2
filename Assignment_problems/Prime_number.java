package com.posh;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int i=2;
        while(i*i<=n){
            if (n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
