package com.posh.Arrays.just_trying;

import java.util.Arrays;

public class change_array {
    public static void main(String[] args) {
        int[] nums ={1,5,7,2,3};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[1] = 92;
    }
}
