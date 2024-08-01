package com.posh.singleton;

import com.posh.introduction_to_oops.access.A;

public class Subclass extends A {


    public Subclass(int num, String name) {
        super(num, name);
    }


    // u can't access through the parent class you will get the error.
//    A obj2 = new A(25,"Posh");
//    int k = obj2.num;

    public static void main(String[] args) {

        Subclass obj = new Subclass(25,"Posh");
        int n = obj.num;
    }
}
