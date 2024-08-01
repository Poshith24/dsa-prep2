package com.posh.introduction_to_oops.Interface;

public class Main {

    public static void main(String[] args) {

//        Engine car = new Car(); // car's method is running and it determines by dynamic method dispatch at run time.
//
//        car.start();
//        car.stop();
//        car.acc();
//        System.out.println(car.price); // you can access car.price coz car is Engine type and car has access to all the variables engine has.
////        car.a; //-- you can't access a variable which is in car class but the car in the above is engine type which doesn't have a variable.
//
//        System.out.println(car.price); // you can access price variable because price is in Engine interface and car access only Engine methods and
        // variables.
//        car.brake() //-- this can't be accessed because the Engine type methods only can be accessed and

//        Car car2 = new Car();
//
//        car.start();
//        car.stop();

//         Media carMedia = new Car();
//
//         // In this case also we are getting output about engine start and stop but not about Media --
//
//         carMedia.start();
//         carMedia.stop();

//        Media car = new Car2();
//        car.start();
//        car.stop();
////        car.acc(); // You can't access these two types because you can only access Media methods and variables
////        car.brake();
//
//        Car2 car2 = new Car2();
//
//        car2.start();
//        car2.stop();
//        car2.acc();
//        car2.brake();

        NiceCar car = new NiceCar();

        car.start();
        car.stop();
        car.MusicStart();
        car.MusicStop();

        Engine engine = new ElectricEngine();

        car.ChangeEngine(engine); // you are changing engine using the electric engine "engine"
        car.start();
        car.stop();
//        car.brake_car();

    }
}
