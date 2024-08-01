package com.posh.Stack;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;

    protected int end =0;
    protected int front =0;
    private int size =0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }


    public boolean isFull( ){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            return false;
        }
        else{
            data[end%data.length]=item;
            end++;
            size++;
        }
        return true;
    }

    public  int remove() throws Exception{
        int removed = data[front++];
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        else{
            front%=data.length;
            size--;
        }
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue lo em ledu bhayya");
        }
        return data[front];

    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue lo em ledu bhayya");
        }
        for (int i =front; i <end ; i++) {
            System.out.print(data[i%data.length]+"->");
        }
        System.out.println();
//        if(front%data.length<end%data.length){
//            for (int i = front; i < end; i++) {
//                System.out.print(data[i]+"->");
//            }
//            System.out.println();
//        }
//        else{
//            for (int i = front%data.length; i < data.length; i++) {
//                System.out.print(data[i]+"->");
//            }
//            for (int i = 0; i <end%data.length; i++) {
//                System.out.print(data[i]+"->");
//            }
//            System.out.println();
//        }

    }
}
