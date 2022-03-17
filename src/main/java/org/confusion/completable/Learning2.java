package org.confusion.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Learning2 {


    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> future = new CompletableFuture<Integer>();
        future
                .thenApply(data -> data * 2)
                .thenApply(data -> data + 1)
                .thenAccept(data -> System.out.println(data));

        // present in java 9
//        future.orTimeout(4,1, TimeUnit.SECONDS);

        System.out.println("Build Pipeline");
        sleep(1000);
        future.complete(1000);

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
