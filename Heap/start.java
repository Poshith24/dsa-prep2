package com.posh.Heap;
import java.util.*;

public class start {
    int[] arr = new int[5];
    ArrayList<Integer> list = new ArrayList<>();
    int size = 0;
    int sizel=0;

    public void insertion(int val){


        if(size==0){
            arr[1] = val;
            size++;
            return;
        }

        arr[size+1] = val;
        int i= size+1;
        while(i>1){
            int parent = i/2;
            if(arr[parent]>arr[i]){
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;
                i = parent;
            }
            else{
                break;
            }
        }
        size++;
    }

    public void insertionlist(int val){
        if(sizel==0){
            list.add(val);
            sizel++;
            return;
        }
        list.add(val);
        int i = sizel;
        while(i>0){
            int parent = i/2;
            if(list.get(parent)>list.get(i)){
                int temp= list.get(parent);
                list.set(parent,list.get(i));
                list.set(i,temp);
                i = parent;
            }
            else{
                break;
            }
        }
        sizel++;
    }

    public void deletionlist(){
        int ind = size-1;
        list.set(0,list.get(ind));
        list.set(ind,0);
        int i=0;
        size--;
        if(size==0){
            return;
        }
        while(i<size){

        }
    }

    public void displayl(){
        for (Integer i :
                list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void deletion(){
        arr[1] = arr[size];
        arr[size]= 0;
        int i =1;
        size--;
        if(size==1){
            return;
        }
        while(i<=size){
            boolean left = 2*i<=size;
            boolean right = 2*i+1<=size;
            int min = Integer.MIN_VALUE;
            if(right){
                if(arr[2*i]<arr[2*i+1]){
                    min = 2*i;
                }
                else{
                    min = 2*i+1;
                }
            }
            else if(!right&left){
                min = 2*i;
            }
            if(arr[i]>arr[min]){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                i = min;
            }
            else{
                break;
            }
        }

    }

    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
