package com.posh.Linkedlist;
// https://leetcode.com/problems/reverse-linked-list-ii/description/
class Node {
    int val;
    Node next;
    Node() {}
     Node(int val) { this.val = val; }
     Node(int val, Node next) { this.val = val; this.next = next; }
}

class Solution {
    public Node reverseBetween(Node head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        if(left==right){
            return head;
        }

        Node leftnode = get(head,left);
        Node rightnode = get(head,right);

        Node first = get(head,left-1);
        Node last = rightnode.next;
        Node prev =first;
        Node p = leftnode;
        Node n = p.next;
        while(p!=last){
            p.next = prev;
            prev=p;
            p=n;
            if(n!=null){
                n=n.next;
            }
        }
        if(first!=null){
            first.next = rightnode;
        }
        leftnode.next = last;
        return head;
    }

    public Node get(Node head, int i){
        Node temp = head;
        if(i==0){
            return null;
        }
        while(i>1){
            temp = temp.next;
            i--;
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}

