package org.confusion.leetcode;

import java.util.Arrays;

public class TwoSumInputArraySorted {

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(e -> System.out.print(e));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int length = numbers.length;
        int leftCounter = 0;
        int rightCounter = length - 1;

        while (leftCounter < rightCounter) {
            if (numbers[leftCounter] + numbers[rightCounter] > target) {
                rightCounter--;
            } else if (numbers[leftCounter] + numbers[rightCounter] < target) {
                leftCounter++;
            } else {
                result[0] = leftCounter + 1;
                result[1] = rightCounter + 1;
                break;
            }
        }

        return result;

    }
}
