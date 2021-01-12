package com.rakovets.course.java.core.practice;

public class Main {
    public static void main(String[] args) {
        int[] array = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7, -4, -2};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swapElements(array, i, minIndex);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void swapElements(int[] array, int i, int minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }
}
