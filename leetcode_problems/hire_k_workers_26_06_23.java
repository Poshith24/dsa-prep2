package com.posh.leetcode_problems;

import java.util.PriorityQueue;

// https://leetcode.com/problems/total-cost-to-hire-k-workers/
public class hire_k_workers_26_06_23 {
    public static void main(String[] args) {
//        int[] arr = new int[]{50,80,34,9,86,20,67,94,65,82,40,79,74,92,84,37,19,16,85,20,79,25,89,55,67,84,3,79,38,16,44,2,54,58};
//        System.out.println(arr.length);

        System.out.println(ans(new int[]{17,12,10,2,7,2,11,20,8},3,4));
    }

    public static long ans(int[] costs,int k,int candidates){
        int i = 0;
        int j = costs.length - 1;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long ans = 0;
        while (k-- > 0) {
            while (pq1.size() < candidates && i <= j) {
                pq1.offer(costs[i++]);
            }
            while (pq2.size() < candidates && i <= j) {
                pq2.offer(costs[j--]);
            }

            int t1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                ans += t1;
                pq1.poll();
            } else {
                ans += t2;
                pq2.poll();
            }
        }
        return ans;
    }

    public static long totalcost(int[] arr,int k,int candidate){

        int i =0;
        long cost=0;
        while(i<k){
            int s = check_first(arr,candidate);
            int e = check_last(arr,candidate);
            if(arr[s]<=arr[e]){
                cost+=(long)arr[s];
                arr[s] = Integer.MAX_VALUE-1;
            }
            else{
                cost+=(long)arr[e];
                arr[e] = Integer.MAX_VALUE-1;
            }
            i++;
        }
        return cost;
    }

    public static int check_last(int[] arr, int candidate) {
        int i =arr.length-1;
        int j=0;
        int min=0;
        while(j<candidate && i>=0){
            if(arr[i]!=Integer.MAX_VALUE-1){
                if(arr[i]<arr[min]){
                    min = i;
                }
                i--;
                j++;
            }
            else{
                i--;
            }
        }
        return min;
    }

    public static int check_first(int[] arr, int candidate) {
        int i =0;
        int j=0;
        int min=0;
        while(j<candidate && i<arr.length-1){
            if(arr[i]!=Integer.MAX_VALUE-1){
                if(arr[i]<arr[min]){
                    min = i;
                }
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return min;
    }
}
