package com.posh.STR;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 25; i>=12; i--) {
            char ch =(char)('a'+i);
             series=series+ch;
        }
        System.out.println(series);
    }
}
