package com.hido.somethingtosave.datastructures.tree;

import java.util.Random;

public class TreeDemo {
    public static void main(String[] args) {

        TreeTraversal treeTraversal = new TreeTraversal();
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        Random random = new Random();
        // Generate and add 10 random nodes to the tree
        for (int i = 0; i < 20; i++) {
            int value = random.nextInt(100);
            binaryTree.add(value);
        }
        System.out.print("\n=========================preOrderTraversal===========================================\n");
        treeTraversal.preOrderTraversal(binaryTree.root);
        System.out.print("\n=========================inOrderTraversal============================================\n");
        treeTraversal.inOrderTraversal(binaryTree.root);
        System.out.print("\n=========================postOrderTraversal==========================================\n");
        treeTraversal.postOrderTraversal(binaryTree.root);
        System.out.print("\n=========================search======================================================\n");
        int value = random.nextInt(100);
        boolean found = binaryTree.search(value);
        if (found) {
            System.out.print(value + " is exist");
        } else {
            System.out.print(value + " is not exist");
        }
        System.out.print("\n=====================================================================================\n");
    }
}
