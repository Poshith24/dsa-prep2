package com.posh.introduction_to_oops.Collections;

public class Enum {

    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants.
        // public,static and final
        // you can't create child enums coz these are final.
        // type is week.


        Week() {
            System.out.println("This constructor called for "+ this.toString());
        }

        @Override
        public void hello() {
            System.out.println("Hey! how r u?");
        }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why.

        // public static final Week Monday = new Week();

    }

    public static void main(String[] args) {

        Week week;
        week = Week.Tuesday;
//        System.out.println(week);
//        System.out.println(week.ordinal());
            week.hello();
        System.out.println(Week.valueOf("Wednesday")); // returning enum constant
//         for(Week day : Week.values()){
//             System.out.println(day);
//         }
    }
}

// Java program to demonstrate the working of
// priority queue in Java



