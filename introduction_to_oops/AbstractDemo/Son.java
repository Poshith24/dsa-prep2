package com.posh.introduction_to_oops.AbstractDemo;

// class cannot extend mutiple classes. -- That's why we use interfaces :).
// Multiple inheritance is not allowed in java..
// public class Son extends Parent,Parent2
public class Son extends Parent{

    int age;

    public Son(int age) {
        super(age); // super(age) goes to the parent class and runs that method :).
    }

    @Override
    int career() {
        System.out.println("I am gonna be a doctor");
        return age;
    }

    @Override
    void partner() {
        System.out.println("I love Florence Pugg" );
    }
}
