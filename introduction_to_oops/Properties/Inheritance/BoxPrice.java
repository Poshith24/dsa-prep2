package com.posh.introduction_to_oops.Properties.Inheritance;

public class BoxPrice extends BoxWeight {

    double price;

    BoxPrice(){
        super();
        this.price =-1;
    }

      BoxPrice(double l,double w,double h,double weight,double price) {

        super(l,h,w,weight);
        this.price = price;
    }

    BoxPrice(double weight,double price){
        super(weight);
        this.price = price;
    }

    BoxPrice(BoxPrice old){
        super(old);
        this.price =old.price;
    }

    public BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}
