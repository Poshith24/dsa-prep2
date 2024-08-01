package com.posh.introduction_to_oops.Properties;

import com.posh.introduction_to_oops.access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(23,"Poshith");
        int n = obj.num;
    }
}
