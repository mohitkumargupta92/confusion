package org.confusion.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

// In-place Sorting Algo
// similar to the air bubble
// larger bubble will rise first
// in this largest element find its correct place in first iteration and so on
// Best Case: O(N)
// Worst Case: O(N*N)
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 2, 3, 4, 9, 7, 8, 1, 6};
//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String iterationResult = Arrays.stream(array).boxed()
                .map(element -> Integer.toString(element))
                .collect(Collectors.joining(", "));
        System.out.println(String.format("Input; Array Status: %s", iterationResult));
        Arrays.stream(bubbleSort(array)).boxed().forEach(element -> System.out.println(element));
    }

    public static int[] bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swappingRequired = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swappingRequired = true;
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

                String iterationResult = Arrays.stream(array).boxed()
                        .map(element -> Integer.toString(element))
                        .collect(Collectors.joining(", "));
                System.out.println(String.format("Iteration -> i: %s, j: %s; Array Status: %s", i, j, iterationResult));
            }
            if (swappingRequired == false) {
                System.out.println("Array is sorted, hence breaking out of loop");
                break;
            }
        }
        return array;
    }
}
