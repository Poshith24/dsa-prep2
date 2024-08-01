package com.posh.introduction_to_oops.Generics.comparing;

public class Student implements Comparable<Student> {

    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return
                 marks+" " + rollno ;

    }

    @Override
    public int compareTo(Student o) {
        System.out.println("It's running in compare to method.");
         int diff = (int)(this.marks-o.marks);

         return diff;
    }
}
