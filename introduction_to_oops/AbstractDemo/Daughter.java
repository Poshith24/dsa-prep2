package com.posh.introduction_to_oops.AbstractDemo;

public class Daughter extends Parent{


    int age;

    public Daughter(int age) {
        super(age);
    }
    @Override
    int  career() {

        System.out.println("I am gonna be a coder");
        return age;
    }

    @Override
    void partner() {

        System.out.println("I love Thor Ragnarok");
    }
}
