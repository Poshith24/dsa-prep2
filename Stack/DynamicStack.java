package com.posh.Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // this will call CustomStack();
    }
    public DynamicStack(int size) {
        super(size); // this will call CustomStack();
    }

    @Override
    public boolean push(int item) {
         if(this.isFull()){
             //double the size of the array
             int[] temp = new int[data.length*2];
             for(int j=0;j<data.length;j++){
                 temp[j] = data[j];
             }
             data=temp;
         }
         return super.push(item);
    }
}
