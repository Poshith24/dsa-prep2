package com.posh.codeforces_problems.div3_895;

import java.util.Scanner;

public class two_vessels {
    public static void main(String[] args) {

//        System.out.println(scoopup(97,4,3));
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(scoopup(a,b,c));
        }
    }

    public static int scoopup(int a,int b,int c){
        if(a==b){
            return 0;
        }
        int diff = Math.abs(a-b);
        if(diff<=c){
            return 1;
        }
        int avg = (a+b)/2;
//        int rem = (a+b)%2;
        int x = Math.max(a,b)-(avg);
        if(x%c!=0){
            return x/c+1;
        }
        return x/c;
    }
}