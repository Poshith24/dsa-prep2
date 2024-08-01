package com.posh.BinaryTree;

import java.util.*;

class BinaryTree {

    public BinaryTree(){

    }



    private static class Node{
        Node right;
        Node left;
        int val;
        Node(){}

        Node(int val){
            this.val= val;
        }
    }

    static Node root;

    static void populate(Scanner sc){
        System.out.println("Enter the value of root node ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }

    static void populate(Scanner sc,Node a){
        System.out.println("Do you want to add left of the node " +a.val);
//        boolean isleft = sc.nextBoolean();
        String isleft =sc.next();
        if(isleft.equals("y")){
            System.out.println("Enter the value for the left of the node "+a.val);
            int leftval = sc.nextInt();
            a.left=new Node(leftval);
            populate(sc,a.left);
        }

        System.out.println("Do you want to add right of the node " +a.val);
//        boolean isright = sc.nextBoolean();
        String isright = sc.next();
        if(isright.equals("y")){
            System.out.println("Enter the value for the right of the node "+a.val);
            int rightval = sc.nextInt();
            a.right=new Node(rightval);
            populate(sc,a.right);
        }
    }

    public static void display(){
        display(root,"");
    }

    private static void display(Node a,String indent){
        if(a==null){
            return;
        }
        System.out.println(indent + a.val);

        display(a.left,indent+"\t");
        display(a.right,indent+"\t");
    }

    public static void prettydisplay(){
        prettydisplay(root,0);
    }

    private static void prettydisplay(Node a,int level){

        if(a==null){
            return ;
        }

        prettydisplay(a.right,level+1);
        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+a.val);
        }
        else{
            System.out.println(a.val);
        }
        prettydisplay(a.left,level+1);
    }


    // leaf under budget
    public int getCount(Node node, int bud)
    {
        ArrayList<Integer> list = get_count_helper(node,1);
        Collections.sort(list);
        int sum =0;
        int count =0;
        for(Integer i: list){
            if(sum+i<bud && i!=0){
                sum+=i;
                count++;
            }
        }
        return count;
    }

    private ArrayList<Integer> get_count_helper(Node node,int count){
        if(node==null){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        if(node.right==null && node.left==null){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(count);
            return list;
        }


        count++;
            ArrayList<Integer> list1 = get_count_helper(node.left,count);
            ArrayList<Integer> list2 = get_count_helper(node.right,count);

        list2.addAll(list1);
        return list2;


    }

//    public void constructTree(double count){
//
//
//
//        this.root =  constructTree(root,count);
//    }
//
//    private Node constructTree(Node node,double count){
//        node = new Node();
//        if(count==0 ){
//            return null;
//        }
//        if(count>1){
//
//            node.val = 1;
//            count--;
//        }
//        else{
//            node.val = count;
//            count =0;
//        }
//        Node temp= new Node();
//        Node temp2 = new Node();
//
//        node.left = constructTree(temp,count/2);
//        node.right = constructTree(temp2 ,count/2);
//        return node;

//    }

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



}
