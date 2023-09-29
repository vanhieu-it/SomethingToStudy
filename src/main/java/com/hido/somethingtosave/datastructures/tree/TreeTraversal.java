package com.hido.somethingtosave.datastructures.tree;

public class TreeTraversal<T> {
    //Pre-order traversal
    public void preOrderTraversal(Node<T> node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.leftNode);
            preOrderTraversal(node.rightNode);
        }
    }

    //In-order traversal
    public void inOrderTraversal(Node<T> node) {
        if (node != null) {
            inOrderTraversal(node.leftNode);
            System.out.print(node.value + " ");
            inOrderTraversal(node.rightNode);
        }
    }

    //Post-order traversal
    public void postOrderTraversal(Node<T> node) {
        if (node != null) {
            postOrderTraversal(node.leftNode);
            postOrderTraversal(node.rightNode);
            System.out.print(node.value + " ");
        }
    }

}
