package com.posh.introduction_to_oops.Interface.extendsDemo2.extendsDemo;

public interface B {
    void greet();

    default public void fun() {
        System.out.println("I am happy");
    }
}
