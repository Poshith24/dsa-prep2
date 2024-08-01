package com.posh.Linkedlist;

import java.util.ArrayList;

public class LL {


    private Node head;
    private Node tail;

    private int size;

    public LL() {
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


    public void insert_using_recursion(int val,int i){
        head = insert_using_recursions(val,i,head);
//        insert_using_recursion();
    }

    private Node insert_using_recursions(int val,int i,Node node){
        if (i==1){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insert_using_recursions(val,--i,node.next);
        return node;
    }
    public void deleteFirst(){
        Node temp = head;
        head = temp.next;
        if(size==1){
            tail = head;
        }
        size--;
    }

    public void deleteLast(){

        if(size<=1){
            deleteFirst();
        }
        else{
            Node node = get(size-2);
            tail = node;
            tail.next = null;
        }

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

    public Node get(int j){
        Node node =head;
        for(int i=0;i<j;i++){
            node = node.next;
        }
        return node;
    }


    public void delete(int i){
        if (i==0){

            Node temp = head;
            head = temp.next;
        }
        else{
            Node temp1=head;
            Node temp2=head;
            for (int j = 1; j <= i+1; j++) {
                if(j<=i-1){
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
            temp2.next = temp1;
            if (temp1==null){
                tail = temp2;
            }

        }
        size--;
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
    public void display(Node t){
        Node temp = t;

        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void insertRecmain(int i,int val){
       head = insertRec(i,val,head);
    }
    private Node insertRec(int i,int val,Node temp){
        if(i==0){
            Node node = new Node(val,temp);
//            node.next=temp;
            size++;
            return node;
        }
        temp.next= insertRec(--i,val,temp.next);
        return temp;
    }

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void deleteDuplicates(){
        if (head!=null){
            Node temp1 = head;
            Node temp2 = head;
            long count=1;
            while(temp1!=null && temp1.next !=null ){
                if(temp1==head){
                    if((temp1.next).val ==temp1.val){
                        temp1 = temp1.next;
                        head =temp1;
                        count++;
                    }
                    else{
                        if(count>1){
                            temp1 = temp1.next;
                            head = temp1;
                            count =0;
                        }
                        else{
                            temp1 = temp1.next;
                        }
                    }
                }
                else{
                    if((temp1.next).val ==temp1.val){
                        temp1 = temp1.next;
                        count++;
                    }
                    else{
                        if (count>1){
                            temp1 = temp1.next;
                            temp2.next = temp1;
                            count=0;
                        }
                        else{
                            temp2 =temp1;
                            temp1 = temp1.next;
                        }
                    }
                }
            }
        }
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/
    public Node merge_list(Node t1,Node t2){
        int merge_size=0;
        Node head = null;
        Node temp = null;
        while(t1!=null & t2!=null){
            if(merge_size==0){
                if(t1.val<=t2.val){
                    head=t1;
                    t1=t1.next;
                }
                else{
                    head=t2;
                    t2=t2.next;
                }
                temp = head;
                merge_size++;
            }
            else{
                if(t1.val<=t2.val){
                    temp.next=t1;
                    t1=t1.next;
                }
                else{
                    temp.next=t2;
                    t2=t2.next;
                }
                temp = temp.next;
            }
        }
        while(t1!=null){
            if(merge_size==0){
                head=t1;
                temp = head;
                merge_size++;
            }
            else{
                temp.next =t1;
                temp = temp.next;

            }
            t1=t1.next;
        }
        while(t2!=null){
            if(merge_size==0){
                head=t2;
                temp= head;
                merge_size++;

            }
            else{
                temp.next =t2;
                temp = temp.next;
            }
            t2=t2.next;
        }
        return head;


    }

    private static class Node{
        private int val;
        private Node next;
        public Node(){

        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // https://leetcode.com/problems/sort-list/

    public static Node merge(Node list1, Node list2){
        Node head = new Node();
        Node temp = head;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                temp.next =list2;
                list2=list2.next;
            }
            else{
                temp.next =list1;
                list1=list1.next;
            }
            temp = temp.next;

        }
        while(list1!=null){
            temp.next =list1;
            list1=list1.next;
            temp = temp.next;
        }
        while(list2!=null){
            temp.next =list2;
            list2=list2.next;
            temp = temp.next;
        }

        return head.next;
    }

      static Node mid(Node head){
        if(head==null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static  Node sortList(Node head){
        if(head ==null || head.next==null){
            return head;
        }
        Node middle = mid(head);
        Node middleforright = middle.next;
        middle.next=null;
        Node left = sortList(head);
        Node right = sortList(middleforright);
        return merge(left,right);
    }

    public static Node bubble_sort(Node head){
        if(head==null || head.next ==null){
            return head;
        }
        Node temp = null;
        Node node =head;

        while(node!=temp){
            Node t1=head;
            Node t2=t1.next;
            while(t2!=temp){
                if(t1.val>t2.val){
                    int value =t1.val;
                    t1.val=t2.val;
                    t2.val=value;
                }
                t1=t1.next;
                t2=t2.next;
            }
            temp=t1;
        }
        return head;
    }

    private Node rev_rec(Node node){
        if(node==tail){
             head=node;
             return tail;
        }
        else{
            node=node.next;
        }
        tail = rev_rec(node);
        tail.next=node;
        tail=node;
        tail.next=null;
        return tail;
    }

    private void rev_recursive(Node node){
        if(node==tail){
            head=node;
            return;
        }
//        else{
//            node=node.next;
//        }
        rev_rec(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
        return;
    }

    // https://leetcode.com/problems/reverse-linked-list-ii

    public static Node reverseBetween(Node head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        if(left==right){
            return head;
        }

        Node leftnode = get(head,left);
         Node rightnode = get(head,right);

        Node first = get(head,left-1);
        Node last=null;
        if(rightnode!=null){
              last = rightnode.next;

        }
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
        if(first==null){
            head = rightnode;
        }
        return head;
    }

    public static Node get(Node head, int i){
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

//    public static Node isPalindrome(Node head){
//        Node repl =  rev;
//
//
//
//        return repl;
//    }

    // palindrome list - https://leetcode.com/problems/palindrome-linked-list/
    public static boolean isPalindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp2 = head;
        while(temp2!=null){
            list.add(temp2.val);
            temp2=temp2.next;
        }
        Node temp = rev(head);
        int i=0;
        while(temp!=null){
            if(temp.val!=list.get(i)){
                return false;
            }
            i++;
            temp =temp.next;
        }
        return true;

    }
public static Node rev(Node head){
    while(head==null || head.next==null){
        return head;
    }
    Node prev = null;
    Node p = head;
    Node n = head.next;
    while(p!=null){
        p.next = prev;
        prev = p;
        p = n;
        if(n!=null){
            n=n.next;
        }
    }
    return prev;
}

//    public static Node beforemid(Node head){
//        if(head==null){
//            return head;
//        }
//        Node slow= head;
//        Node fast= head;
//        while(fast.next.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        return slow;
//    }

    // reorder list - https://leetcode.com/problems/reorder-list/
    public static void reorder(Node head){
        Node mid = mid(head);
        Node hf = head;
        Node hs = rev_from_mid(mid);
        while(hf!=null && hs!=null){
            Node temp = hf.next;
            hf.next = hs;
            hf=temp;
            temp = hs.next;
            hs.next = hf;
            hs=temp;
        }

        if(hf!=null){
                hf.next=null;
        }
//        else{
//            hf.next=null;
//        }
    }
    public static Node rev_from_mid(Node mid){
        Node prev = null;
        Node p = mid;
        Node n = mid.next;
        while(p!=null){
            p.next = prev;
            prev=p;
            p=n;
            if(n!=null){
                n=n.next;
            }
        }
        return prev;
    }

    // reverse k nodes - https://leetcode.com/problems/reverse-nodes-in-k-group
    public Node reverseKGroup(Node head, int k) {
            int z=0;
            Node temp = head;
            while(temp!=null){
                Node t2 = temp;
                int l =k;
                boolean flag=false;
                while(l>0){
                    if(temp==null){
                        flag=true;
                        break;
                    }
                    temp =temp.next;
                    l--;
                }
                if(!flag){
                    head = reverseBetween(head,z+1,z+k);
                }
                z+=2*k;
            }
            return head;
    }

    // rotae LL - https://leetcode.com/problems/rotate-list/

    public Node rotateRight(Node head, int k) {
            while(k>0){
                Node last = last(head,true);
                Node prev= last(head,false);
                last.next=head;
                head=last;
                prev.next=null;
                k--;
            }
            return head;
    }

    public Node last(Node head,boolean flag){
        Node temp = head;
        if(flag){
            while(temp.next!=null){
                temp = temp.next;
            }
        }
        else{
            while(temp.next.next!=null){
                temp = temp.next;
            }
        }

        return temp;
    }


    // https://leetcode.com/problems/add-two-numbers
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node l3 = new Node();
        Node node = new Node();
        node.val=Integer.MIN_VALUE;
        l3=node;
        int ones=0;
        int tens=0;
        int sum=0;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                sum = l1.val+l2.val;

            }
            else if(l1!=null){
                sum=l1.val;
            }
            else if(l2!=null){
                sum=l2.val;
            }
            if(tens==1){
                sum++;
                tens=0;
            }
            if(sum>9){
                ones=sum%10;
                if(tens==1){
                    ones++;
                }
                tens=1;
                sum=ones;
                l3.val=sum;
            }
            else{
                tens=0;
                l3.val=sum;
            }
            if(l1!=null && l2!=null){
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null){
                l1=l1.next;
            }
            else if(l2!=null){
                l2=l2.next;
            }
            if(l1!=null || l2!=null){
                Node temp = new Node();
                temp.val=Integer.MIN_VALUE;
                l3.next = temp;
                l3=l3.next;
            }
            else{
                if(tens==1){
                Node temp = new Node();
                temp.val=Integer.MIN_VALUE;
                l3.next = temp;
                l3=l3.next;

                    l3.val=1;
                }
            }
        }
        return node;

    }


    // swap nodes - https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

    public static int length(Node head){
        Node slow = head;
        int count =0;
        while(slow!=null){
            count++;
            slow=slow.next;
        }
        return count;
    }

    public static Node swapNodes(Node head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int count = length(head);

        Node fh;
        Node t1;
        Node fl;
        Node sl;
        Node t2;
        Node sh;
        if(k<=(count>>1)){
            fh = get(head,k-1);
            t1 = get(head,k);
            fl = get(head,k+1);
            head = rev(head);
            sl = get(head,k-1);
            t2 = get(head,k);
            sh = get(head,k+1);
            head = rev(head);


        }
        else{
            sh = get(head,k-1);
            t2 = get(head,k);
            sl = get(head,k+1);
            head = rev(head);
            fl = get(head,k-1);
            t1 = get(head,k);
            fh = get(head,k+1);
            head = rev(head);
        }

        if(t1.next==t2){
            if(t2.next==null){
                t2.next =t1;
                t1.next =null;
                head = t2;
            }
            else{
                fh.next = t2;
                t2.next = t1;
                t1.next =sl;
            }
        }
        else if(k==1 || k== count){
            t2.next = fl;
            sh.next=t1;
            t1.next = null;
            head = t2;
        }
        else if(sh==fl){
            fh.next = t2;
            t2.next = sh;
            sh.next = t1;
            t1.next = sl;
        }
        else{
            fh.next = t2;
            t2.next = fl;
            sh.next = t1;
            t1.next = sl;
        }
        return head;
    }

    // https://leetcode.com/problems/merge-k-sorted-lists/

//    public static Node mergeKlists(Node[] lists){
//
//    }

    public static Node mergetwo(Node s,Node e){
        Node t1 = s;
        Node t2 = e;
        Node t3 = new Node();
        Node head = t3;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t3.next = t1;
                t1=t1.next;
            }
            else{
                t3.next = t2;
                t2=t2.next;
            }
            t3=t3.next;
        }
        while(t1!=null){
           t3.next = t1;
            t1=t1.next;
            t3=t3.next;
        }

        while(t2!=null){
            t3.next =t2;
            t2=t2.next;
            t3=t3.next;
        }
        return head.next;
    }


    public static Node oddEvenList(Node head) {
        if(head==null | head.next==null | head.next.next==null){
            return head;
        }
        else{
            int count=1;
            Node t1 = head;
            Node t2 = head.next;
            Node eve = t2;
            Node t3 = head.next.next;
            while(t3!=null){
                if(count%2!=0){
                    t1.next = t3;
                    t1=t3;
                }
                else{
                    t2.next = t3;
                    t2=t3;
                }
                if(t3.next==null){
                    t1.next = eve;
                    t3=null;
                }
                else{
                    t3=t3.next;
                }

                count++;
            }
            t2.next =null;
        }
        return head;
    }

    public static int pairSum(Node head) {
        int max = Integer.MIN_VALUE+1;
        Node mid = rev_pairsum(mid_pairsum(head));
        Node temp = head;
        while(mid!=null){
            int x = temp.val;
            int y = mid.val;
            mid=mid.next;
            temp = temp.next;
            max = Math.max(x + y, max);

        }
        return max;
    }

    public static Node mid_pairsum(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node rev_pairsum(Node mid){
//        if(head==null || head.next ==null){
//            return head;
//        }
        Node prev = null;
        Node p= mid.next;
        Node n= p.next;
        while(p!=null){
            p.next = prev;
            prev =p;
            p =n;
            if(n!=null){
                n=n.next;
            }
        }
        mid.next=prev;
        return  prev;
    }






    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
        LL list3 = new LL();
//        list1.insertAtLast(0);
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        list1.insertAtLast(4);
//        list1.insertAtLast(5);
//        list1.insertAtLast(6);
//        list1.insertAtLast(7);
//        list1.insertAtLast(8);


        list2.insertAtLast(3);
        list2.insertAtLast(7);
        list2.insertAtLast(9);
        list2.insertAtLast(10);

//        list3.head = mergetwo(list1.head,list2.head);

//        list3.head = oddEvenList(list1.head);
        list1.display();
//        list3.head = pairSum(list1.head);
        list1.display();
        list3.display();


//        list1.insertAtLast(6);
//        list1.insertAtLast(6);
//
//        list1.insertAtLast(7);
//        list1.insertAtLast(8);
//        list1.insertAtLast(3);
//        list1.insertAtLast(0);
//        list1.insertAtLast(9);
//        list1.insertAtLast(5);

//        int count = 2;
//        System.out.println(count>>1);

//        list1.head = swapNodes(list1.head,4);
//        list1.display();

//        list1.insertAtLast(9);
//        list1.insertAtLast(9);
//        list1.insertAtLast(9);
//        list1.insertAtLast(9);
//        list1.insertAtLast(9);
//        list1.insertAtLast(9);
//        list1.insertAtLast(9);
//
//        list2.insertAtLast(9);
//        list2.insertAtLast(9);
//        list2.insertAtLast(9);
//        list2.insertAtLast(9);



//        list3.head = addTwoNumbers(list1.head,list2.head);
//        list3.display();



//        list1.insertAtLast(6);
//        list1.insertAtLast(7);
//        list1.insertAtLast(8);
//        list1.insertAtLast(9);





//        list1.head = list1.reverseKGroup(list1.head,2);
//        list1.display();

//        list1.head = list1.rotateRight(list1.head,4);
//        list1.display();

//        reorder(list1.head);
//        list1.display();

//        list1.insertAtLast(1);
//        list1.insertAtLast(18);
//        list1.insertAtLast(-3);
//        list1.insertAtLast(5);

//        list3.head = bubble_sort(list1.head);
//        list3.display();
//        list3.head = reverseBetween(list1.head,1,2);

//        System.out.println(isPalindrome(list1.head));


//        list1.display();
//        list2.display();
//        Node t1 = list1.head;
//        Node t2 = list2.head;
//
//        Node t = list3.merge_list(t1,t2);
//        list3.display(t);

    }
}
