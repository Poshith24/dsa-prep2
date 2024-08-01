package com.posh.Stack;

import java.util.*;

public class Inbuiltexample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(98);
        stack.push(34);
        stack.push(12);
        stack.push(82);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack);


        Queue<Integer> queue = new LinkedList<>();

        queue.add(89);
        queue.add(12);
        queue.add(69);
        queue.add(25);
        queue.add(38);

        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();


    }
}
