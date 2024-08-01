package com.posh.Linkedlist;

public class Merge_LL {

    private Node head;
    private Node tail;

    private int size;

    public static void main(String[] args) {

        Merge_LL list1 = new Merge_LL();
        Merge_LL list2 = new Merge_LL();
//        Node list3 = mer;


        list1.insertAtFirst(4);
        list1.insertAtFirst(2);
        list1.insertAtFirst(1);

        list2.insertAtFirst(4);
        list2.insertAtFirst(3);
        list2.insertAtFirst(1);



    }

    public void insertAtFirst(int val){

        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;

        }
        size++;

    }

    public void display(){

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }


//    public Node mergeTwoLists(Node list1,Node list2){
//        Node t1 = list1;
//        Node t2 = list2;
//
//        Node t3;
//        Node head;
//        int size=0;
//
//        while(t1!=null & t2!=null){
//
//            if (size==0){
//                if(t1.val>=t2.val){
//                    t3 = t2;
//                    t2 = t2.next;
//                }
//                else{
//                    t3 = t1;
//                    t1 = t1.next;
//                }
//               head = t3;
//            }
//            else{
//                if(t1.val>=t2.val){
//                    t3.next = t2;
//                    t2 = t2.next;
//                }
//                else{
//                    t3.next = t1;
//                    t1 = t1.next;
//                }
//
//            }
//            size++;
//        }
//        return head;
//    }


    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
