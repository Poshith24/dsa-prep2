package com.posh.Recursions.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,8};
        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(Search(arr,2,0));
//        System.out.println(boSearch(arr,25,0));
        System.out.println(search(arr,4,0,list));
    }

    static int Search(int[] arr,int target,int index){
        if (arr[index]==target){
            return index;
        }
        if (index==arr.length-1){
            return -1;
        }
        return Search(arr,target,index+1);
    }
    static boolean boSearch(int[] arr,int target,int index){
        return arr[index]==target || boSearch(arr,target,index+1);
    }

    static  ArrayList<Integer> search(int[] arr,int target,int index,ArrayList<Integer> list){

            if (arr[index]==target){
                list.add(index);
            }
            if (index==arr.length-1){
                return list;
            }
            return search(arr,target,index+1,list);
    }

    static ArrayList<Integer> InsideList(int[] arr,int target ,int i){
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
