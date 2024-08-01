package com.posh;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        int[] arr = {4,5,27,25};
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            if(i==arr.length-1){
                ans[i] =-1;
            }
            boolean  flag = true;
            while(!stack.isEmpty() || flag){
                if(arr[i]<stack.peek()){
                    ans[i] = stack.peek();
                    stack.push(arr[i]);
                    flag= false;
                }
                else{
                    stack.pop();
                }
            }
            stack.push(arr[i]);

        }


    }
}
