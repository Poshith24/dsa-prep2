package com.posh.introduction_to_oops.Properties.Polymorphism;

public class ObjectPrinting {

    int num;

    public ObjectPrinting(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrinting{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {

        ObjectPrinting obj  = new ObjectPrinting(289);

        System.out.println(obj);

    }
}
