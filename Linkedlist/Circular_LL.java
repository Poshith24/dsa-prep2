package com.posh.Linkedlist;

public class Circular_LL {


    private int size;
    private Node head;
    private Node tail;

    public Circular_LL() {
        this.size = 0;
    }


    public void insertAtFirst(int val){
        Node node = new Node(val);
        if (size==0){
            head = node;
            tail = head;
        }
        else{
            node.next = head;
            head = node;
            tail.next = head;
        }
        size++;
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        if (size==0){
            insertAtFirst(val);
        }
        else{
            tail.next = node;
            tail = node;
            node.next = head;
        }
        size++;
    }

    public void insert(int val,int i){
        if (i==0){
            insertAtFirst(val);
        }
        else if (i==size){
            insertAtLast(val);
        }
        else{
            Node node = new Node(val);
            Node temp1 = get(i-1);
            Node temp2 = get(i);
            temp1.next = node;
            node.next= temp2;
        }
        size++;
    }

    public void deleteAtFirst(){
        if (size<=1){
            head =null;
            tail  = null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    public void deleteAtLast(){
        if(size<=1){
            deleteAtFirst();
        }
        else{
            Node node = get(size-2);
            tail = node;
            node.next = head;
        }
        size--;
    }
    public void delete(int i){
        if (i==0){
            deleteAtFirst();
        }
        else if (i==size-1){
            deleteAtLast();
        }
        else{
            Node temp1 = get(i-1);
            Node temp2 = get(i+1);
            temp1.next = temp2;
        }
        size--;
    }

    public Node get(int i){
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        do {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }while(temp!=head && temp!= null);
        System.out.println("END");
    }
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
