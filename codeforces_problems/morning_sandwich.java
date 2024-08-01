package com.posh.codeforces_problems;

import java.util.Scanner;

// https://codeforces.com/contest/1849/problem/0
public class morning_sandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=0;
        while(i++<t){
            int b =sc.nextInt();
            int c = sc.nextInt();
            int h = sc.nextInt();
            int sum = c+h;

            if(sum<b){
                System.out.println(2*sum+1);
            }
            else{
                System.out.println(2*b-1);
            }
        }
    }
}
