package com.posh.Stack;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {
        if(isFull()){
            int[] temp = new int[data.length*2];
            for(int j=0;j<data.length;j++){
                temp[j] = data[(front+j)%data.length];
            }
            front=0;
            end = data.length;
            data=temp;
        }
       return super.insert(item);
    }
}
