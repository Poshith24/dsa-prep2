package com.posh.introduction_to_oops.Interface.extendsDemo;

public class Main implements B{

    // When you are implementing B you should implement both A and B functions in Main because B extends A
    // B interface already has A methods.
    @Override // annotation is also an interface internally.
    public void fun() {

    }

    @Override
    public void greet() {

    }
}
