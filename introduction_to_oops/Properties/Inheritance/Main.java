package com.posh.introduction_to_oops.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(2.45,3.5,4.7);
        box1.getL();
        System.out.println(box1.getL());
//        Box box2 = new Box(box1);
//
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);

        BoxWeight box3 = new BoxWeight(67.1,34.1,25.2,25);
        BoxWeight box4 = new BoxWeight(box3);
//        System.out.println(box3.h+" "+box3.l+" "+box3.w+" "+box3.weight);
        System.out.println(box4.h+" "+box4.l+" "+box4.w+" "+box4.weight);

        Box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.weight);

        // there are many variables in both parent and child classes.
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable.
        // this also means, that the ones you are trying to access should be intialised
        // but here, when the obj itself is of type parent class, how will you call child instance.
        // this is why error.

//        BoxWeight box6 = new Box(2,3,4,5);

//        BoxWeight box7  = new BoxWeight(2.45,3.4);
//        System.out.println(box7.h);

        BoxPrice box8 = new BoxPrice(1,2,3,4,5);
//        System.out.println(box8.price);

        BoxPrice box9 = new BoxPrice(3,4);
//        System.out.println(box9.l);

        Box box10 = new BoxPrice(2,3,4,5,3);
//        System.out.println(box10.price);  //It gives an error because there is no access to price variable in box but it is initialised in BoxPrice object.

        BoxPrice box11 = new BoxPrice();
//        System.out.println(box11.price);

        BoxPrice box12 = new BoxPrice(2,3,4,5,7);

        BoxPrice box13 = new BoxPrice(box12);

//        System.out.println(box13.l);

        BoxPrice box14 = new BoxPrice(2,3,4);

//        System.out.println(box14.w);

//        Box.greeting();

        Box box23 = new BoxWeight();

        box23.greeting(); // u can inherit but can't override static methods

        // Dynamic / Runtime Polymorphism -> Overriding methods in parent and child causes this kind of polymorphism.
        // java determines which method to call in overriden case whether parent or child method
        // this is called Dynamic method dispatch -> mechanism by which a call to an overriden method is resolved at runtime rather than compile time.
        // Obj type defines which one(method) to run and reference type defines which one to access.


    }
}
