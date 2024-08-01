package com.posh.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = 0;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull( )){
            System.out.println("Stack is full!");
            return false;
        }

        data[ptr] = item;
        ptr++;

        return true;
    }

    public int pop() throws StackException {
        if(isEmpty( )){
            throw new StackException("Cannot pop from an empty stack coz stack lo em led ra badkaw");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack coz stack lo em led ra badkaw");
        }
        return data[ptr];
    }

    public void display() throws StackException {
        if(isEmpty()){
            System.out.println("[]");
        }
        else{
            System.out.print("[");
            for(int j=0;j<=ptr;j++){
                System.out.print(data[j]);

                if(j!=ptr) {
                    System.out.print(",");

                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public boolean isFull( ){
       return ptr == data.length;
    }
    public boolean isEmpty(){
        return ptr == 0;
    }

}
