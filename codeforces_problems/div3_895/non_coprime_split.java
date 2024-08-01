package com.posh.codeforces_problems.div3_895;

import java.util.*;

public class non_coprime_split {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            if (r <= 3) {
                System.out.println(-1);
            } else {
                if (l < r) {
                    if (r % 2 == 0) {
                        System.out.println(2 + " " + (r - 2));
                    } else {
                        r--;
                        System.out.println(2 + " " + (r - 2));
                    }
                } else {
                    long  z = prime(r);
                    if (z == r) {
                        System.out.println(-1);
                    } else {
                        System.out.println(z + " " + (r - z));
                    }
                }
            }
        }

    }

    public static long prime(long r){
        if((r&1)==0){
            return 2;
        }
        for (long i = 3; i*i<=r ; i++) {
            if(r%i==0){
                return i;
            }
        }
        return r;
    }


}
