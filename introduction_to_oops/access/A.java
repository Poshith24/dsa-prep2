package com.posh.introduction_to_oops.access;

public class A {

    protected int num;

    // for private -- u can only access in same class
    // for protected -- u can access in different package using subclass class.
    // for normal data_type -- u can access in same package.
    // for public -- anywher in the world you can access.
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
