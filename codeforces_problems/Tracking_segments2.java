package com.posh.codeforces_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tracking_segments2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            func(br);
        }
    }

    public static void func(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] lr = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            lr[i][0] = Integer.parseInt(st.nextToken());
            lr[i][1] = Integer.parseInt(st.nextToken());
        }
        int q = Integer.parseInt(br.readLine());
        int k = 1;
        boolean flag = true;
        int[] ind = new int[q];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < q; i++) {
            ind[i] = Integer.parseInt(st.nextToken());
        }
        while (k <= q && flag) {
            int index = ind[k - 1];
            int[] arr = new int[n];
            arr[index - 1] = 1;
            for (int i = 0; i < m; i++) {
                if (check(arr, lr[i][0], lr[i][1])) {
                    System.out.println(k);
                    flag = false;
                    break;
                }
            }
            k++;
        }
        if (flag) {
            System.out.println(-1);
        }
    }

    public static boolean check(int[] arr, int s, int e) {
        int count_ones = 0;
        for (int i = s - 1; i < e; i++) {
            count_ones += arr[i];
        }
        int count_zeros = e - s + 1 - count_ones;
        return count_zeros < count_ones;
    }
}
