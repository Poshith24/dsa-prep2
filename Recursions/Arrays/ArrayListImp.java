package com.posh.Recursions.Arrays;

import java.util.ArrayList;

public class ArrayListImp {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,5};
        System.out.println(InsideList(arr,5,0));
    }

    static ArrayList<Integer> InsideList(int[] arr, int target , int i){
        ArrayList<Integer> list = new ArrayList<>();
        if (i==arr.length){
            return list;
        }
        if (arr[i]==target){
            list.add(i);
        }

        ArrayList<Integer> ansFromBelowCalls = InsideList(arr,target,i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
