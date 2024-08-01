package com.posh.introduction_to_oops.access;

public class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass sub = new Subclass(15,"Poshith Kumar");

        System.out.println(sub.num);
    }
}

class SubSubclass extends Subclass{

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        SubSubclass obj = new SubSubclass(23,"Poshith");
        int n = obj.num;
    }

}

class Subclass2 extends A{

    public Subclass2(int num, String name) {
        super(num, name);
    }
    A obj3 = new A(17,"Posh");
    int s = obj3.num;

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(23,"Poshith");
        int n = obj.num;

        A obj2 = new A(15,"Poshith");
        int k = obj2.num;
    }
}
