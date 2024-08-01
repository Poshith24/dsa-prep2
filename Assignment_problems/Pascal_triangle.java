package com.posh;

public class Pascal_triangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(1<<(n-1));
//        int sum=0;
//
//
//        for (int i = 0; i <= 5; i++) {
//            sum+= num(n,i);
//        }
//        System.out.println(sum);
    }
    static int num(int n,int r){
        return fac(n)/(fac(r)*fac(n-r));
    }
    static int fac(int n){
        int ans=1;
        for (int i = 1; i <= n; i++) {
            ans*=i;
        }
        return ans;
    }
}
