package com.posh.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(2);
        stack.push(23);
        stack.push(35);
        stack.push(81);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.dis);
        System.out.println(stack.pop());
//        stack.display();
    }
}
