package org.confusion.search;

import java.util.stream.IntStream;

public class BinarySearchImpl {

    public static void main(String[] args) {
        int arr[] = IntStream.rangeClosed(1, 15).toArray();
        System.out.println(binarySearch(arr, 0, arr.length - 1, 17));
    }

    public static boolean binarySearch(int arr[], int start, int end, int key) {
        if (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("Start: " + start + ", End: " + end + ", Mid: " + mid);
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                return binarySearch(arr, mid + 1, end, key);
            } else {
                return binarySearch(arr, start, mid, key);
            }

        }
        return false;
    }
}
