package com.dvoss;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Dan on 12/7/16.
 */

/*
    from horstmann / core java for the impatient
 */

public class Concur1 {

    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hello " + i);
            }
        };
        Runnable goodbyes = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Goodbye " + i);
            }
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
    }
}
