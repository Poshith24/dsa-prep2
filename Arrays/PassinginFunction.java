package com.posh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {

        int[] arr={2,5,1,3,4};
        System.out.println(Arrays.toString(arr));
        func(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void func(int[] a)
    {
        a[1]=343;
    }
}
