package org.confusion.leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        Arrays.stream(nums).forEach(e -> System.out.print(e));
    }

    public static void rotate(int[] nums, int k) {
        int arrayLength = nums.length;
        k = k % arrayLength;

        if (k == 0) {
            return;
        } else {
            int[] tempArray = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                int index = (i + k) % arrayLength;
                tempArray[index] = nums[i];
            }

            for (int i = 0; i < arrayLength; i++) {
                nums[i] = tempArray[i];
            }
        }
    }
}
