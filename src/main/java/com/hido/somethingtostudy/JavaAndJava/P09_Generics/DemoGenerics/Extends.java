package com.hido.somethingtostudy.JavaAndJava.P09_Generics.DemoGenerics;

public class Extends <T extends  Number>{
    T number;

    public Extends(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
