package com.hido.somethingtosave.datastructures.sort;
public  class Demo {
    public static void main(String[] args){

        Common common = new Common();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();

        int randomNumber = common.generateOneNumber(1, 100);
        int[] arr = common.generateRandomArray(randomNumber, 1, 100);
        System.out.print("\nRandom Number: " + randomNumber);
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


        System.out.print("\n====================================================================");
    }
}
