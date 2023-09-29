package com.hido.somethingtosave.datastructures.sort;

public class Demo {
    public static void main(String[] args) {

        Common<Integer> common = new Common<>();
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        QuickSort<Integer> quickSort = new QuickSort<>();
        HeapSort<Integer> heapSort = new HeapSort<>();

        int randomNumber = common.generateOneNumber(10, 20);
        Integer[] arr = common.generateRandomArray(randomNumber, 1, 1000);
        System.out.print("\nRandom Number To Sort: " + randomNumber);
        common.displayToScreen(Common.Display.IN.ordinal(), arr);

        System.out.print("\n============================================================================================================\n");

        long startTimeBS = System.nanoTime();
        Integer[] arrayBS = bubbleSort.BubbleSorting(arr);
        long endTimeBS = System.nanoTime();
        common.displayExecutionTime("Bubble Sorting", endTimeBS - startTimeBS);
        common.displayToScreen(Common.Display.OUT.ordinal(), arrayBS);

        System.out.print("\n============================================================================================================");
        long startTimeSS = System.nanoTime();
        Integer[] arraySS = selectionSort.SelectionSorting(arr);
        long endTimeSS = System.nanoTime();
        common.displayExecutionTime("Selection Sorting", endTimeSS - startTimeSS);
        common.displayToScreen(Common.Display.OUT.ordinal(), arraySS);

        System.out.print("\n============================================================================================================");
        long startTimeQS = System.nanoTime();
        Integer[] arrayQS = quickSort.QuickSorting(arr, 0, arr.length - 1);
        long endTimeQS = System.nanoTime();
        common.displayExecutionTime("Quick Sorting", endTimeQS - startTimeQS);
        common.displayToScreen(Common.Display.OUT.ordinal(), arrayQS);

        System.out.print("\n============================================================================================================");
        long startTimeHS = System.nanoTime();
        Integer[] arrayHS = heapSort.HeapSorting(arr);
        long endTimeHS = System.nanoTime();
        common.displayExecutionTime("Heap Sorting", endTimeHS - startTimeHS);
        common.displayToScreen(Common.Display.OUT.ordinal(),arrayHS);

        System.out.print("\n============================================================================================================");
    }
}
