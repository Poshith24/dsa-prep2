package com.posh.Linkedlist;

public class sort_List {



    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    ListNode merge_sort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = mid(head);
        ListNode left = merge_sort(head);
        ListNode right = merge_sort(mid);
        return merge(left,right);
    }

    ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    ListNode merge(ListNode list1,ListNode list2){
        ListNode head = new ListNode();
        ListNode temp = head;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                temp.next =list2;
                list2=list2.next;
            }
            else{
                temp.next =list1;
                list1=list1.next;
            }

        }
        while(list1!=null){
            temp.next =list1;
            list1=list1.next;
        }
        while(list2!=null){
            temp.next =list2;
            list2=list2.next;
        }

        return head.next;
    }
}
