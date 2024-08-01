package com.posh.introduction_to_oops.access;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    // finalize is used for garbage collection.

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }



    // It basically gives number representation of an obj. It varies with objects.
    // unique representation of an object via number.
    @Override
    public int hashCode() {
//        return super.hashCode();
        return num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    @Override
    public boolean equals(Object obj) {
        return  this.num == ((ObjectDemo)obj).num;
    }



    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(55);
        ObjectDemo obj2 = new ObjectDemo(55);



        if(obj==obj2){
            System.out.println("obj == obj2");
        }

        if(obj.equals(obj2)){
            System.out.println("obj equals to obj2");
        }

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj.getClass());

    }
}
