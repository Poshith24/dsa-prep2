package com.posh.introduction_to_oops.Properties.Polymorphism;

public class Circles extends Shapes {

    @Override // this  is called Annotation.
    // this will run when obj of Circle is created
    // hence it is overriding the parent method.
    void area(){
        System.out.println("Area is pie*r*r");
    }
}
