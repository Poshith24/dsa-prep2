package com.posh.Heap;
import java.util.*;

public class heap<T extends Comparable<T>>{

    private ArrayList<T> list = new ArrayList<>();

    private void swap(int i,int j){
        T temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return 2*index+1;
    }
    private int right(int index){
        return 2*index+2;
    }


    public void insert(T val){
        list.add(val);
//        if(list.size()==1){
//            return;
//        }
        upheap(list.size()-1);
    }

    private void upheap(int i){
        if(i==0){
            return;
        }
        int p = parent(i);
        if(list.get(p).compareTo(list.get(i))>0){
            swap(p,i);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            new Exception("heap is empty!");
        }
        T val = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }



        return val;

    }

    private void downheap(int i) {
        int min = i;
        int left = left(i);
        int right = right(i);
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (min != i) {
            swap(min, i);
            downheap(min);

        }
    }

    public ArrayList<T> heapsort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }

        return data;
    }

    public void maxheap(int[] arr){

        int size = arr.length;
        int i = (size&1)==0?size/2-1:size/2;
        while(i>=0){
            int left = 2*i+1;
            int right = 2*i+2;
            int max =i;
            if(left<size && arr[left]>arr[max]){
                max =left;
            }
            if(right<size && arr[right]>arr[max]){
                max =right;
            }
            if(max!=i){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
            i--;

        }
    }


}
