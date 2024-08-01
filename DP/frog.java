package com.posh.DP;

public class frog {
    public static void main(String[] args) {
        int[] arr = {10,30,40,50,20};
        System.out.println(frogjump(5,arr));
    }

    public static int frogjump(int n,int[] arr){

        return frogj_withk(n,arr,0,0,3);
    }

    public static int frogj(int n,int[] arr,int sum,int i){
        if(i==n-1){
            return sum;
        }
        int l = Integer.MAX_VALUE-1;
        int r = Integer.MAX_VALUE-1;
        if(i+1<n){
            l = frogj(n,arr,sum+Math.abs(arr[i+1]-arr[i]),i+1);
        }
        if(i+2<n){
            r = frogj(n,arr,sum+Math.abs(arr[i+2]-arr[i]),i+2);

        }
        return Math.min(l,r);

    }

    public static int frogj_withk(int n,int[] arr,int sum,int i,int k){
//        if(i==n-1){
//            return sum;
//        }
//        int ans = Integer.MAX_VALUE-1;
//        for (int j = 1; j <=k ; j++) {
//            int f = i+j;
//            if(f<n){
//                int check = frogj_withk(n,arr,sum+Math.abs(arr[f]-arr[i]),f,k);
//                ans = Math.min(check,ans);
//            }
//        }
        int[] dp = new int[n+1];
        dp[1] =0;
        for(int j=2;j<=n;j++){
            int min_steps = Integer.MAX_VALUE;
            for(int l=1;l<=k;l++){
                if(j-l>0){
                    int check = dp[j-l]+Math.abs(arr[j-1]-arr[j-l-1]);
                    min_steps = Math.min(check,min_steps);
                }
                else{
                    break;
                }

            }
            dp[j]= min_steps;
//            System.out.println(dp[j]);
        }
        return dp[n];
    }
}
