package com.posh.staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    static void message(){
        System.out.println("Hello world");
//        System.out.println(this.age); // u can't use "this" over here.
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;

         message();

    }
}
