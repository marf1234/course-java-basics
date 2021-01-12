package com.rakovets.course.java.core.practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapElements(array, j);
                }
            }
        }

        int[] ints = new int[5];
        Arrays.fill(ints, 555555);
        System.out.println(Arrays.toString(ints));

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }

    private static void swapElements(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}
