package com.posh.Linkedlist;

public class Cycle {


//      Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }


        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }

    public int lengthcycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                 int length=0;
                 ListNode temp =slow;
                 do{
                     temp=temp.next;
                     length++;
                 }while(temp!=fast);

                return length;

            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
