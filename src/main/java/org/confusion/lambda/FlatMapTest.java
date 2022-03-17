package org.confusion.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        System.out.println(list);

        list.stream()
                .flatMap(e -> Stream.of(fun2(e)))
                .forEach(e -> System.out.println(e));
    }

    public static int fun1(int number) {
        return number * 2;
    }

    public static Object[] fun2(int number) {
        return new Object[]{number + 1, number + 2};
    }
}
