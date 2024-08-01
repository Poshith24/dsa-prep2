package com.posh.Codechef_problems;

import java.util.Scanner;

public class prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int time = 0;
            long score = (long) x;
            long yz = (long) y;

            while (score < yz) {
                int sum = 0;
                if (score == 3 || score == 9) {
                    sum = 3;
                } else if (score == 7) {
                    sum = 7;
                } else {
                    sum = 2;
                }
                score += sum;
                time++;
            }
            System.out.println(time);
            i++;
        }
    }
}
