package com.posh.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class codechef_frequency_problem {
    /* package codechef; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i=0;
            while(i<t){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int j=0;j<n;j++){
                    arr[j]= sc.nextInt();
                }
                int[] freq = new int[11];
                Arrays.fill(freq,0);
                for(int j=0;j<n;j++){
                    freq[arr[j]]+=1;
                }
                int max = Max_of_freq(freq);
                int sum = Sum_of_freq(freq);
                System.out.println(sum-max);
                i++;
            }
        }

        static int Max_of_freq(int[] arr){
            int max =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            return max;
        }
        static int Sum_of_freq(int[] arr){
            int sum =0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j];
            }
            return sum;
        }


}
