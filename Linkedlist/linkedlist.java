package com.posh.Linkedlist;

import java.util.Arrays;

public class linkedlist {
    private Node head;
    private Node tail;

    private int size;

    public linkedlist() {
        this.size =0;
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

    public void insertAtLast(int val){

        Node node = new Node(val);
        if(tail!=null){
            tail.next = node;
            tail = node;
        }
        else{
            head = node;
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
            Node temp1 = head;

            Node node = new Node(val);
            int j=0;

            while(temp1!=null && j<i-1){
                temp1 = temp1.next;
                j++;
            }
            Node temp2 = temp1.next;

            temp1.next = node;
            node.next = temp2;

        }

        size++;
    }

    public Node[] splitListToParts(Node head, int k) {

        Node[] list = new Node[k];
        int length = length(head);
        Node p = head;
        int i=0;
        if(length<=k){
            while(p!=null){
                Node f = p.next;
                p.next = null;
                list[i++] = p;
                p=f;
            }
            int z = k-length;
            while(z-->0){
                list[i++]=null;
            }
        }
        else{
            int z = length-k;
            int[] arr = new int[k];
            Arrays.fill(arr,1+z/k);
            for (int j = 0; j < z%k; j++) {
                arr[j]+=1;
            }
            int j=0;
            while(p!=null){
                Node f = get(p,arr[j]);
                Node l = f.next;
                f.next=null;
                list[j++]=p;
                p=l;
            }
        }
        return list;


    }

    public Node get(Node p,int a){
        while(a-->1){
            p=p.next;
        }
        return p;
    }



    public int length(Node temp){
        int count=0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
