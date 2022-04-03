package org.confusion.sort;

import java.util.Arrays;

// Divide and Conquer Algo
// 3-major task
// Pivot Element (any element): Last Element
// Partition Function: All value less than pivot should come in left and greater element in right (in any order)
// apply above steps to sub-array
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 6, 7, 8, 5, 4, 3, 2, 9, 0};
        System.out.print("Input --->>\t");
        Arrays.stream(array).boxed().forEach(element -> System.out.print(element + "\t"));
        System.out.println();
        quickSort(array, 0, array.length - 1);
        System.out.print("Output --->>\t");
        Arrays.stream(array).boxed().forEach(element -> System.out.print(element + "\t"));

    }

    // 10, 1, 6, 7, 8, 5, 4, 3, 2, 9, 0
    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);

        }
    }

    // 10, 1, 6, 7, 8, 5, 4, 3, 2, 9, 0
    public static int partition(int arr[], int start, int end) {
        System.out.print("Low: " + start + " High: " + end + "  \t");
        int pivotIndex = end;
//        int i = start - 1;
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < arr[end]) {
//                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
//        i++;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[i];
        arr[i] = temp;
        Arrays.stream(arr).boxed().forEach(element -> System.out.print(element + "\t"));
        System.out.println();
        return i;

    }

}
