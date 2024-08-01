package com.posh.codeforces_problems.div3_895;
import java.util.*;

public class plus_minus_permutations {
    public static void main(String[] args) {
        // 179179179436104

        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();
            long red = n/x;
            long blue =n/y;
            long lcm = (x*y)/gcd(x,y);
            long purple= n/lcm;
            red-=purple;
            blue-=purple;

            long sum = ((n*(n+1))/2)-((n-red)*(n-red+1)/2);
            long f =(blue*(blue+1))/2;
            System.out.println(sum-f);


        }
    }

    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

//    public static long[] func(long x,long y,long n){
//
//        long[] counts = new long[2]; // Array to store counts for x and y
//
//        long i = 1;
//        HashSet<Long> hashSet = new HashSet<>();
//        while (x * i <= n) {
//            counts[0]++; // Increment count for x
//            hashSet.add(x*i);
//            i++;
//        }
//
//        i = 1;
//        while (y * i <= n) {
//            counts[1]++; // Increment count for y
//            hashSet.add(y*i);
//            i++;
//        }
//        long z = counts[0] + counts[1] - hashSet.size();
//
//        // Remove z value from x and y counts
//        counts[0] -= z;
//        counts[1] -= z;
//
//        return counts;
//    }


}

