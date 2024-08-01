package com.posh.BinaryTree;

public class next_pointer {

    public next_pointer(){

    }
    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public  Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public void connect(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        root = connect(root);
    }

    public static Node connect(Node root) {
        if(root==null){
            return null;
        }

        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int n = q.size();
        //     for(int i=0;i<n;i++){
        //         if(q.peek().left!=null){
        //             q.add(q.peek().left);
        //         }
        //         if(q.peek().right!=null){
        //             q.add(q.peek().right);
        //         }
        //         if(i==n-1){
        //             q.remove().next =null;
        //         }
        //         else{
        //             q.remove().next = q.peek();
        //         }
        //     }
        // }

        Node curr = root;
        Node leftmost = root;
        while(leftmost.left!=null){
            curr.left.next = curr.right;
            if(curr.next!=null){
                curr.right.next = curr.next.left;
                curr = curr.next;
            }
            else{
                leftmost = leftmost.left;
                curr = leftmost;
            }
        }
        return root;
    }


}
