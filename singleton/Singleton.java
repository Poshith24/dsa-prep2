package com.posh.singleton;

public class Singleton {

    Singleton(){

    }

    private static Singleton instance;

   public static Singleton getInstance(){

       if(instance==null){
            instance = new Singleton();
       }

       return instance;
    }

}
