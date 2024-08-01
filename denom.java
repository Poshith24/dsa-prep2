package com.posh;
import java.util.*;
public class denom {
    public static void main(String[] args) {

        int[] arr = {1,2,5};
        int target = 11;
        System.out.println(count(arr,target));

    }

    public static int count(int[] arr,int target){
        Arrays.sort(arr);
        int count =0;
        if(target ==0){
//            System.out.println(0);
            return 0;
        }
        for(int i= arr.length-1;i>=0;i--){
            int rem = target % arr[i];
            if(rem ==0){
                return (target/arr[i]) + count;
            }
            else{
                count += target/arr[i];
                target = rem;
            }
        }
        return -1;
    }

}
