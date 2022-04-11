package org.confusion.dynamic.problem.bottom.up;

import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        Arrays.stream(calculate(100)).forEach(element -> System.out.print(element + "\t"));
    }

    public static int[] calculate(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }
}
