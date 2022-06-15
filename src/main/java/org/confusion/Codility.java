package org.confusion;

import java.util.Arrays;

public class Codility {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}, new int[]{1, 2}));
    }

    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int arrayLength = A.length;
        int[] C = new int[arrayLength];
        int lowestElement = -1;
        int i = 0, j = 0, k = 0;

        while (i < arrayLength && j < arrayLength) {
            if (A[i] == B[j]) {
                C[k] = A[i];
            } else if (A[i] < B[j]) {
                C[k] = B[j];
                if (lowestElement == -1) {
                    lowestElement = A[i];
                } else if (lowestElement > A[i]) {
                    lowestElement = A[i];
                }
            } else if (A[i] > B[j]) {
                C[k] = A[i];
                if (lowestElement == -1) {
                    lowestElement = B[i];
                } else if (lowestElement > B[j]) {
                    lowestElement = B[j];
                }
            }

            i++;
            j++;
            k++;

        }

        if(lowestElement == -1){
            lowestElement = C[0];
            for(int z =1;z< arrayLength;z++){
                if(C[z] > lowestElement){
                    lowestElement = C[z];
                }
            }
            lowestElement = lowestElement+1;
        }

        return lowestElement;
    }
}
