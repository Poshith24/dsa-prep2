package com.posh.BinaryTree;

import java.util.*;
//import java.util.Queue;
import java.util.Scanner;

class BST {

    public BST(){

    }

    private static class Node{
        int val;
        int height;
        Node right;
        Node left;
        Node(){

        }
        Node(int val){
            this.val = val;
        }
    }

    static Node root;

    public int height(Node n){
        if(n==null){
            return -1;
        }
        return n.height;

    }
    public boolean isEmpty(){
        return root==null;
    }

//    public static void populate(Scanner sc){
//        System.out.println("Enter the value of root node ");
//        int val = sc.nextInt();
//        root = new Node(val);
//        populate(root,sc);
//
//    }
//
//    private static void populate(Node root,Scanner sc){
//        System.out.println("Enter the value you wish to insert");
//        int n = sc.nextInt();
////        if(root==null){
////
////        }
//        Node a;
//        a = root;
//        Node prev = new Node();
//        boolean leftcheck=false;
//        boolean rightcheck=false;
//        while(a!=null){
//            if(n>a.val){
//                if(a.right==null){
//                    prev =a;
//                    rightcheck = true;
//                }
//                a = a.right;
//            }
//            else{
//                if(a.left==null){
//                    prev =a;
//                    leftcheck = true;
//                }
//                a = a.left;
//            }
//        }
//
//        a = new Node();
//        a.val = n;
//       if(leftcheck){
//           prev.left = a;
//       }
//       if(rightcheck){
//           prev.right = a;
//       }
//
//        System.out.println("Do you want end the BST here");
//        boolean end = sc.nextBoolean();
//        if(!end){
//            populate(root,sc);
//        }
//    }

    public void populate(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            insert(nums[i]);
//        }
        populate(nums,0,nums.length-1);
    }

    public void populate(int[] nums,int s,int e){

        if(s==e){
            return;
        }
        int mid = s+e>>1;
        insert(nums[mid]);

        populate(nums,s,mid);
        populate(nums,mid+1,e);


    }

    public void insert(int val){

        root = insert(root,val);

    }

    private Node insert(Node node,int val){
        if(node==null){
            node = new Node();
            node.val = val;
            return node;
        }

        if(val<node.val){
            node.left = insert(node.left,val);
        }
        else{
            node.right = insert(node.right,val);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
//        return null;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(height(node.left)-height(node.right))<=1 && (balanced(node.right)&& balanced(node.left));
    }

    public static void prettydisplay(){
        prettydisplay(root,0);
        System.out.println();
    }

    private static void prettydisplay(Node a, int level){

        if(a==null){
            return ;
        }

        prettydisplay(a.right,level+1);
        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+a.val);
        }
        else{
            System.out.println(a.val);
        }
        prettydisplay(a.left,level+1);
    }


    // inorder traversal
    public void inorder_traversal(){
        inorder_traversal(root);
        System.out.print("null");
        System.out.println();
    }

    private void inorder_traversal(Node node){

        if(node==null){
            return;
        }
        inorder_traversal(node.left);
        System.out.print(node.val +"->");
        inorder_traversal(node.right);
        return;
    }


    // preorder traversal -> node -> node.left -> node.right

    public void preorder_traversal(){
//        preorder_traversal(root);
//        System.out.print("null");
//        System.out.println();
        Stack<Node> st = new Stack<Node>();
        preoder_traversal(root,st);
    }

    private void preorder_traversal(Node node){

        if(node==null){
            return;
        }
        System.out.print(node.val +"->");
        preorder_traversal(node.left);
        preorder_traversal(node.right);
        return;
    }

    private void preoder_traversal(Node node,Stack<Node> st ){
//        if(node==null){
//
//        }
        st.push(node);
        while(!st.isEmpty()){
            Node temp = st.pop();
            if(temp.right!=null){
                st.push(temp.right);
            }
            if(temp.left!=null){
                st.push(temp.left);
            }
            System.out.println(temp.val);
        }
    }

    public void postorder_traversal(){
        postorder_traversal(root);
        System.out.print("null");
        System.out.println();
    }

    private void postorder_traversal(Node node){

        if(node==null){
            return;
        }
        postorder_traversal(node.left);
        postorder_traversal(node.right);
        System.out.print(node.val +"->");
        return;
    }


    // bfs- breadth first search

    public void bfs(){
        System.out.print(root.val +"->");
        bfs(root);
        System.out.print("null");
    }

    private void bfs( Node node){
        Queue< Node> q = new LinkedList<>();
        q.add(node.left);
        q.add(node.right);
        while(!q.isEmpty()){
            if(q.peek().left!=null){
                q.add(q.peek().left);
            }
            if(q.peek().right!=null){
                q.add(q.peek().right);
            }
            System.out.print(q.peek().val+"->");
            q.poll();
        }
    }

    public static List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                list.add(q.peek().val);
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                q.remove();
            }
            res.add(list);
        }

        return res;
    }

    public static int levelorder_successor(Node root,int target){
        if(root==null){
            return -1;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            for (int i = 0; i < n; i++) {

                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }

                if(q.peek().val == target){
                    q.remove();
                    if(q.peek()==null){
                        return -1;
                    }
                    return q.peek().val;
                }
                q.remove();
            }
        }
        return -1;

    }

    public static List<List<Integer>> zigzagLevelOrder(){
        return zigzagLevelOrder(root);

    }

    private static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<Node> q=new LinkedList<>();
        Stack<Node> s = new Stack<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty()){
            int n= q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(count%2==0){
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                        s.push(q.peek().left);
                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                        s.push(q.peek().right);
                    }
                    list.add(q.remove().val);
                }
                else{
                    if(q.peek().left!=null){
                        q.add(q.peek().left);
                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                    list.add(s.pop().val);
                    q.remove();
                }
            }
            res.add(list);
            count++;
        }


        return res;
    }

    public static List<List<Integer>> zigzagLevelOrderdeq(){
        return zigzagLevelOrderdeq(root);
    }

    private static List<List<Integer>> zigzagLevelOrderdeq(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<Node> dq = new ArrayDeque<>();

        dq.add(root);
        int count=0;
        while(!dq.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n= dq.size();
            for (int i = 0; i < n; i++) {
                if(count%2==0){
                    if(dq.peek().left!=null){
                        dq.addLast(dq.peek().left);
                    }
                    if(dq.peek().right!=null){
                        dq.addLast(dq.peek().right);
                    }
                    list.add(dq.removeFirst().val);
                }
                else{
                    if(dq.peekLast().right!=null){
                        dq.addFirst(dq.peekLast().right);
                    }
                    if(dq.peekLast().left!=null){
                        dq.addFirst(dq.peekLast().left);
                    }

                    list.add(dq.removeLast().val);
                }
            }
            res.add(list);
            count++;

        }


        return res;
    }
    public static List<Integer> rightSideView(){
        return rightSideView(root);
    }

    public static List<Integer> rightSideView(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }

        Deque<Node> dq = new LinkedList<>();
        dq.addFirst(root);
        while(!dq.isEmpty()){
            int n = dq.size();
            list.add(dq.peekLast().val);
            for(int i=0;i<=n;i++){
                if(dq.peekFirst().left!=null){
                    dq.addLast(dq.peekFirst().left);
                }
                if(dq.peekFirst().right!=null){
                    dq.addLast(dq.peekFirst().right);
                }
                dq.removeFirst();
            }
        }


        return list;
    }

    public static boolean isSymmetric(){
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node();
        root.left.right = new Node(3);
        root.right.left = new Node();
        root.right.right = new Node(3);





        return isSymmetric(root);
    }
    public static boolean isSymmetric(Node root) {


            if(root==null){
                return true;
            }

            Queue<Node> q  = new LinkedList<>();
            q.add(root.left);
            q.add(root.right);
            while(q.isEmpty()){
                Node l = q.remove();
                Node r = q.remove();
                if(l==null && r==null){
                    continue;
                }
                if(l==null || r==null){
                    return false;
                }
                if(l.val!=r.val){
                    return false;
                }
                q.add(l.left);
                q.add(r.right);
                q.add(l.right);
                q.add(r.left);
            }
            return true;

//        if(root==null){
//            return true;
//        }
//        Deque<Node> q = new LinkedList<>();
//        Stack<Node> s1 = new Stack<>();
//        Stack<Node> s2 = new Stack<>();
//
//
//        q.add(root);
//
//        while(!q.isEmpty()){
//            int n = q.size();
//            for(int i=0;i<n;i++){
//                if(q.peekFirst()!=null){
//                    q.addLast(q.peekFirst().left);
//                    q.addLast(q.peekFirst().right);
//                    s1.push(q.peekFirst().left);
//                    s1.push(q.peekFirst().right);
//                }
//                q.removeFirst();
//            }
//            n= s1.size();
//            int j=0;
////            if(s1==null){
////                break;
////            }
//            while(j<n/2){
//                s2.push(s1.pop());
//                j++;
//            }
////            if(s1.size()-s2.size()!=0){
////                return false;
////            }
//            j=0;
//
//            while(j<n/2) {
//
//                if (s1.peek() != null && s2.peek() != null) {
//                    if (s1.pop().val != s2.pop().val) {
//                        return false;
//                    }
//                }
//                else if((s1.peek()==null && s2.peek()!=null) || (s1.peek()!=null && s2.peek()==null)){
//                    return false;
//                }
//                else{
//                    s1.pop();
//                    s2.pop();
//                }
//                j++;
//            }
//            if(s1.size()>0 || s2.size()>0){
//                return false;
//            }
//
//
//
//        }
//        return true;
    }



}
