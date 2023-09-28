package com.hido.somethingtosave.datastructures.tree;

public class BST {
    public Node root;

    public BST() {
        root = null;
    }
    public void add(int value, Node rootClone){
        if (root == null){
            root = new Node(value, null, null);
            return;
        }
        if (value> rootClone.value){
            if (rootClone.rightNode == null){
                rootClone.rightNode= new Node(value,null,null);
            }else {
                add(value,rootClone.rightNode);
            }
        }
        if (value< rootClone.value){
            rootClone.leftNode = new Node(value, null,null);
        }else {
            add(value,rootClone.leftNode);
        }
    }
}
