package com.posh.Sorting_algo;

import java.util.Arrays;
import java.util.Scanner;

public class equal_distinct_qn_codechef {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j =0;j<n;j++){
                arr[j]= sc.nextInt();
            }
            Arrays.sort(arr);
            int count =0;
            if(n%2!=0){
                System.out.println("NO");
            }
            else {
                int x = count(arr);
                 if(x%2==0){
                     System.out.println("YES");
                 }
                 else{
                     System.out.println("NO");
                 }
            }
            i++;
        }

    }
    static int count(int[] arr){
        int n = arr.length;
        int[] count_arr = new int[arr.length];
        Arrays.fill(count_arr,0);
        for(int i =0;i<arr.length;i++){
             count_arr[arr[i]]+=1;
        }
        return count_max(count_arr);
    }

    static int count_max(int[] count_arr){
        int max =0;
        for(int i =0;i<count_arr.length;i++){
            if(count_arr[i]>count_arr[max]){
                max = i;
            }
        }
        return count_arr[max];
    }
}
