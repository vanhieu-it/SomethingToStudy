package com.hido.somethingtostudy.datastructures.sort;

public class QuickSort<T extends Comparable<T>> {
    public T[] QuickSorting(T[] arr, int low, int high) {
        if (low > high) return null;

        int mid = low + (high - low) / 2;
        T pivot = arr[mid];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i].compareTo(pivot) < 0) i++;
            while (arr[j].compareTo(pivot) > 0) j--;
            if (i <= j) {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) arr = QuickSorting(arr, low, j);
        if (high > i) arr = QuickSorting(arr, i, high);

        return arr;
    }
}
