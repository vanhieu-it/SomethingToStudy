package com.hido.somethingtostudy.JavaAndJava.P09_Generics.DemoGenerics;

public class FindMaxGenerics {
    public <T extends Comparable<T>> T findMax(T a, T b) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        return max;
    }
}
