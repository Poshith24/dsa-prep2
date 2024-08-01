package com.posh.codeforces_problems.div_3_891;

import java.util.Scanner;

// https://codeforces.com/contest/1857/problem/A
public class array_coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum=0;
            for (int p = 0; p < n; p++) {
                arr[p] = sc.nextInt();
                sum+=arr[p];
            }
            if((sum&1)==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
