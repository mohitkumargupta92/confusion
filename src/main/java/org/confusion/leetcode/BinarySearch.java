package org.confusion.leetcode;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 10));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int nums[], int start, int end, int target) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, mid + 1, end, target);
            } else {
                return binarySearch(nums, start, mid - 1, target);
            }
        }
        return -1;
    }

}
