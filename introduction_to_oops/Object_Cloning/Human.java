package com.posh.introduction_to_oops.Object_Cloning;

public class Human implements Cloneable {
    int age;
    String name;

    int[] arr;

    public Human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,5,7,3};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
    // this is shallow copy.
//        return super.clone();
//
//    }


    public Object clone() throws CloneNotSupportedException{
        // this is deep copy.

        Human twin = (Human) super.clone(); // this is actually shallow copy.

        // make a deep copy.
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
}
