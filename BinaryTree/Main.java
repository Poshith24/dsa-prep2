package com.posh.BinaryTree;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Scanner sc = new Scanner(System.in);
//        tree.populate(sc);
//        tree.prettydisplay();

        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int[] arr = {1,2,3,4,5,6,7};
        tree.populate(arr);
        tree.prettydisplay();
        tree.preorder_traversal();
//        tree.insert(2);
//        tree.insert(1);
//        tree.insert(15);
//        tree.insert(25);

//        tree.insert();
//        tree.insert();
////        tree.populate(sc);
//        tree.prettydisplay();
//        System.out.println();
//        tree.bfs();
//        tree.postorder_traversal();
//        System.out.println(tree.balanced());

        // checking for leaf budget
//        BinaryTree tree = new BinaryTree();
//        Scanner sc = new Scanner(System.in);
//        tree.populate(sc);
//        System.out.println(tree.getCount(tree.root,8));

//        AVL tree = new AVL();
//        for (int i = 0; i < 10; i++) {
//            tree.insert(i);
//        }
//        tree.prettydisplay();
//        System.out.println(tree.height());

//        BinaryTree tree = new BinaryTree();
//        int[] arr = {1,2,3,4,5,6,7};
//        tree.populate(arr);
//
//            BST tree = new BST();
////                int[] arr = {1,2,3,4,5,6,7};
////        tree.populate(arr);
//        System.out.println(tree.isSymmetric());
//        List<Integer> list = tree.rightSideView();
//        tree.prettydisplay();
//        List<List<Integer>> list = tree.zigzagLevelOrderdeq();
//        for (int i = 0; i < list.size(); i++) {
//            List<Integer> l = list.get(i);
//            for (int j = 0; j < l.size(); j++) {
//                System.out.print(l.get(j)+" ");
//            }
//            System.out.println();
//        }
//        next_pointer tree = new next_pointer();
//        tree.connect();

//        tree.constructTree(5);
//        tree.prettydisplay();



    }
}
