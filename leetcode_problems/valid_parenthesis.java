package com.posh.leetcode_problems;

import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
    }

    public static int minAddToMakeValid(String s) {
        int count =0;
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty() || !(stack.pop()=='(') ){
                    count++;
                }
            }
        }
        return count+stack.size();
    }

    public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        System.out.println(stack.size());
        for(int i=0;i<s.length();i=i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(ch==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else  if(ch=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(ch==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
