package com.posh.staticExample;

public class StaticBlock {
    static int a = 5;
    static int b;

    // this only run once that is when the class is loaded.
    static{
        System.out.println("I am in static block");
        b=a*6;
    }

    public static void main(String[] args) {

        System.out.println(a+" "+b);

        StaticBlock obj = new StaticBlock();

        StaticBlock.b+=3;
        b+=3;
        System.out.println(b);

        StaticBlock obj2 = new StaticBlock();

        System.out.println(a+" "+b);
//        System.out.println(a+" "+ b);
    }
}
