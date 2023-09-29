package com.hido.somethingtosave.datastructures.tree;

public class BinaryTree<T extends Comparable<T>> {
    public Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void add(T value) {
        root = addNode(root, value);
    }

    private Node addNode(Node node, T value) {
        if (node == null) {
            return new Node(value);
        }
        if (value.compareTo((T) node.value) < 0) {
            node.leftNode = addNode(node.leftNode, value);
        } else if (value.compareTo((T) node.value) > 0) {
            node.rightNode = addNode(node.rightNode, value);
        }
        return node;
    }
    public boolean search(T value){
        return searchNode(root, value);
    }
    private boolean searchNode(Node<T> node, T value){
        if(node == null){
            return false;
        }
        if (value.compareTo(node.value)==0){
            return true;
        }else if (value.compareTo(node.value)<0){
            return searchNode(node.leftNode, value);
        }else {
            return searchNode(node.rightNode, value);
        }
    }
}
