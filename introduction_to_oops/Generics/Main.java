package com.posh.introduction_to_oops.Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(54);
        list.add(63);
        list.add(72);
        list.add(81);

//        list.add(45);
//        list.add(45);
//        list.add(45);
//        list.add(45);

//        System.out.println(list.get(1));
        System.out.println(list);
        list.remove(5);
//        list.add(27);
//        list.set(2,98);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(32);
        System.out.println(list2);
    }
}
