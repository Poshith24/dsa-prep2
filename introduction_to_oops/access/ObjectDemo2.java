package com.posh.introduction_to_oops.access;

public class ObjectDemo2 {

    int num;
    float x;

    public ObjectDemo2(int num,float x) {

        this.num = num;
        this.x =x;
    }

    public ObjectDemo2() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        return this.num == ((ObjectDemo2)obj).num;
//        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo2 obj = new ObjectDemo2(23,25.3f);
        ObjectDemo2 obj2 = new ObjectDemo2(23,35.4f);
        ObjectDemo2 obj3 = obj;

        System.out.println(obj instanceof Object);

        if(obj.equals(obj2)){
            System.out.println("obj equals to obj2");
        }



        System.out.println(obj.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj.getClass());// you can get class name.
        System.out.println(obj.getClass().getName());

//        System.out.println(obj.equals(obj2));

    }
}
