package com.posh.Pattern_problems;

public class example_pattern {
        public static void main(String[] args) {
            count( 2000304003);
            System.out.println(zeroescount);
        }
        static int zeroescount = 0;
        public static void count(int n){
            if(n==0){
                return;
            }
            if(n%10==0){
                zeroescount++;
            }
            count(n/10);
        }
}
