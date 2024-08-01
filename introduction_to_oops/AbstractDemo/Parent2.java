package com.posh.introduction_to_oops.AbstractDemo;

// You can't have final abstract class because the final prevent Parent to be inherited by other classes such as Son and daughter.

public abstract class Parent2 {

    int age;

    final int VAL;

    public Parent2(int age) {
        this.age = age;
        VAL =2;
    }

//    abstract Parent(){
//        System.out.println("Hello world");
//    }

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is normal method.");
    }
    // if class contains one or more than abstract methods you should make class abstract.
    abstract int career(); // There is no implementation provided by parent class just a generic name or definition of a method
    // all the other stuff should be handled by child class.
    // any class that contains one or more abstract methods it should also be declared as abstract.

    abstract void partner();

}
