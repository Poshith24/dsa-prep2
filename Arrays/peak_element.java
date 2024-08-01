package com.posh.Arrays;

public class peak_element {
    public static void main(String[] args) {
        int[] arr = {4,3, 2, 1, 2, 3};
        System.out.println(findPeakElement(arr));
    }

    static int findPeakElement(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAc = arr[1] > arr[0];
        while (s <= e) {
            int m = s + e >> 1;
            if (m != 0 && m != arr.length - 1) {
                if (isAc) {
                    if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                        return m;
                    } else if (arr[m] > s) {
                        s = m;
                    } else if (arr[m] < e) {
                        s = m + 1;
                    }
                } else {
                    if (arr[m] < arr[m - 1] && arr[m] < arr[m + 1]) {
                        return m;
                    } else if (arr[m] < arr[s]) {
                        s++;
                    } else if (arr[m] < arr[e]) {
                        e--;
                    }
                }

            }

        }
        return -1;
    }

}
