package com.hido.somethingtosave.datastructures.sort;

public class HeapSort {
    static int total;
    public void swap(Comparable[] arr, int a, int b){
        Comparable temp= arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }

    public void heapify(Comparable[] arr, int i) {
        int left = i * 2;
        int right = i * 2 + 1;
        int grt = i;
        if (left <= total && arr[left].compareTo(arr[grt])>=0)
            grt = left;
        if (right <= total && arr[right].compareTo(arr[grt])>=0)
            grt = right;
        if (grt != i) {
            swap(arr, i, grt);
            heapify(arr, grt);
        }
    }

    public Comparable[] HeapSorting(Comparable[] arr) {
        int total = arr.length - 1;
        for (int i = total / 2; i >= 0; i--)
            heapify(arr, i);
        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
        return arr;
    }
}
