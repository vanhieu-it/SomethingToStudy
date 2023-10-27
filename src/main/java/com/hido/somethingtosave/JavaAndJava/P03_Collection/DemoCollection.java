package com.hido.somethingtosave.JavaAndJava.P03_Collection;

public class DemoCollection {
    public static void main(String[] args) {

        demoList();
        demoHashSet();
        demoSort();
    }

    static void demoList() {

        DemoList demoList = new DemoList();

        demoList.simpleForLoop();

        demoList.enhanceForLoop();

        demoList.iteratorLoop();

        demoList.lstIteratorLoop();

        demoList.listIteratorBackward();

        demoList.whileLoop();

        demoList.forEachLoopA();

        demoList.forEachLoopB();

        demoList.streamForEach();
    }

    static void demoHashSet() {
        DemoHashSet hs = new DemoHashSet();
    }

    static void demoSort() {
        DemoSort s = new DemoSort();
        s.sort();
    }
}
