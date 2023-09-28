package com.hido.somethingtosave.datastructures.sort;

public class Demo {
    public static void main(String[] args) {

        Common common = new Common();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        HeapSort heapSort = new HeapSort();

        int randomNumber = common.generateOneNumber(10000, 100000);
        int[] arr = common.generateRandomArray(randomNumber, 1, 1000000);
        System.out.print("\nRandom Number To Sort: " + randomNumber);
        //common.displayToScreen(Common.Display.IN.ordinal(), arr);

        System.out.print("\n====================================================================\n");

        long startTimeBS = System.nanoTime();
        int[] arrayBS = bubbleSort.BubbleSorting(arr);
        long endTimeBS = System.nanoTime();
        //common.displayToScreen(Common.Display.OUT.ordinal(), array);
        common.displayExecutionTime("Bubble Sorting", endTimeBS - startTimeBS);


        long startTimeSS = System.nanoTime();
        int[] arraySS = selectionSort.SelectionSorting(arr);
        long endTimeSS = System.nanoTime();
        //common.displayToScreen(Common.Display.OUT.ordinal(), array);
        common.displayExecutionTime("Selection Sorting", endTimeSS - startTimeSS);


        long startTimeQS = System.nanoTime();
        int[] arrayQS = quickSort.QuickSorting(arr, 0, arr.length - 1);
        long endTimeQS = System.nanoTime();
        //common.displayToScreen(Common.Display.OUT.ordinal(), array);
        common.displayExecutionTime("Quick Sorting", endTimeQS - startTimeQS);

        long startTimeHS = System.nanoTime();
        Comparable[] comparables = common.toComparableArray(arr);
        Comparable[] arrayHS = heapSort.HeapSorting(comparables);
        long endTimeHS = System.nanoTime();
        //common.displayToScreen(Common.Display.OUT.ordinal(), array);
        common.displayExecutionTime("Heap Sorting", endTimeHS - startTimeHS);

        System.out.print("\n====================================================================");
    }
}
