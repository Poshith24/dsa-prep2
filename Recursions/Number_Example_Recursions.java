package com.posh;

public class Number_Example_Recursions {

    public static void main(String[] args) {
        // Write a function to print numbers from 1 to 5
        // 1 2 3 4 5

        print(1);
    }

    // recursive call
    // if you are calling a function again and again, you can treat it as seperate call in the stack.

    static void print(int n){
        // base condition
        if (n==5){
            System.out.println(n);
            return;
        }
        // body
        System.out.println(n);
        // recursion
        print(n+1);

    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);
    }
}
