package com.posh.introduction_to_oops.access;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        A obj = new A(2888,"Poshith");

        System.out.println(obj.num);

        ArrayList<Integer> list = new ArrayList<>(277);
//        list.DEFAULT_CAPACITY;
//        System.out.println(DEFAULT_CAPACITY); // U can't get access to "DEFAULT_CAPACITY" variable because it is declared as
        // private in ArrayList.java //  private static final int DEFAULT_CAPACITY = 10;

        int ans1 = obj.getNum();

        System.out.println(ans1);

        obj.setNum(23);
        int ans2 = obj.getNum();
        System.out.println(ans2);


//        System.out.println(list.serialVersionUID);
    }
}
