package com.posh.leetcode_problems;

public class Main {
    public static void main(String[] args) {
        StackUsingQueue queue = new StackUsingQueue();
        queue.push(24);
        queue.push(34);
        queue.push(18);
        System.out.println(queue.pop());
    }
}
