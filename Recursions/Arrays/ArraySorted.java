package com.posh.Recursions.Arrays;

public class ArraySorted {
        public static void main(String[] args) {
            int[] arr={1,8,3,4,5};
            System.out.println(IsSorted(arr,0));
        }
        static boolean IsSorted(int[] arr,int i){
            if (i==arr.length-1){
                return true;
            }
//        if (arr[i]>arr[i+1]){
//            return false;
//        }
//        return IsSorted(arr,i+1);
            return arr[i]<arr[i+1] && IsSorted(arr,i+1);
        }
}
