package com.posh.Linkedlist;

public class DLL {


    private Node head;
    private Node tail;
    private int size ;

    public DLL( ) {
        this.size = 0;
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
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayrev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        if (size==0){
            head = node;
            node.prev = null;
            node.next = null;
            tail = head;
        }
        else{
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void insertAtLast(int val){

        if (size==0){
            insertAtFirst(val);
        }
        else{
            Node node = new Node(val);
            tail.next = node;
            node.prev = tail;
            tail = node;
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
            temp2.prev = node;
            node.prev = temp1;
            node.next = temp2;
        }
        size++;
    }

    public void deleteAtFirst(){

        head = head.next;
        head.prev = null;
        if (size==1){
            tail = head;
        }
        size--;
    }

    public void deleteAtLast(){
        if (size==1){
            deleteAtFirst();
        }
        tail = tail.prev;
        tail.next = null;
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
            temp2.prev = temp1;
        }
        size--;
    }

    public Node find(int v){
        Node node = head;
        while(node!=null ){
            if (node.val==v){
                return node;
            }
            node = node.next;
        }
        return node;
    }





    class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
