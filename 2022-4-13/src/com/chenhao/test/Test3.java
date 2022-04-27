package com.chenhao.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                5,
                2,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue(5));
        for (int i = 0; i < 20; i++) {
            try {
                pool.submit(()->{
                    /*for (int i1 = 0; i1 < 20; i1++) {
                        System.out.println(Thread.currentThread().getName()+"执行了");
                    }*/
                    System.out.println(Thread.currentThread().getName()+"执行了");

                });
            } catch (RejectedExecutionException e) {
                System.out.println("出现异常了");
            }
        }
        pool.shutdown();
    }
}
