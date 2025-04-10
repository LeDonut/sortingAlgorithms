package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 78, 3, 13, 52, 36, 57, 68, 79, 110, 131, 162, 133, 114, 15, 1, 3, 5, 2, 8, 3};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(numbers)));
    }
}