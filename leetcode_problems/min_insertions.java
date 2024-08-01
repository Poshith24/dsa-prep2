package com.posh.leetcode_problems;

import java.util.Stack;

//  https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
public class min_insertions {
    public static void main(String[] args) {
        System.out.println(minInsertions("))))()))())"));
    }
    public static int minInsertions(String str) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else{
                if(i==str.length()-1){
                    if(stack.isEmpty()){
                        count+=2;
                    }
                    else{
                        stack.pop();
                        count++;
                    }
                }
                else{
                    if(str.charAt(i+1)==')'){
                        if(!stack.isEmpty()){
                            stack.pop();
                        }
                        else{
                            count++;
                        }
                        i++;
                    }
                    else{
                        if(!stack.isEmpty()){
                            stack.pop();
                            count++;
                        }
                        else{
                            count+=2;
                        }

                    }

                }
            }
        }
        return stack.size()*2+count;
    }
}
