package com.wryan;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new ExampleRunnable("one"));
        ex.execute(new ExampleRunnable("two"));
        ex.shutdown();
        try {
            ex.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("stopped waiting early");
            e.printStackTrace();
        }
    }
}
