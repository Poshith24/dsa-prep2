package com.posh;

import java.util.Arrays;

public class image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},
                         {1,0,1},
                         {0,0,0}};
//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length/2; j++) {
//                int temp=image[i][j];
//                int k= image[i].length-j-1;
//                image[i][j]=image[i][k];
//                image[i][k]=temp;
//            }
//        }
//
//
//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length; j++) {
//                image[i][j] ^= 1;
//            }
//        }

//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length; j++) {
//                System.out.println(image[i][j]);
//            }
//        }

//        for(int[] i : image){
//            System.out.println(Arrays.toString(i));
//        }



        for ( int[] row : image) {
            for (int j = 0; j < (image[0].length+1)/2; j++) {
                 int temp = row[j] ^ 1;
                 row[j] = row [image[0].length-j-1] ^ 1;
                 row[image[0].length-j-1] = temp;
            }
        }

        for(int[] i : image){
            System.out.println(Arrays.toString(i));
        }


    }
}
