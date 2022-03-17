package org.confusion.completable;

import java.util.concurrent.CompletableFuture;

public class Learning1 {

    public static int compute() {
        System.out.println("From Compute, " + Thread.currentThread().getName());
//        sleep(100);
        if (true) {
            throw new RuntimeException("Go To Hell");
        }
        return 2;
    }

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> {
            return compute();
        });

    }

    public static void main(String[] args) throws Exception {
//        CompletableFuture<Integer> future = create();
        CompletableFuture<Integer> future = new CompletableFuture<Integer>();
        sleep(101);
        future
                .thenApply(data -> data * 10L) // equivalent to map in stream
                .exceptionally(throwable -> handleException2(throwable))
                .thenApply(data -> data * 10L)
                .thenAccept((data) -> printIt(data))
                .thenRun(() -> System.out.println("Done"))
                .exceptionally(throwable -> handleException(throwable));

//        future.complete(2);
        future.completeExceptionally(new RuntimeException("Hell is Near!!"));

    }

    private static Long handleException2(Throwable throwable) {
        System.out.println("Error: " + throwable);
        if (true) {
            throw new RuntimeException(throwable.getMessage());
        }
        return 2L;
    }

    private static <T> T handleException(Throwable throwable) {
        System.out.println("Error: " + throwable);
        throw new RuntimeException("Beyond All hope!!");
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
