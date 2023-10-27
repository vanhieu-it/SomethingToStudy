package com.hido.somethingtostudy.datastructures.sort;

public class SelectionSort<T extends Comparable<T>> {
    public T[] SelectionSorting(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            if (index != i) {
                T temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
