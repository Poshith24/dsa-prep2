package com.posh.Codechef_problems;

import java.util.HashMap;
import java.util.Scanner;

public class Change_it {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            System.out.println(max(a));
            i++;
        }
    }

    static int max(int[] arr){
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(result.containsKey(arr[i])){
                result.put(arr[i],result.get(arr[i])+1);
            }
            else{
                result.put(arr[i],1);
            }
        }
        int max=0;
        for(Integer key: result.keySet()){
            if(result.get(key)>max){
                max = result.get(key);
            }
        }
        return arr.length-max;
    }
}
