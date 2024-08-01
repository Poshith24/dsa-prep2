package com.posh;
// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int a=splitArray(arr,2);
        System.out.println(a);
    }

    static int splitArray(int[] nums, int m) {
        int s=0;
        int e=0;

        for (int num : nums) {
            s = Math.max(s, num);
            e += num;
        }
        while (s<e){
            int mid=s+(e-s)/2;
            int sum=0;
            int pieces=1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else
                    sum += num;
            }
            if (pieces>m){
                s=mid+1;
            }
            else {
                e = mid;
            }
        }
        return s;
    }

}
