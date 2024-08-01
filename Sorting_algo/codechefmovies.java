package com.posh;
import java.util.*;
import java.lang.*;
import java.io.*;
public class codechefmovies {
    /* package codechef; // don't place package name! */

    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            movies();
        }
        static void movies(){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int[] count=new int[t];
            int i=0;
            while(i<t){
                int h=0;
                int n=sc.nextInt();
                int m=sc.nextInt();
                for(int k=0;k<m;k++){
                    if(k%2==0){
                        h++;
                    }
                }
                count[i]=h*n;
                i++;
            }
            int l=0;
            while(l<t){
                System.out.println(count[l]);
                l++;
            }
        }


}
