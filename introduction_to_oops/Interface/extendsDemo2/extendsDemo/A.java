package com.posh.introduction_to_oops.Interface.extendsDemo2.extendsDemo;

public interface A {

//    static void greeting(); // static interface methods should always have a body because they can't be inherited
    // you should call static methods with interface name such as A.greeting();
    static void greeting(){
        System.out.println("Hello");
    }

//    void fun();
//default public void fun() {
//    System.out.println("I am happy");
//}
}
