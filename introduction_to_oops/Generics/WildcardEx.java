package com.posh.introduction_to_oops.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// here T should be either Number or its subclasses.

public class WildcardEx<T extends Number> {


   private Object[] data ; // You can't directly change it you can change it with via methods(get,set).

    private static int DEFAULT_SIZE =10;
    private int size =0;

    public WildcardEx() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){ // ? extends Number in this case we can pass Number type or subclasses of Number type.acka
        // do something..


        // here you can only pass Number type.
    }

    public void add(int num){

        if(this.isFull()){
            resize();
        }
        data[size]=num;
        size++;
    }
    public void remove(int k){

        Object[] temp = new Object[data.length];

        for(int i=0;i<data.length-1;i++){
            if(i>=k){
                temp[i]=data[i+1];
            }
            else{
                temp[i]=data[i];
            }
        }
        data=temp;
        size--;
    }

    private void resize() {
        Object[] temp = new Object[2*data.length];
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        } // both are same;
//        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {

        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
//        return Arrays.toString(data);
    }

    public int size(){
        return size;
    }

    public T get(int i){
        return (T)data[i];
    }

    public void set(int i,int num){
        data[i] = num;
    }


    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(15);
        list.add(27);
        list.remove(0);
//        System.out.println(list);
//        list.get(0);
        System.out.println(list.get(0));
//        list.set(1,253);
//        list.trimToSize();
        list.isEmpty();

        WildcardEx<Integer> list3 = new WildcardEx<>();
        list3.add(232);
        for (int i=0;i<14;i++){
            list3.add(2 * i);
        }

        System.out.println(list3);
//        list3.add("alkdjfalk")

    }
}
