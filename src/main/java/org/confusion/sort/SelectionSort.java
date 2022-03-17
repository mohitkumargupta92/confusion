package org.confusion.sort;

import java.util.Arrays;

// finding right place for position 1, then position 2
// find the right place for index 0, then 1 and so on
// in first iteration min element is placed at its correct place and so on.
// in (n-1)th iteration second last and last item are placed at correct position
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 2, 3, 4, 9, 7, 8, 1, 6};
        Arrays.stream(selectionSort(array)).boxed().forEach(element -> System.out.println(element));
    }

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // swap operation
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;

    }
}
