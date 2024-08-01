package com.posh.Arrays;

import java.util.Scanner;

public class codechef_palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i =0;
        while(i<t) {
            int n = sc.nextInt();
            String s = sc.next();
            long count = 0;
            for (int j = 0; j < s.length() / 2; j++) {
                if (s.charAt(j) != s.charAt(n - j - 1)) {
                    count++;
                }
                if (count > 1) {
                    System.out.println("YES");
                    break;
                }
            }
            if (count == 1) {
                System.out.println("NO");
            }
            if (count == 0) {
                System.out.println("YES");
            }
            i++;
        }
    }
}
