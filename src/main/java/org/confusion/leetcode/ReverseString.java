package org.confusion.leetcode;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public static void reverseString(char[] s) {

        int arrayLength = s.length;
        int midIndex = (0 + (arrayLength - 1 - 0)) / 2;
        int leftCounter = 0, rightCounter = arrayLength - 1;

        while (leftCounter <= midIndex && rightCounter >= midIndex) {
            char temp = s[leftCounter];
            s[leftCounter] = s[rightCounter];
            s[rightCounter] = temp;
            leftCounter++;
            rightCounter--;
        }


    }
}
