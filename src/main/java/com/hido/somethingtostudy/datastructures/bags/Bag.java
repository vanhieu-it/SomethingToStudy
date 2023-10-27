package com.hido.somethingtostudy.datastructures.bags;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Element> implements Iterable<Element> {
    private Node<Element> firstElement;
    private int size;

    public Iterator<Element> iterator() {
        return new ListIterator<>(firstElement);
    }
    @SuppressWarnings("hiding")
    private class ListIterator<Element> implements Iterator<Element> {

        private Node<Element> currentElement;

        public ListIterator(Node<Element> firstElement) {
            currentElement = firstElement;
        }

        public boolean hasNext() {
            return currentElement != null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Element next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Element element = currentElement.content;
            currentElement = currentElement.nextElement;
            return element;
        }
    }


    private static class Node<Element>{
        private Element content;
        private Node<Element> nextElement;
    }

    public Bag() {
        firstElement = null;
        size = 0;
    }

    public boolean isEmpty(){
        return firstElement == null;
    }
    public int size(){
        return size;
    }

    public void add(Element element){
        Node<Element> oldfirst = firstElement;
        firstElement = new Node<>();
        firstElement.content = element;
        firstElement.nextElement = oldfirst;
        size++;
    }

    public boolean contains(Element element){
        for (Element vl : this){
            if(vl.equals(element)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Bag<String> bag = new Bag<>();
        bag.add("1");
        bag.add("2");
        bag.add("3");

        System.out.println("Size: " + bag.size());
        for (String s : bag){
            System.out.println(s);
        }
        System.out.println(bag.contains(null));
        System.out.println(bag.contains("1"));
        System.out.println(bag.contains("4"));
    }
}
