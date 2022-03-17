package org.confusion.completable;

import java.util.concurrent.CompletableFuture;

public class Learning3 {


    public static CompletableFuture<Integer> create(int number) {
        return CompletableFuture.supplyAsync(() -> number);
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Build Pipeline");
        sleep(1000);

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
