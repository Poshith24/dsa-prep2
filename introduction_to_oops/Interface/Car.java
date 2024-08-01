package com.posh.introduction_to_oops.Interface;

public class Car implements Brake,Engine, Media {

    int a = 30;

    // It doesn't matter if we have brake interface also have start() method because we wrote the body here in the Car class.
    // and we just have imported the methods and we used based on our desire.
    @Override
    public void brake() {
        System.out.println("I brake like with brembo brakes");
    }

    @Override
    public void start() {

        System.out.println("I start engine like a racing car");
    }

    @Override
    public void stop() {

        System.out.println("I stop engine like a racing car");

    }

    @Override
    public void acc() {

        System.out.println("I accelerate like a racing car");

    }
}
