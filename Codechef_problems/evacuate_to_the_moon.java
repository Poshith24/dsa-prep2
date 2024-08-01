package com.posh.Codechef_problems;

import java.util.Arrays;
import java.util.Scanner;

//  https://www.codechef.com/START95D/problems/MOONSOON
public class evacuate_to_the_moon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            Arrays.sort(b);
            int x =a.length-1;
            int y =b.length-1;
            long  ans =0;
            while(x>=0 && y>=0){
                long temp = (long)b[y]*h;
                if(temp>=a[x]){
                    ans+= (long)a[x];
                }
                else{
                    ans+=temp;
                }

                 x--;
                y--;
            }
            System.out.println(ans);
            i++;
        }
    }
}
