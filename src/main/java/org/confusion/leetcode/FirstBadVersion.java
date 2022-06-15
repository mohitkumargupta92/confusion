package org.confusion.leetcode;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }


    public static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static boolean isBadVersion(int version) {
        return version == 4;
    }
}
