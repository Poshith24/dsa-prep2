package com.posh.introduction_to_oops.Properties.Inheritance;

import com.posh.introduction_to_oops.access.A;
import com.posh.introduction_to_oops.access.Subclass;

public class Subclass_diff_pkg extends A {

    public Subclass_diff_pkg(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass_diff_pkg sub = new Subclass_diff_pkg(15,"Poshith Kumar");
        System.out.println(sub.num);
    }
}
