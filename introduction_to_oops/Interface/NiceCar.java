package com.posh.introduction_to_oops.Interface;

public class NiceCar {

    private Engine engine;
    Media player = new CDPlayer();
//    Brake brake_inst = new brake_class();

    public NiceCar() {
         engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void MusicStart(){
        player.start();
    }

    public void MusicStop(){
        player.stop();
    }

    public void ChangeEngine(Engine engine){
        this.engine = engine;
    }

//    public void brake_car(){
//        brake_inst.brake();
//    }


}
