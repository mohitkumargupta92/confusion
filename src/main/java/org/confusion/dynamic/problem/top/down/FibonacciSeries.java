package org.confusion.dynamic.problem.top.down;

import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 100;
        int array[] = new int[n + 1];
        Arrays.fill(array, -1);
        array[0] = 0;
        array[1] = 1;

        System.out.print(calculate(array, n));
        System.out.println();
    }


    public static int calculate(int[] array, int n) {
        if (array[n] == -1) {
            array[n] = calculate(array, n - 1) + calculate(array, n - 2);
        }

        return array[n];

    }
}
