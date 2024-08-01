package com.posh.Arrays;

import java.util.Scanner;

public class bs_atlassian_qn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s0 = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int[] s = new int[n];
        s[0] = s0;
        for(int i =1;i<n;i++){
            s[i]= (((k*s[i-1]+b)%m)+1+s[i-1]);
        }
        int ans = sol(s,a);
        System.out.println(ans);
    }

    static int sol(int[] arr,int a){
        int s =0;
        int e = arr.length-1;
        int ans =0;
        while(s<=e){
            if(arr[s]*arr[e]<=15){
                ans+=2*(e-s)+1;
                s++;
            }
            else{
                e--;
            }
        }
        return ans;
    }
}
