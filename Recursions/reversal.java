package com.posh.Recursions;

public class reversal {
    public static void main(String[] args) {
//        rev1(2538);
//        System.out.println(sum);
//        System.out.println(rev2(28174));
        System.out.println(pal(1));

    }
    static int sum = 0;
    static void rev1(int n){
        if (n==0){
            return;
        }
        int rem =  n%10;
        sum = sum*10 + rem;

        rev1(n/10);
    }

    static int rev2(int n){
        int digits = (int) Math.log10(n) +1;
        return helper(n,digits);
    }

    static boolean pal(int n){
        return (n==rev2(n));
    }

    private static int helper(int n, int digits) {
        if (digits ==1){
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
