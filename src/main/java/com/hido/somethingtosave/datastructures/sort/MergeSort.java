package com.hido.somethingtosave.datastructures.sort;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {
    public T[] mergeSort(T[] array) {
        if (array.length <= 1) {
            return null;
        }
        int mid = array.length / 2;
        T[] leftArray = Arrays.copyOfRange(array, 0, mid);
        T[] rightArray = Arrays.copyOfRange(array, mid, array.length);
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
        return array;
    }

    private void merge(T[] array, T[] leftArray, T[] rightArray) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mergrIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
                array[mergrIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[mergrIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mergrIndex++;
        }
        while (leftIndex < leftArray.length) {
            array[mergrIndex] = leftArray[leftIndex];
            leftIndex++;
            mergrIndex++;
        }
        while (rightIndex < rightArray.length) {
            array[mergrIndex] = rightArray[rightIndex];
            rightIndex++;
            mergrIndex++;
        }
    }
}
