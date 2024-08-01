package com.posh.sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
//        int[] a = {3,5,9};
//        int[] b = {4,6,8};
//        System.out.println(Arrays.toString(merge(a,b)));
        int[] arr = {8,3,4,12,5,6};
        int[] a = Arrays.copyOfRange(arr,3,4);
//        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(merge_sort(arr)));
    }

    public static int[] merge_sort(int[] arr){
        if (arr.length<=1){
            return arr;
        }
        int mid =  arr.length/2;

        int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
//        System.out.print("right -> ");
//        System.out.println(Arrays.toString(right));
        int[] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
//        System.out.print("left -> ");
//        System.out.println(Arrays.toString(left));
        return merge(right,left);
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int x=0;
        int y =0;
        int k =0;
        int[] arr = new int[arr1.length+arr2.length];
        while(x!=arr1.length && y!= arr2.length){
            if(arr1[x]>=arr2[y]){
                arr[k] = arr2[y];
                y++;
            }
            else{
                arr[k] = arr1[x];
                x++;
            }
            k++;
        }
       if (x!=arr1.length){
           for (int i = x; i <arr1.length ; i++) {
               arr[k] = arr1[i];
               k++;
           }
       }
       else if (y!= arr2.length){
           for (int i = y; i <arr2.length ; i++) {
               arr[k] = arr2[i];
               k++;
           }
       }


        return arr;
    }
}
