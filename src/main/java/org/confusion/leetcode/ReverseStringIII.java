package org.confusion.leetcode;

public class ReverseStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        char[] array = s.toCharArray();
        int arrayLength = array.length;
        int i = 0, j = 0;

        for (int k = 0; k < arrayLength; k++) {
            if (array[k] == ' ' || array[k] == '\t' || array[k] == '\r' || array[k] == '\n') {
                /*if (i == 0) { // first whitespace
                    j = k - 1;
                    reverseString(array, i, j);
                } else if (i > 0) { //nth space
                    j = k - 1;
                    reverseString(array, i, j);
                }*/
                j = k - 1;
                reverse(array, i, j);
                i = k + 1;
            } else if (k == arrayLength - 1) {
                reverse(array, i, k);
            }
        }

        return new String(array);
    }

    public static void reverse(char[] array, int start, int end) {

        int midIndex = (start + end) / 2;
        int leftCounter = start, rightCounter = end;

        while (leftCounter <= midIndex && rightCounter >= midIndex) {
            char temp = array[leftCounter];
            array[leftCounter] = array[rightCounter];
            array[rightCounter] = temp;
            leftCounter++;
            rightCounter--;
        }
    }
}
