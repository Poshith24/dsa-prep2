package com.posh.STR;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'-'d');
        System.out.println("a"+"b");// operator overloading.
        System.out.println((char) ('a'+3));
        System.out.println("a"+2);
        // this is same as after a few steps : "a" + "1"
        // integer will be converted to Integer that will call toString()
        System.out.println("Poshith" + new ArrayList<>( ));
        System.out.println("Poshith"+ new Integer(78));
        // + operator only works for primitives and if atleast one should be string(exception).
        System.out.println(new ArrayList<>( ) +" "+ new Integer(78));
        System.out.println("a"+'b');
    }
}
