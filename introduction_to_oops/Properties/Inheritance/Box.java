package com.posh.introduction_to_oops.Properties.Inheritance;

// using final keyword you can prevent inheritance.
// whenever you put class as final implicitly it declares methods inside a class also as final.

public  class Box {

      double l;
    double w;
    double h;

    public double getL() {
        return l;
    }
    //    Box(double l,double w,double h,double weight){
//        this.l=l;
//        this.w=w;
//        this.h=h;
//        this.weight=weight;
//    }


//      void greeting()
//    {
//        System.out.println("I am in box class Hope you are doing well.");
//
//    }

     static void greeting(){
        System.out.println("Hey I am in box!");
     }


    Box(){
       // super(); Object class.
         this.l=-1;
         this.w=-1;
         this.h=-1;
    }

    // for a cube
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }


    Box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }



    public void info(){
        System.out.println("Box is running");
    }
}
