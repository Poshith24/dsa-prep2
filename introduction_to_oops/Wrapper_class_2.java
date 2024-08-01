package com.posh.introduction_to_oops;

public class Wrapper_class_2 {
    public static void main(String[] args) {
        int a = 1;

//        Integer num = new Integer(25);
          Integer num = 25;

          Float b = 23.54f;
          Character ch = 'a';
//        System.out.println(a);
//        System.out.println(num);

        A obj = new A("Poshith Kumar");
        System.out.println(obj);


    }
}

class A{
    String name;
    public A(String name){
        this.name=name;
    }
}
