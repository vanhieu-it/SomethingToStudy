package com.hido.somethingtosave.datastructures.sort;

public class BubbleSort {
    public int[] BubbleSorting(int[] arr) {
        int lenght = arr.length;
        int temp = 0;

        for (int i = 0; i < lenght; i++) {
            for (int j = 1; j < (lenght - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
