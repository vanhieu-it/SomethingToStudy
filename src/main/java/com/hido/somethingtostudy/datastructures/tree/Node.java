package com.hido.somethingtostudy.datastructures.tree;

public class Node<T> {
    public T value;
    public Node<T> leftNode;
    public Node<T> rightNode;

    public Node(T value, Node<T> leftNode, Node<T> rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node(T value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }
}
