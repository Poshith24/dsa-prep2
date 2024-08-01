package com.posh.leetcode_problems;

import java.util.Arrays;
import java.util.Stack;

// https://leetcode.com/problems/largest-rectangle-in-histogram/
public class histogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int[] max =new int[arr.length];
        Arrays.fill(max,0);
        Stack<Character> stack = new Stack<>();
        int[] left = previous(arr);
        int[] right = previousright(arr);
        for (int i = 0; i < arr.length; i++) {


                int ans =  (right[i]-left[i]-1)*arr[i];
                max[i] = ans>max[i]?ans:max[i];

        }
        Arrays.sort(max);
        System.out.println(max[arr.length-1]);
    }

    public static int[] previous(int[] arr){

        int[] ans = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }

        return ans;
    }

    public static int[] previousright(int[] arr){

        int[] ans = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = arr.length;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }

        return ans;
    }

    public static int left(int[] arr,int j){
        if(j==0){
            return 0;
        }
//        int ans =0;
        for (int i = j-1; i>=0 ; i--) {
            if(arr[i]<arr[j]){
                return i;
            }
        }
        return -1;
    }

    public static int right(int[] arr,int j){
        if(j==arr.length){
            return 0;
        }
        int ans=0;
        for (int i = j+1; i <arr.length ; i++) {
             if(arr[i]<arr[j]){
                 return i;
             }
        }
        return arr.length;
    }
}
