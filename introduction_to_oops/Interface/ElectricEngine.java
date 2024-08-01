package com.posh.introduction_to_oops.Interface;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");

    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerate");

    }
}
