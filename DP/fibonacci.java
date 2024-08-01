package com.posh.DP;

import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =10;
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(fibo(n));
        }
    }

    public static int fibo(int n){
//        int[] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        dp[0] =0;
//        dp[1] = 1;
//        for(int i=2;i<=n;i++){
//            dp[i] = dp[i-1]+dp[i-2];
//        }
//        return dp[n];
        if(n<=1){
            return n;
        }

        int prev =0;
        int prev2=1;
        int ans =0;
        for(int j=2;j<=n;j++){
            ans = prev+prev2;
            prev=prev2;
            prev2=ans;
        }
        return ans;
//        return fibo(n,dp);
    }

    private static int fibo(int n,int[] dp){
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }
}
