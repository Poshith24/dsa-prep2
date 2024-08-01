package com.posh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizzare {
    public static void main(String[] args) throws IOException {
        // Creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        String[] pref = new String[5*n];
        String[] unpref = new String[5*n];
        int k=0,l=0;
        int i=1;
        while(i<= 2*n){
            String[] array;
            array = bi.readLine().split(" ");
            int z=1;

            int x = Integer.parseInt(array[0]);
            if (x==0){
                i++;
            }
            else{
                if (i%2!=0){
                    for (int j = 0; j < x; j++) {
                        pref[k] = array[z];
                        k++;
                        z++;
                    }
                }
                else{
                    for (int j = 0; j < x; j++) {
                        unpref[l] = array[z];
                        l++;
                        z++;
                    }
                }
                i++;
            }
        }
        String[] ans = new String[k+l];
        int ans_index=0;

        for (int j = 0; j < k; j++) {
            int count = 0;
            for (int m = 0; m < l; m++) {
                if (Objects.equals(pref[j], unpref[m])){
                    count=1;
                }
            }
            if (count==0){
                ans[ans_index]=pref[j];
                ans_index++;
            }
        }
//
        System.out.print(ans_index+" ");
        for (int j = 0; j < ans_index; j++) {
            System.out.print(ans[j]+" ");
        }
//        System.out.println(Arrays.asList(ans));
    }
}
