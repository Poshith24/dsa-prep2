package com.posh.Stack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(21);
        queue.insert(3);
        queue.insert(45);
        queue.insert(89);
        queue.insert(115);



        queue.display();
        queue.insert(34);
        queue.insert(2938);
//        System.out.println(queue.remove());
//        queue.insert(35);
//
////        System.out.println();
//        System.out.println();
        queue.display();


    }
}
