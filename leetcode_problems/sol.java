package com.posh.leetcode_problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static com.posh.leetcode_problems.Result.twoStacks;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int helper(int[] f,int[] s,int maxsum,int letsum,int count){

        if(letsum>maxsum){
            return count;
        }

         int right = helper(Arrays.copyOfRange(f,1,f.length),s,maxsum,letsum+f[0],count+1);
        int left = helper(f,Arrays.copyOfRange(s,1,s.length),maxsum,letsum+s[0],count+1);

//        int left = helper(f,s,maxsum,letsum+s[0],count++);
         return Math.max(right,left);

    }

    public static int twoStacks(int maxSum, int[] a, int[] b) {
        // Write your code here
//        Stack<Integer> f = new Stack<>();
//        Stack<Integer> s = new Stack<>();
//        for (int i = a.size()-1; i >=0; i--) {
//            f.push(a.get(i));
//        }
//        for (int i = b.size()-1; i >=0; i--) {
//            s.push(b.get(i));
//        }


        return helper(a,b,maxSum,0,0)-1;

    }

}

public class sol {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=0;
        while(i++<t){
            int n= sc.nextInt();
            int m = sc.nextInt();
            int maxsum=sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j <n ; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(twoStacks(10,a,b));
        }

    }
}


