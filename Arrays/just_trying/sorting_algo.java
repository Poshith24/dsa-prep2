package com.posh.Arrays.just_trying;

//import com.posh.Array;

import java.util.Arrays;

public class sorting_algo {
    public static void main(String[] args) {
        int[] arr ={2,1,3,5,4};

//        for(int i =0;i<arr.length-1;i++){
//            for(int j =i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }

//        for (int i =0;i<arr.length-1;i++){
//            int max_in = max_index(arr,arr.length-i);
//            int temp = arr[max_in];
//            arr[max_in]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//
//        }
//        System.out.println(Arrays.toString(arr));

//        for(int k =0;k<arr.length-1;k++){
//            int count =0;
//            for(int i =0;i<arr.length-k-1;i++){
//                int j = i+1;
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                    count++;
//                }
//            }
//            if(count ==0){
//                break;
//            }
//        }

//        for(int i=0;i<arr.length;i++){
//             boolean swapped = false;
//            for(int j=1;j<arr.length-i;j++){
//                if(arr[j-1]>arr[j]){
//                    int temp = arr[j-1];
//                    arr[j-1]=arr[j];
//                    arr[j]=temp;
//                     swapped=true;
//                }
//            }
//            if (!swapped){
//                break;
//            }
//
//        }
//        insertion_sort(arr);
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int max_index(int[] arr,int e ){
        int max = 0;
        for(int i =1;i<e;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void insertion_sort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j>0;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }

    static void cycle_sort(int[] arr){
        int s = 0;
        int e = arr.length-1;
//        while(s<=e){
//            if(arr[s]!=s+1){
//                swap(arr,s,arr[s]-1);
//            }
//            if(arr[e]!=e+1){
//                swap(arr,e,arr[e]-1);
//            }
//             if(arr[s]==s+1){
//                s++;
//            }
//             if(arr[e]==e+1){
//                e--;
//            }
//        }
        int i =0;
        while(i<arr.length){
            int correct_index = arr[i]-1;
            if(i!=correct_index){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }

        }
    }
}
