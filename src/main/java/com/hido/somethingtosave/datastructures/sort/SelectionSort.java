package com.hido.somethingtosave.datastructures.sort;

import java.text.DecimalFormat;
import java.util.Random;

public class SelectionSort {
     public int[] SelectionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
