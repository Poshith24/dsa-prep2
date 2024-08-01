package com.posh;


import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(23,35,34,56,32,67,89,654,43 );
    }

    static void fun(int a,int b,int ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));

    }
}
