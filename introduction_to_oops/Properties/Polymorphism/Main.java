package com.posh.introduction_to_oops.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Shapes square = new Square();
        Shapes triangle = new Triangle();




        shape.area();

        circle.area();
        square.area();
        triangle.area();
    }
}
