package com.hido.somethingtostudy.datastructures.sort;

public class BubbleSort<T extends Comparable<T>> {
    public T[] BubbleSorting(T[] arr) {
        int lenght = arr.length;

        for (int i = 0; i < lenght; i++) {
            for (int j = 1; j < (lenght - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
