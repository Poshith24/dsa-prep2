package com.posh.introduction_to_oops.access;

import java.util.Objects;

public class ObjectDemo3 {

    int num;

    public ObjectDemo3(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectDemo3)) return false;
        ObjectDemo3 that = (ObjectDemo3) o;
        return num == that.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public String toString() {
        return "ObjectDemo3{" +
                "num=" + num +
                '}';
    }

    public ObjectDemo3() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}
