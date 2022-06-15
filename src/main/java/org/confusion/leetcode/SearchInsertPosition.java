package org.confusion.leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }
    public static int searchInsert(int[] nums, int target) {

        return searchOrInsert(nums, 0, nums.length - 1, target);
    }

    public static  int searchOrInsert(int nums[], int start, int end, int target) {

        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return searchOrInsert(nums, mid + 1, end, target);
            } else {
                return searchOrInsert(nums, start, mid - 1, target);
            }
        }
        return start;
    }

}
