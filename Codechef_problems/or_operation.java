package com.posh.Codechef_problems;

import java.util.Scanner;

// https://www.codechef.com/START73D/problems/APPENDOR
public class or_operation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int y = sc.nextInt();
            int z=0;
            long ans =-1;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                z= z | a;
            }


            for(int i =0;i<y;i++){
                z = z| i;
                if (z==y){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);


            t--;
        }

    }




}
