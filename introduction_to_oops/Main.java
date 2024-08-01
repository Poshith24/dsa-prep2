package com.posh.introduction_to_oops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] student = new Student[5];
        System.out.println(Arrays.toString(student));

//        Student poshith;
//
//        System.out.println(poshith);

        Student poshith = new Student();
        poshith.Change_name("Kumar");
        poshith.greet();

        poshith.rno = 15;
        poshith.name = "Poshith";
        poshith.marks = 99.99f;
        poshith.hello = true;

        System.out.println(poshith.rno);
        System.out.println(poshith.name);
        System.out.println(poshith.marks);
        System.out.println(poshith.salary);
        System.out.println(poshith.hello);
        System.out.println(Arrays.toString(student));
//        System.out.println(Arrays.toString(poshith));
        System.out.println(poshith.rno);

        Student random = new Student(poshith);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student one = new Student();
        Student two = one;
        one.name = "Hello world!";
        System.out.println(two.name);
    }

    static class Student{
        int salary;
        int rno ;
        String name;
        float marks = 90;

        void Change_name(String name){
            this.name = name;
        }

        void greet(){
            System.out.println("Welcome home "+name);
        }
        Student() {
            this.rno = 15;
            this.name = "Poshith";
            this.marks = 93.55f;
        }

//        public void toString(){
//
//        }


        Student (Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }
        Student (int rno,String name,float marks){
              this.rno = rno;
              this.name = name;
              this.marks = marks;
        }
        boolean hello;

    }
}
