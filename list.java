package com.posh;

public class list {
    public static void main(String[] args) {
        int[] arr1 = {5,8,20};
        int[] arr2 = {4,11,15};

        int[] res = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                res[k] = arr2[j];
                j++;
                k++;
            }
            else{
                res[k] = arr1[i];
                i++;
                k++;
            }
        }
        while(i<arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            res[k] = arr2[j];
            j++;
            k++;
        }
        for (int l = 0; l < res.length; l++) {
            System.out.println(res[l]+" ");
        }
    }
}
