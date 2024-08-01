package com.posh.introduction_to_oops.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {


   private int[] data ; // You can't directly change it you can change it with via methods(get,set).

    private static int DEFAULT_SIZE =10;
    private int size =0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){

        if(this.isFull()){
            resize();
        }
        data[size]=num;
        size++;
    }
    public void remove(int k){

        int[] temp = new int[data.length];

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
        int[] temp = new int[2*data.length];
//        for (int i=0;i<data.length;i++){
//            temp[i]=data[i];
//        } // both are same;
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {

        return size==data.length;
    }

    @Override
    public String toString() {
//        return "CustomArrayList{" +
//                "data=" + Arrays.toString(data) +
//                ", size=" + size +
//                '}';
        return Arrays.toString(data);
    }

    public int size(){
        return size;
    }

    public int get(int i){
        return data[i];
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

    }
}
