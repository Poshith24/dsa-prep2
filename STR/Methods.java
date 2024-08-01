package com.posh.STR;


import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name="Poshith Kumar Hello everyone";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toCharArray());
        System.out.println("    Poshith Kumar   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
