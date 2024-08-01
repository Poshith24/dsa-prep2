package com.posh.Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
//        start obj = new start();
//        obj.insertionlist(2);
//        obj.insertionlist(5);
//        obj.insertionlist(1);
//        obj.insertionlist(7);
//        obj.insertionlist(4);
//        obj.insertionlist(3);
//
//
//
////        obj.insertion
////        obj.deletion();
////        obj.deletion();
//        obj.displayl();

//        System.out.println(3&1);
//        heap<Integer> obj = new heap<>();
//        obj.insert(24);
//        obj.insert(33);
//        obj.insert(11);
//        obj.insert(98);
//        obj.insert(2);
//        ArrayList list = obj.heapsort();
//        System.out.println(list);

//        int[] arr = {4,1,3,2,16,9,10,14,8,7};
//        maxheap(arr);
//        System.out.println(Arrays.toString(arr));
        String s1 = "hello";
        String s2 = "hello";
//        s2.charAt(0)='c';

//        s2 = "hell";
        Long a = Long.valueOf(345678999);
        System.out.println(a.hashCode());

//        System.out.println(s1);
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        ArrayList<Integer> list = obj.list;
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());
//        System.out.println(obj.remove());



//        System.out.println(obj.sizel);
    }

    public static void maxheap(int[] arr){

        int size = arr.length;
        int i = ((size-1)&1)==0?size/2-1:size/2;
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
