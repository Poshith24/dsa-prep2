package com.posh.introduction_to_oops.AbstractDemo;

public class Main {

    public static void main(String[] args) {
        Son son = new Son(23);

        son.career();
        son.partner( );
        son.normal();

        Daughter daughter = new Daughter(20);



        daughter.career();
        daughter.partner();

        // ******IMPORTANT******
        // You can't create objects of an abstract class. -- if you can create an obj you can't call career and partner methods because they don't have any body to do
        // some action if you call them.
        // You can't instantiate(call)
        // You can't create abstract static methods because static methods are object independent and can't be overriden but abstract methods are meant to be overriden .
        // static methods are not overriden
        // Overriding depends on Objects
        // Static method doesn't depend on Object.
        // So,static methods can't be overriden.

        Parent.hello();// ***IMportant**** hello() is a static method and you can call static method using class name Parent.
        Daughter.hello();

//        Parent parent = new Parent(25) {
//            @Override
//            int career() {
//                return 0;
//            }
//
//            @Override
//            void partner() {
//
//            }
//        };

        // Even though you can't declare an object as parent class as above but you can use it like..
         Parent parent2 = new Daughter(24);  // We can use this because if you call parent2.career it will redirect to Daughter class career
        // because we know that according runtime Polymorphism method overriding depends on obj type(Daughter) in this case not ref type(Parent)
        // ** This is called Dynamic dispatch.

        parent2.career();

        // Reference type is just used for accessing the variables and

    }
}
