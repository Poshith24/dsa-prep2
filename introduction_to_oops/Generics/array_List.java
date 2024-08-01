package com.posh.introduction_to_oops.Generics;

import java.util.ArrayList;

public class array_List {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
//        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);
    }
}
