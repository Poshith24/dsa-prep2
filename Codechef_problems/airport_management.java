package com.posh.Codechef_problems;
// https://www.codechef.com/START98D/problems/AIRM

import java.util.HashMap;

public class airport_management {
    public static void main(String[] args) {

    }

    static int max(int[] arr){
        HashMap<Integer,Integer> result = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if (result.containsKey(arr[i])){
                result.put(arr[i],result.get(arr[i])+1);
            }
            else{
                result.put(arr[i],1);
            }
        }
        int max =0;
        for(Integer key: result.keySet()){
            max = max>=result.get(key)? max:result.get(key);
        }
         return max;
    }
}
