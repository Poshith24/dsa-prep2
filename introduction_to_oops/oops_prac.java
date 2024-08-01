package com.posh.introduction_to_oops;

public class oops_prac {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        Student poshith = new Student();

        System.out.println(poshith.marks);
        System.out.println(poshith.name);
        poshith.change_name("Poojith");
        System.out.println(poshith.name);


        Student poojith = new Student(17,"Poshith",35.7f);

        Student random = new Student(poshith);

        poshith.greet();

        Student one = new Student();
        Student two = one;
        one.name = "POOJITH";
        System.out.println(two.name);
        final int INCREASE = 2;
//        INCREASE = 3;
        System.out.println(INCREASE);

        A obj;
        for(int i=0;i<1000000000;i++){
            obj = new A("Poshith");
        }

    }

   static class Student{
        int rno=15;
        String name = "Poshith Kumar";
        float marks = 35.01f;

        Student(){
//            int rno=15;
//            String name = "Poshith Kumar";
//            float marks = 35.01f;
            this (15,"Poshith Kumar",35.79f);
        }

        Student(int rno,String name,float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        void greet(){
            System.out.println("Hello Welcome home "+name);
        }

        void change_name(String name){
            this.name = name;
        }

        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks=other.marks;
        }
    }
    static class A{

        String name = "Poshith Kumar";
        A(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
}

