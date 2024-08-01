package com.posh.staticExample;

public class posh {

    public static void main(String[] args) {
//        Human poshith = new Human(19,"Poshith Kumar",10000,false);
//        Human poojith = new Human(35,"Poojith",15000,true);
//
//        System.out.println(poshith.married);
//        System.out.println(poshith.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

//        greeting();
    }

    // this is not dependent on objects/instances.
    static void fun(){
//        greeting();  // this is dependent on object. but fun doesn't dependent on objects.


        // you cannot access non-static stuff without referencing their instances in a static context.
        posh obj = new posh();
        obj.greeting();


    }

    // we know something not static belongs to an object.
    void greeting(){
        fun();
        System.out.println("hello world");
    }


}
