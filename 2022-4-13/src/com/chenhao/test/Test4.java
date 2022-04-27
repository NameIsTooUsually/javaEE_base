package com.chenhao.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                3,
                60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue(5));

        pool.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        //pool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        //pool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        //pool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10; i++) {
            pool.submit(new Tesk(i));
        }
        pool.shutdown();
    }
}

class Tesk implements Runnable {
    int i;

    public Tesk(int i) {
        this.i = i;
    }

    public Tesk() {
    }

    @Override
    public void run() {
        System.out.println("线程[" + Thread.currentThread().getName() + "执行了任务" + i);
    }
}