package com.posh.Linkedlist;

public class LL2 {



    private Node head;
    private Node tail;
    private int size;

    public LL2(){
        this.size=0;
    }

    public void insertAtfirst(int val){
        Node node = new Node(val);
        if(head==null){
            tail=node;
        }
        node.next=head;
        head=node;
        size++;
    }

    public void insertAtlast(int val){
        Node node = new Node(val);
        if(tail==null){
            tail=node;
            head=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void insert(int val,int ind){
        if(ind==1){
            insertAtfirst(val);
        }
        else if(ind==size){
            insertAtlast(val);
        }
        else{
            Node node = new Node(val);
            Node temp1=head;
            Node temp2=head;
            for(int j=1;j<=ind-1;j++){
                temp1=temp1.next;
                if(j<=ind-2){
                    temp2=temp2.next;
                }
            }
            temp2.next = node;
            node.next=temp1;
        }
        size++;
    }

    public void deleteAtfirst(){
        Node node = head.next;
        head=node;
    }
    public void deleteAtlast(){
        Node node = get(size-1);
        node.next=null;
        if(head==null){
            deleteAtfirst();
        }
    }
    public void delete(int i){
        if(i==1){
            deleteAtfirst();
        }
        else if(i==size){
            deleteAtlast();
        }
        else{
            Node temp1 = get(i-1);
            Node temp2 = get(i+1);
            temp1.next = temp2;
        }
    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+"-> ");
            node=node.next;
        }
        System.out.println();
    }

    public Node get(int i){
        Node node = head;
        int j=1;
        while(node!=null & j<i){
            node=node.next;
            j++;
        }
        return node;
    }

    public void func(){
         func(head);
    }



    private void func(Node head){
        Node next = head.next;
        int length = length(head);
        Node temp1 = head;
        int i=0;
        if(length%2==0){
            length = length/2;
        }
        else{
            length = length/2+1;
        }
        while(i++<length){
            Node temp2 = lastnode(head,3);
            Node lastbefore = lastnode(head,2);

            temp1.next = temp2;
            if(next==temp2){
                temp2.next =null;
            }
            else{
                temp2.next = next;
                temp1= next;
                next = temp1.next;
                lastbefore.next =null;
            }


        }
    }

    private int length(Node temp){
        if(temp==null){
            return 0;
        }
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    private Node lastnode(Node temp,int index){

        if(temp==null){
            return null;
        }
        int i=0;
        while(temp.next!=null && i++<index){
            temp = temp.next;
        }
        return temp;

    }
    private class Node{
        private int val;
        private Node next;

       public Node(int val){
             this.val = val;
        }
        public Node(int val,Node next){
           this.val=val;
           this.next=next;
        }


    }


//    public static Node func(Node head){
//
//        int length = length2(head);
//        int[] arr = new int[length];
//        Node temp = head;
//        for (int i = 0; i < length; i++) {
//            arr[i] = temp.val;
//            temp = temp.next;
//        }
//        func2(arr,0,length-1);
//    }

//    private static Node func2(int[] arr,int s,int e){
//            if(s==e){
//                Node node;
//                node.data= arr[s];
//                return node;
//            }
//
//            int m = s+e>>1;
//            Node temp;
//            temp.data = arr[m];
//
//            temp.left  = func2(arr,s,m-1);
//            temp.right = func2(arr,m+1,e);
//            return temp;
//
//
//    }
//
//
//
//    private static int length2(Node temp){
//        if(temp==null){
//            return 0;
//        }
//        int count =0;
//        while(temp!=null){
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }



}
