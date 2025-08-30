package org.example.multithreading;

import java.util.concurrent.*;

public class RunnableCallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable runnableTask = () -> System.out.println("Runnable executed!");
        Callable<String> callableTask = () -> "Callable result";
        System.out.println("Thread name:" +Thread.currentThread().getName());
        executor.submit(runnableTask); // returns Future<?> but always null
        System.out.println("Thread name:" +Thread.currentThread().getName());
        Future<String> future = executor.submit(callableTask);
        System.out.println("Thread name:" +Thread.currentThread().getName());
        System.out.println(future.get()); // "Callable result"
        System.out.println("Thread name:" +Thread.currentThread().getName());

        executor.shutdown();
    }
}
