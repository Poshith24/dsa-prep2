package com.posh.BinaryTree;

import java.util.Scanner;

class AVL {

    public AVL(){

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
    public int height(){
        return height(root);
    }

    private int height(Node n){
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
        node.height = Math.max(height(node.left),height(node.right)+1);
        return rotate(node);
//        return null;
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //lefty
            if(height(node.left.left)-height(node.left.right)>0){
               return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if(height(node.left)-height(node.right)<-1){
            //righty
            if(height(node.right.right)-height(node.right.left)>0){
               return leftRotate(node);
            }
            if(height(node.right.right)-height(node.right.left)>0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;
        c.height = Math.max(height(c.left),height(c.right)+1);
        p.height = Math.max(height(p.left),height(p.right)+1);
        return c;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        c.height = Math.max(height(c.left),height(c.right)+1);
        p.height = Math.max(height(p.left),height(p.right)+1);
        return p;
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
        preorder_traversal(root);
        System.out.print("null");
        System.out.println();
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


}
