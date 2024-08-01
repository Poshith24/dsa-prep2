package com.posh.introduction_to_oops.Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student posh = new Student(15,98.3f);
        Student pooji = new Student(21,75.4f);
        Student sumanth = new Student(34,60.4f);
        Student harish = new Student(78,65.4f);
        Student uday = new Student(77,89.4f);
        Student lalith = new Student(25,37.4f);
        Student mounish = new Student(71,91.4f);

        Student[] list = {posh,pooji,sumanth,harish,uday,lalith,mounish};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks-o2.marks);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));




//        System.out.println(posh.compareTo(pooji));
//        int diff = posh.compareTo(pooji);
//        if(diff==0){
//            System.out.println("Both are equal");
//        }
//        else if (diff>0){
//            System.out.println("Posh got more marks");
//        }
//        else{
//            System.out.println("Pooji got more marks.");
//        }


    }
}

