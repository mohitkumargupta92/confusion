package org.confusion.sort;

import java.util.Arrays;

public class BuildHeap {

    public static void main(String[] args) {
        int[] array = new int[]{30, 50, 10, 40, 20, 60, 70, 90, 80, 120, 100};
        for (int i = array.length / 2; i >= 0; i--) {
            heapify(array, i, array.length - 1);
        }
        Arrays.stream(array).boxed().forEach(element -> System.out.println(element));
    }

    public static void heapify(int arr[], int index, int lastIndex) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        // assume current index having max value
        int maxIndex = index;

        if (leftChildIndex <= lastIndex && arr[leftChildIndex] > arr[maxIndex]) {
            // if satisfy ass max index with left child
            maxIndex = leftChildIndex;

        }
        if (rightChildIndex <= lastIndex && arr[rightChildIndex] > arr[maxIndex]) {
            // if satisfy ass max index with left child
            maxIndex = rightChildIndex;
        }

        if (index != maxIndex) {
            // swap
            int temp = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] = temp;
            heapify(arr, maxIndex, lastIndex);
        }


    }


}
