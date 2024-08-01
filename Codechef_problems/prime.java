package com.posh.Codechef_problems;

import java.util.Scanner;

public class prime {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int i =0;

        while(i<t){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            if(isPrime(c)){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
            i++;
        }

    }

    public static boolean isPrime(int n){

        for(int i=2;(i*i)<=n;i++){
            if(n%i==0){
                return false;

            }
        }
        return true;
    }
}
