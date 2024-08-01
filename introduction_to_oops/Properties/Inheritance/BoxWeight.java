package com.posh.introduction_to_oops.Properties.Inheritance;

public class BoxWeight extends Box{

    double weight;

    BoxWeight(){
        super();
        this.weight =-1;
    }


//    @Override
//      void greeting(){
//        System.out.println("I am in boxweight class Hope you are doing well.");
//    }

    static void greeting(){
        System.out.println("I am in boxweight class");
    }

    public BoxWeight(double weight) {
//        super();
//        System.out.println(super.h);
        this.weight =weight;
    }

    BoxWeight(BoxWeight other){

        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double side,double weight) {

        super(side);
        this.weight =weight;
    }

    public BoxWeight(double l, double w, double h,double weight) {
        super(l, w, h);
//        System.out.println(super.l );
        this.weight=weight;
    }

    public BoxWeight(Box old,double weight) {
        super(old);
        this.weight = weight;
    }
}
