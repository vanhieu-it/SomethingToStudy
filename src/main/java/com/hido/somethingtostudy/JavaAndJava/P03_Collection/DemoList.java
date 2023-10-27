package com.hido.somethingtostudy.JavaAndJava.P03_Collection;

import java.util.*;

public class DemoList {
    private List<String> lstString;

    public DemoList(){
        lstString = new ArrayList<>();
        initListFromArray();
    }

    public void initListByAdd(){
        lstString.add("John");
        lstString.add("Jimmy");
        lstString.add("Henry");
    }
    public void initListFromArray() {
        lstString = Arrays.asList("John", "Jimmy", "Henry", "Tony", "Don", "Huang");
    }
    public void simpleForLoop() {
        System.out.println("=========\n1.Simple for loop");
        for (int i = 0; i < lstString.size(); i++) {
            System.out.println(i + " " + lstString.get(i));
        }
    }

    public void enhanceForLoop(){
        System.out.println("=========\n2. Enhance for loop");
        //Không cần biến đếm
        for(String item: lstString){
            System.out.println(item);
        }
    }
    public void iteratorLoop() {
        System.out.println("=========\n3. Iterator for loop");
        Iterator<String> iterator = lstString.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
    public void lstIteratorLoop(){
        System.out.println("=========\n4. List Iterator for loop");
        ListIterator<String> iterator = lstString.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void listIteratorBackward() {
        System.out.println("=========\n5. List Iterator backward loop");
        ListIterator<String> iterator = lstString.listIterator(lstString.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
    public void whileLoop(){
        System.out.println("=========\n6. While Loop");
        int i = 0;
        while (i < lstString.size()){
            System.out.println(lstString.get(i));
            i++;
        }
    }
    public void forEachLoopA(){
        System.out.println("=========\n7a. For Each Loop A");
        lstString.forEach(System.out::println);
    }
    public void forEachLoopB(){
        System.out.println("=========\n7B. For Each Loop B");
        lstString.forEach(item -> {
            System.out.println(item);
        });
    }
    public void streamForEach(){
        System.out.println("=========\n8. Stream For Each Loop");
        lstString.stream().forEach(item -> {
            System.out.println(item);
        });
    }
}
