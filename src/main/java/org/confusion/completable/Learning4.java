package org.confusion.completable;

import java.util.concurrent.CompletableFuture;

public class Learning4 {


    public static CompletableFuture<Integer> create(int number, long duration) {
        System.out.println("Number: " + number + " Sleep: " + duration);
        sleep(duration);
        System.out.println("Number: " + number + " Sleep: " + duration + " Complete");
        return CompletableFuture.supplyAsync(() -> number);
    }

    public static CompletableFuture<Integer> create(int number) {
        return CompletableFuture.supplyAsync(() -> number);
    }

    public static CompletableFuture<Integer> inc(int number) {
        return CompletableFuture.supplyAsync(() -> number + 1);
    }

    public static void main(String[] args) throws Exception {
//        create(2, 10000).thenCombine(create(3, 1000), (result1, result2) -> result1 + result2)
//                .thenAccept((result) -> System.out.println(result));

        create(2)
                //.thenApply(data -> inc(data))
                .thenCompose(data -> inc(data))
                .thenAccept(result -> System.out.println(result));

        System.out.println("Build Pipeline");
        sleep(10000);

    }

    public static void printIt(double data) {
        System.out.println("From printIt, Data: " + data + " ," + Thread.currentThread().getName());
    }

    public static void sleep(long duration) {
        try {
            System.out.println("Going to sleep!" + " " + Thread.currentThread().getName());
            Thread.sleep(duration);
            System.out.println("Sleep Complete!!" + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
