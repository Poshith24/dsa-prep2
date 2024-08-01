package com.posh;

public class recursion {
    public static void main(String[] args) {

//        rec(5);
//        rec2(5);
//       int ans = product(0);
//        System.out.println(ans);
//        System.out.println(sum(5));
//        System.out.println(sum_of_digits(1342));
        System.out.println(product_of_digits(5305));
    }

    // Printing nos from n to 1:
    static void rec(int n){
        System.out.print(n+" ");
        if (n==1){
            return;
        }
         rec(n-1);
    }

    static void rec2(int n){

        if (n<1){
            return;
        }
        System.out.println(n);
        rec2(n-1);
        System.out.println(n+" ");
    }

    static int product(int n){

        if (n<=1){
            return 1;
        }

        return n*product(n-1);
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    static int sum_of_digits(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sum_of_digits(n/10);
    }

    static int product_of_digits(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10)*product_of_digits(n/10);
    }

//    static int reverse(int n){
//
//        if (n<0){
//
//        }
//    }
}
