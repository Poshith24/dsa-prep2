package com.posh.leetcode_problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


    class StackUsingQueue{
        private Queue<Integer> first;
        public StackUsingQueue(){
            first = new LinkedList<>();
        }

        public void push(int x) {
             first.add(x);
            for (int i = 0; i < first.size()-1; i++) {
                first.add(first.remove());
            }
        }

        public int pop() {
            return first.remove();
        }

        public int peek() {
           return first.peek();
        }
        public boolean empty() {
            return first.isEmpty();
        }
    }

