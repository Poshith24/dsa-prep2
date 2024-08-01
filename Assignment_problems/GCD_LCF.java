package com.posh.Assignment_problems;

public class GCD_LCF {
    public static void main(String[] args) {
        int ans= gcd(9,18);
        System.out.println(ans);
    }
    static int lcm(int a , int b){
//        int d=gcd(a,b);
//        int f=a/d;
//        int g=b/d;
//        return f*g*d;
        return (a*b)/gcd(a,b);
    }
    static int gcd(int a ,int b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
//
//public class GCD{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int r = in.nextInt();
//        int b = n-r;
//        int first =n;
//        int second =n;
//        int g = gcd(r,n);
//        int f = gcd(b,n);
//        if(g!=1){
//            r/=g;
//            first/=g;
//        }
//        if(f!=1){
//            b/=f;
//            second/=f;
//        }
//        System.out.println(r+" "+first);
//        System.out.println(b+" "+second);
//    }
//
//    static int gcd(int a,int b){
//        if(a==0){
//            return b;
//        }
//        return gcd(b%a,a);
//    }
//}
//
//
//// NAME : YALAMANCHI POSHITH KUMAR
//// SCH.ID : 2014015
//import java.util.Scanner;
//public class GCD{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int r = in.nextInt();
//        int b = n-r;
//        int first =n;
//        int second =n;
//        int g = gcd(r,n);
//        int f = gcd(b,n);
//        if(g!=1){
//            r/=g;
//            first/=g;
//        }
//        if(f!=1){
//            b/=f;
//            second/=f;
//        }
//        System.out.println(r+" "+first);
//        System.out.println(b+" "+second);
//    }
//
//    static int gcd(int a,int b){
//        if(a==0){
//            return b;
//        }
//        return gcd(b%a,a);
//    }
//}