package com.posh.introduction_to_oops.Interface;

public class Car2 implements  Media,Engine,Brake{


    @Override
    public void brake() {
        System.out.println("Car is braked.");
    }

    @Override
    public void acc() {

        System.out.println("Car is accelerated.");
    }

    @Override
    public void start() {

        System.out.println("Media player is started.");
    }

    @Override
    public void stop() {
        System.out.println("Media player is stopped.");
    }
}
