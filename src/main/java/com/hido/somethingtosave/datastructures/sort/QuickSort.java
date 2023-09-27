package com.hido.somethingtosave.datastructures.sort;

public class QuickSort {
    public int[] QuickSorting(int[] arr, int low, int high) {
        if (low > high) return null;

        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                int temp = arr[i];
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
