package com.posh.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class codechef_palindrome_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;

        while(i<t){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            int[] freq = new int[(n/2)+1];
            int count =0;
            Arrays.fill(freq,0);
            for(int j=0;j<n/2;j++){
                if(arr[j]>arr[n-j-1]){
                    System.out.println(-1);
                    count=1;
                    break;
                }
                else{
                    freq[j] = arr[n-j-1]-arr[j];
                }
            }

            if(count!=1){
                int max = max_freq_index(freq);
                int sum = sum_freq(freq);
                if(freq[0]!=0 && max==0){
                    System.out.println(freq[0]);
                }
                else if(sum==0){
                    System.out.println(0);
                }
                else{
                    System.out.println(-1);
                }

            }
            i++;
        }
    }
    static int max_freq_index(int[] arr){
        int max=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>arr[max]){
                max=j;
            }
        }
        return max;
    }
    static int sum_freq(int[] arr){
        int sum =0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        return sum;
    }
}
