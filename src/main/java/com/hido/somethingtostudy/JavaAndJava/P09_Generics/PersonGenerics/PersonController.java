package com.hido.somethingtostudy.JavaAndJava.P09_Generics.PersonGenerics;

import java.util.ArrayList;

public class PersonController<T> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T t) {
        list.add(t);
    }

    public void display() {
        for (T t : list) {
            System.out.println(t);
        }
    }
}
