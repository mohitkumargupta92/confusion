package org.confusion.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

// In-place Sorting Algo
// efficient for sorting small no. of elements
// Best Case O(N)
// The Worst Case O(N*N)
public class InsertionSort {

    public static void main(String[] args) {
//        int[] array = new int[]{10, 5, 2, 3, 4, 9, 7, 8, 1, 6};
        int[] array = new int[]{40, 10, 50, 30, 20};
        String iterationResult = Arrays.stream(array).boxed()
                .map(element -> Integer.toString(element))
                .collect(Collectors.joining(", "));
        System.out.println(String.format("Input; Array Status: %s", iterationResult));
        Arrays.stream(insertionSort(array)).boxed().forEach(element -> System.out.println(element));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int index = i;
            while (index > 0 && array[index - 1] > value) {
                String iterationResult = Arrays.stream(array).boxed()
                        .map(element -> Integer.toString(element))
                        .collect(Collectors.joining(", "));
                System.out.println(String.format("Before Swapping Iteration -> i: %s, while loop index: %s, Array Status: %s", i, index, iterationResult));

                // swap
                int temp = array[index - 1];
                array[index - 1] = array[index];
                array[index] = temp;
                index--;

                iterationResult = Arrays.stream(array).boxed()
                        .map(element -> Integer.toString(element))
                        .collect(Collectors.joining(", "));
                System.out.println(String.format("After Swapping Iteration -> i: %s, while loop index: %s, Array Status: %s", i, index, iterationResult));
            }

        }
        return array;
    }
}
