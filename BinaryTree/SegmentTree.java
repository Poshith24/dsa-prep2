package com.posh.BinaryTree;

public class SegmentTree {

    public static void main(String[] args) {
        int[] arr ={3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println(tree.query(1,6));


//        tree.display();
//        System.out.println(tree.query(0,3));
//        tree.update(3,14);
//        System.out.println(tree.query(0,3));
//        tree.update(1,15);
//        System.out.println(tree.query(0,7));
    }


    private static class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;
        Node(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    private  Node root;

    public SegmentTree(int[] arr){

        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr,int s,int e){
        Node node = new Node(s,e);

        if(s==e){
           node.data=arr[s];
           return node;
        }
        int m = s+e>>1;
        node.left=this.constructTree(arr,s,m);
        node.right=this. constructTree(arr,m+1,e);
        node.data = node.left.data+node.right.data;
        return node;
    }

    public int query(int s,int e){
        return query(root,s,e);
    }

    private int query(Node a,int s,int e){
       int def =0;

        if(e<a.start || s>a.end){
            return def;
        }
        else if(a.start>=s && a.end<=e){
            return a.data;
        }

        return query(a.left,s,e)+query(a.right,s,e);

    }

    public void update(int i,int upd){
        root.data=update(root,i,upd);
    }

    private int update(Node a,int i,int upd){
        if(!(i>=a.start && i<=a.end)){
            return a.data;
        }
        if(a.start==i && a.end==i){
            a.data=upd;
            return a.data;
        }
        a.data= update(a.left,i,upd)+update(a.right,i,upd);
        return a.data;
    }


    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str="";
        if(node.left!=null){
            str=  "Range of ["+node.left.start+"-"+node.left.end+"] and the data "+node.left.data+"=> ";
            System.out.print(str);
        }
        else{
            System.out.print("NO left child =>");
        }

        str="Range of ["+node.start+"-"+node.end+"] and the data "+node.data;
        System.out.print(str);
        if(node.right!=null){
            str = "<= Range of ["+node.right.start+"-"+node.right.end+"] and the data "+node.right.data;
            System.out.print(str);
        }
        else{
            System.out.print("<= No right child");
        }
        System.out.println();
        if(node.left==null && node.right==null){
            return;
        }
        display(node.left);
        display(node.right);
    }
}
