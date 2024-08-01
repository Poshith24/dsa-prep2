package com.posh.Codechef_problems;

import java.util.Scanner;

public class apples_oranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans =0;
            if (a>b){
              ans =   gcd(b,a);
            }
            else{
                ans = gcd(a,b);
            }
            System.out.println(ans);
            i++;
        }
    }

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
