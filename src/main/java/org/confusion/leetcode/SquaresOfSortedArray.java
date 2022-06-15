package org.confusion.leetcode;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        SquaresOfSortedArray obj = new SquaresOfSortedArray();
        Arrays.stream(obj.sortedSquares(new int[]{-4, -1, 0, 3, 10})).forEach(element -> {
            System.out.println(element);
        });
    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    public void mergeSort(int[] nums, int start, int end) {
        System.out.println("Start: " + start + " End: " + end);
        if (start < end) {
            int mid = (end + start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public void merge(int[] nums, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        k = 0;
        for (int n = start; n <= end; n++) {
            nums[n] = temp[k];
            k++;
        }
    }


}
