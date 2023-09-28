package com.hido.somethingtosave.datastructures.sort;

import java.text.DecimalFormat;
import java.util.Random;

public class Common {
    enum Display{IN, OUT;}

    public void displayToScreen(int value, int[] arr) {
        if (value == 0) {
            System.out.println("Before Sort:");
        } else {
            System.out.println("\nAfter Sort:");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public int[] generateRandomArray(int n, int min, int max) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            array[i] = randomNumber;
        }

        return array;
    }

    public int generateOneNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void displayExecutionTime(String sortName ,long executionTime) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("\n"+ sortName);
        if (executionTime < 1000) {
            System.out.println("Execution Time: " + executionTime + " nanosecond");
        } else if (executionTime < 1000000) {
            double microsecond = (double) executionTime / 1000;
            System.out.println("Execution Time: " + decimalFormat.format(microsecond) + " microsecond");
        } else if (executionTime < 1000000000) {
            double millisecond = (double) executionTime / 1000000;
            System.out.println("Execution Time: " + decimalFormat.format(millisecond) + " millisecond");
        } else if (executionTime < 60000000000L) {
            double second = (double) executionTime / 1000000000;
            System.out.println("Execution Time: " + decimalFormat.format(second) + " second");
        } else {
            double minute = (double) executionTime / 60000000000L;
            System.out.println("Execution Time: " + decimalFormat.format(minute) + " minute");
        }
    }
    public Comparable<Integer>[] toComparableArray(int[] intArray) {
        Comparable<Integer>[] comparableArray = new Comparable[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            comparableArray[i] = intArray[i]; // Auto-boxing: int to Integer
        }

        return comparableArray;
    }
}
