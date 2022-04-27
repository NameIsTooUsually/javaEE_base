package com.chenhao.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"执行了"+i);
            }
        });
        Thread.sleep(1000);
        executorService.submit(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"执行了"+i);
            }
        });

        executorService.shutdown();

        Thread t = new Thread();

    }
}
