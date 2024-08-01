package com.posh.Codechef_problems;

import java.util.Scanner;

// https://www.codechef.com/START98D/problems/BLDST
public class ball_distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int i =0;
//        while(i++<t){
//
//
//        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int[] sum  = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            func(arr,sum,i,m);
        }
    }

    public static int[] func(int[] arr,int[] sum,int i,int m){
        int x = arr[i];
        for (int j = 0; j < sum.length; j++) {

            if(sum[j]+1<m & x>0 ){
                sum[j]+=1;
                x--;
            }
        }
//        while(x>0){
//            if()
//        }

        return sum;
    }
}
