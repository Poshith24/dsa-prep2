package com.posh.introduction_to_oops.Object_Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human poshith = new Human(19,"Poshith");
//        Human pooji = poshith;
//        Human pooji = new Human(poshith);
//        System.out.println(pooji.name);
//        pooji.name = "Hello";
//        System.out.println(poshith.name);

        Human hell = (Human) poshith.clone();
//        System.out.println(hell.name);
//        System.out.println(hell.age);
//        hell.age = 25;
//        System.out.println(poshith.age);// poshith.age is not gonna change coz int type is again newly created for every object
//        System.out.println(hell.age);
//        hell.name="alkdja";
//        System.out.println(poshith.name);
        System.out.println(Arrays.toString(poshith.arr));

        hell.arr[0] = 23;

        System.out.println(Arrays.toString(hell.arr));

        System.out.println(Arrays.toString(poshith.arr)); // by changing hell.arr[0] it impacted poshith array also
        // coz both are pointing to the same object and if you change in one array it will impact other one. hell is kind of shallow copy of poshith

    }
}
