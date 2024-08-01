package com.posh.Codechef_problems;

import java.util.Scanner;

public class triptastic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans;
        int a;
        int b;
        int c;
        int d;
        long sum =0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==k+1){
                    ans =0;
                }
                sum+=arr[i][j];
            }
        }
        if(n%2==0){
            a=n/2;
            b=n/2+1;
        }
        else{
            a = n/2;
            b=a;
        }
        if(m%2==0){
            c=m/2;
            d=m/2+1;
        }
        else{
            c=m/2;
            d=c;
        }
        for (int i = a; i <=b ; i++) {
            for (int j = c; j <=d; j++) {
                if(arr[i][j]!=0){
                    
                }
            }
        }
    }
}
