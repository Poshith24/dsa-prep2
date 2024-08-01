package com.posh.Codechef_problems;

import java.util.Scanner;

public class maximise_score {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] ans = new int[n];
            int k =0;
            int m = -1;
            int l = -1;
            for(int i =0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            if(n==2){
                System.out.println(Math.abs(arr[0]-arr[1]));
            }
            else{

                for(int i=0;i<n;i++){
                    if(i!=0){
                        m = Math.abs(arr[i]-arr[i-1]);
                    }

                    if(i!=n-1){
                          l = Math.abs(arr[i]-arr[i+1]);
                    }

                    if(m>l){
                        ans[k] = m;
                    }
                    else{
                        ans[k] =l;
                    }
                    k++;
                }
            }
            System.out.println(min(ans));
        }
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
